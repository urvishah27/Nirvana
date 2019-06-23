package com.example.urvi.project;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

public class appoint extends AppCompatActivity {
    private Button button;
    private DatabaseReference myref;
    private Button buttona;
    private Button buttonb;
    private Button buttonc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appoint);
        button=(Button) findViewById(R.id.button14);
        buttona=(Button) findViewById(R.id.button9);
        buttona.setOnClickListener(new View.OnClickListener(){

                                       @Override
                                       public void onClick(View view) {

                                           Intent intent=new Intent(appoint.this,Login.class);
                                           startActivity(intent);

                                       }
                                   }
        );
        button.setOnClickListener(new View.OnClickListener(){

                                       @Override
                                       public void onClick(View view) {

                                           Toast.makeText(getApplicationContext(),"Your appointment is fixed with AASRA",Toast.LENGTH_SHORT);



                                       }
                                   }
        );
    }}
