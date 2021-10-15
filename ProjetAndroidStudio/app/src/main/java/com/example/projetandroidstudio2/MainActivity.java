package com.example.projetappcour1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Bouton1;
    private Button Bouton2;
    private Button Bouton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bouton1 = (Button) findViewById(R.id.Bouton1);
        Bouton2 = (Button) findViewById(R.id.Bouton2);
        Bouton3 = (Button) findViewById(R.id.Bouton3);
    }

    @SuppressLint("ResourceAsColor")
    public void ChangeColor(View view) {
        Bouton1.setBackgroundColor(android.R.color.holo_orange_light);
        Bouton2.setBackgroundColor(android.R.color.holo_orange_light);
        Bouton3.setBackgroundColor(android.R.color.holo_orange_light);

    }

    public void replaySong(View view) {
        MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw._cri);
        ring.start();
    }
}