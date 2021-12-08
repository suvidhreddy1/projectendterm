package com.example.endtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Handler h;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


            h=new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            },5000);
        }
}