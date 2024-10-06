package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //creating intent
        Intent ihome = new Intent(splash.this, MainActivity.class);
        //handler is a function/method used to add time delays
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ihome);//starting intent
                finish();
            }
        },1700);

    }
}