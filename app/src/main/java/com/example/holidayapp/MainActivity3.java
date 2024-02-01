package com.example.holidayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void location (View view) {
        String url = "https://maps.app.goo.gl/gGfnGLJmZTU5aUtx6";
        String keyword = url;
        Intent searchIntent = new Intent(Intent.ACTION_VIEW);
        searchIntent.setData(Uri.parse(keyword));

        startActivity(searchIntent);
    }
    public void bck (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}