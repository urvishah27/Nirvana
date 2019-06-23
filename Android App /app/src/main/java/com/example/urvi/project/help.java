package com.example.urvi.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
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
 * Created by urvi on 7/10/18.
 */

public class help extends AppCompatActivity {
    private Button button;
    private DatabaseReference myref;
    private Button buttona;
    private Button buttonb;
    private Button buttonc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        buttona = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button3);
        buttonb = (Button) findViewById(R.id.button4);
        buttonc = (Button) findViewById(R.id.button6);

        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:02227546669"));
                if(callintent.resolveActivity(getPackageManager())!=null){


                startActivity(callintent);
            }
            else{
                    Log.e("error","can't resolve");
                }
        }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:18002738255"));
                if(callintent.resolveActivity(getPackageManager())!=null){


                    startActivity(callintent);
                }
                else{
                    Log.e("error","can't resolve");
                }
            }
        });
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:7893078930"));
                if(callintent.resolveActivity(getPackageManager())!=null){


                    startActivity(callintent);
                }
                else{
                    Log.e("error","can't resolve");
                }
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_DIAL);
                callintent.setData(Uri.parse("tel:18602662345"));
                if(callintent.resolveActivity(getPackageManager())!=null){


                    startActivity(callintent);
                }
                else{
                    Log.e("error","can't resolve");
                }
            }
        });


    }}
