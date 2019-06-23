package com.example.urvi.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

//import com.google.firebase.quickstart.database.java.models.Post;
//import com.google.firebase.quickstart.database.java.models.User;
class User {

    private String username;
    private String password;
    private String age;
    public User(String fName, String lName, String age) {
        this.username = fName;
        this.password = lName;
        this.age=age;
    }
}

    public class MainActivity extends AppCompatActivity {
    private Button button;
    private DatabaseReference myref;
    private EditText user;
    private EditText pass;
    private EditText age;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // myref.setValue("hi");
//        FirebaseDatabase database=FirebaseDatabase.getInstance();
       // DatabaseReference myRef = database.getReference("msg").child("username");


        // myRef.setValue("Hello, World!");
//        DatabaseReference myRef = database.getReference("users");
//        myRef.child("user3").child("username").setValue("urv");
//        myRef.child("user3").child("password").setValue("123");
        button=(Button) findViewById(R.id.button);
        user = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        age= findViewById(R.id.editText4);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
               // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
                submitPost();
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });

}

    private void submitPost() {
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference myref=database.getReference();
        final String title = user.getText().toString();
        final String title1 = pass.getText().toString();
        final String title2=age.getText().toString();
        //System.out.println(title);
//        System.out.println(title1);
//        final User user=new User(title,title1);

        // Title is required

        // Disable button so there are no multi-posts
        myref.addValueEventListener(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        myref.child("users").child("user7").child("username").setValue(title);
                       myref.child("users").child("user7").child("password").setValue(title1);
                        myref.child("users").child("user7").child("age").setValue(title2);

//                        myref.child("users").push().child("username").setValue(title);
//                        myref.child("users").push().child("password").setValue(title);
                        //System.out.println("inserted");
//                        myref.child("users").child(usr).child("username").setValue(title);
//                        myref.child("users").child(usr).child("password").setValue(title1);



                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                }
        );}}


