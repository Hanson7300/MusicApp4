package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView playing = (TextView) findViewById(R.id.playing);
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView radio = (TextView) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

        TextView songInfo = (TextView) findViewById(R.id.songInfo);
        songInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songInfoIntent = new Intent(MainActivity.this, SongInfoActivity.class);
                startActivity(songInfoIntent);
            }
        });

        TextView buy = (TextView) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyIntent);
            }
        });

        TextView rankList = (TextView) findViewById(R.id.rankList);
        rankList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rankListIntent = new Intent(MainActivity.this, RankListActivity.class);
                startActivity(rankListIntent);
            }
        });

        TextView myPlayList = (TextView) findViewById(R.id.myPlayList);
        myPlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPlayListIntent = new Intent(MainActivity.this, MyPlayListActivity.class);
                startActivity(myPlayListIntent);
            }
        });

        TextView featured = (TextView) findViewById(R.id.featured);
        featured.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent featuredIntent = new Intent(MainActivity.this, FeaturedActivity.class);
                startActivity(featuredIntent);
            }
        });

        TextView settings = (TextView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}
