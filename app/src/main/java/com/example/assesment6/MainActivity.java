package com.example.assesment6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer play1;
    //for playing the music
    public void play (View view)
    {
        play1.start();
    }

    //for pausing the music
    public void Pause (View view)
    {
        play1.pause();
    }
    //for stoping the music
    public void Stop (View view)
    {
        play1.stop();
    }
    MediaPlayer play2;
    public void Play2 (View view)
    {
        play2.start();
    }
    public void pause2 (View view){
        play2.pause();
    }
    public void Stop2 (View view)
    {
        play2.stop();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play1 = MediaPlayer.create(this,R.raw.song);
        play2 = MediaPlayer.create(this,R.raw.senorita);
        play1.setNextMediaPlayer(play2);
    }
}