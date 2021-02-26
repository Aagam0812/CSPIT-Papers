package com.example.karnadevloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Developer_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_details);
        getSupportActionBar().setTitle("Developers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
