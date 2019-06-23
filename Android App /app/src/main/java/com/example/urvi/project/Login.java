package com.example.urvi.project;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
/**
 * Created by urvi on 6/10/18.
 */

public class Login extends AppCompatActivity {
    private Button button;
    private DatabaseReference myref;
    private Button buttona;
    private Button buttonb;
    private Button buttonc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        button=(Button) findViewById(R.id.button2);
        buttona=(Button) findViewById(R.id.button3);
        buttonb=(Button) findViewById(R.id.button4);
        buttonc=(Button) findViewById(R.id.button6);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();
                Intent intent=new Intent(Login.this,Resources.class);
                startActivity(intent);

            }
        });
        buttona.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.quora.com/profile/SAVE-Suicide-Awareness-Voices-of-Education"));
                startActivity(intent);

            }
        });
        buttonb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();
                Intent intent=new Intent(Login.this,help.class);
                startActivity(intent);

            }
        });
        buttonc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();
                Intent intent=new Intent(Login.this,appoint.class);
                startActivity(intent);

            }
        });

}
public static class Post {

        public String username;
        public String password;

        public Post(String author, String title) {

        }

    }

private void checkpost(){
   /* FirebaseDatabase database=FirebaseDatabase.getInstance();
    final DatabaseReference myref=database.getReference();
    final String title = user.getText().toString();
//    final String title1 = pass.getText().toString();
//        ma = FirebaseAuth.getInstance();
//        FirebaseUser user3=ma.getCurrentUser();
//        userid = user3.getUid();
//    FirebaseAuth.AuthStateListener malist = new FirebaseAuth.AuthStateListener() {
//
        //        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Post post = dataSnapshot.getValue(Post.class);

                System.out.println(post);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }*/
        }


        }




