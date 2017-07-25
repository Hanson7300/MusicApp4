package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final Button playing = (Button) findViewById(R.id.toPlaying);


        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(SearchActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
