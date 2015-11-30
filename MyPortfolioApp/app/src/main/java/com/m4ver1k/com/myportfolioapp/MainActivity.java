package com.m4ver1k.com.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my Spotify App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnScore = (Button) findViewById(R.id.btnScoresApp);
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnBuild = (Button) findViewById(R.id.btnBuild);
        btnBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my Built it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnXyz = (Button) findViewById(R.id.btnXyz);
        btnXyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my XYZ App", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnCap = (Button) findViewById(R.id.btnCapstore);
        btnCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
