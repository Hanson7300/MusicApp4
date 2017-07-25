package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        final Button songInfo = (Button) findViewById(R.id.toSongInfo);
        songInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songInfoIntent = new Intent(BuyActivity.this, SongInfoActivity.class);
                startActivity(songInfoIntent);
            }
        });
    }
}
