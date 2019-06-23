package com.example.urvi.project;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by urvi on 7/10/18.
 */

public class music extends AppCompatActivity{
    private Button button;
    private DatabaseReference myref;
    private Button buttona;
    private Button buttonb;
    private Button buttonc;
    private Button buttond;
    private MediaPlayer mediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        button=(Button) findViewById(R.id.button12);
        buttona=(Button) findViewById(R.id.button13);
        buttonb=(Button) findViewById(R.id.button9);
//        buttonb=(Button) findViewById(R.id.button4);
//        buttonc=(Button) findViewById(R.id.button6);
//        buttond=(Button) findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);

        }

});
        buttona.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                mediaPlayer.stop();

                }
            }
        );
        buttonb.setOnClickListener(new View.OnClickListener(){

                                       @Override
                                       public void onClick(View view) {

                                           Intent intent=new Intent(music.this,Login.class);
                                           startActivity(intent);

                                       }
                                   }
        );

}}
