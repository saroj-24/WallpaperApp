package com.example.wallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(Splashscreen.this,MainActivity.class);
               startActivity(intent);
           }
       },3000);
    }
}