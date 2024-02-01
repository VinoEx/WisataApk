package com.example.holidayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void View (View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

        Toast.makeText(this, "Opening the view", Toast.LENGTH_SHORT).show();
    }
    public void Location (View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        Toast.makeText(this, "Opening the Location", Toast.LENGTH_SHORT).show();
    }
    public void Story (View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        Toast.makeText(this, "Opening the Story", Toast.LENGTH_SHORT).show();
    }
        public void rating (View view) {
        String url = "https://www.tripadvisor.co.id/ShowUserReviews-g294230-d8519849-r685104709-Bukit_Bintang-Yogyakarta_Region_Java.html#REVIEWS";
        String keyword = url;
        Intent searchIntent = new Intent(Intent.ACTION_VIEW);
        searchIntent.setData(Uri.parse(keyword));

        startActivity(searchIntent);
            Toast.makeText(this, "Opening the Rating", Toast.LENGTH_SHORT).show();
    }
}