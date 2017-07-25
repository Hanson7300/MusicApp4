package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        final Button playing = (Button) findViewById(R.id.toSongInfo);


        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(PlayingActivity.this, SongInfoActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
