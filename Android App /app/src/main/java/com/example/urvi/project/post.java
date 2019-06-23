package com.example.urvi.project;
import android.content.Intent;
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
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

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
 * Created by urvi on 7/10/18.
 */

public class post extends AppCompatActivity {
    private Button button;
    private DatabaseReference myref;
    private Button buttona;
    private Button buttonb;
    private Button buttonc;
    private ImageSwitcher sw;
    private int i=0;
    private static final int[] imgs={
            R.drawable.download,R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.downlod,R.drawable.faith,R.drawable.gvbeach,R.drawable.images
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        sw=(ImageSwitcher)findViewById(R.id.imageSwitcher);
        button=(Button) findViewById(R.id.button10);
        buttona=(Button) findViewById(R.id.button11);
        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageview=new ImageView(getApplicationContext());
                imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageview;
            }
        });
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();

                sw.setImageResource(imgs[i]);
                if(i==(imgs.length))
                    i=1;
                else
                    i++;


            }
        });
        buttona.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //final User user=new User("test","test2");
                // myref.child("users").child("user2").setValue(user);
                //System.out.println("inserted");
//                submitPost();
                Intent intent=new Intent(post.this,Login.class);
                startActivity(intent);



            }
        });
    }}