package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);

        final Button myPlayList = (Button) findViewById(R.id.toMyPlayList);


        myPlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playListIntent = new Intent(SongInfoActivity.this, MyPlayListActivity.class);
                startActivity(playListIntent);
            }
        });
    }
}
