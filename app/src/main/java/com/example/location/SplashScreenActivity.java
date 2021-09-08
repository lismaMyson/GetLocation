package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {
    private static final Integer HANDLER_TIME = 1500;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        context=this;
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            finish();
            startActivity(new Intent(context, MainActivity.class));
        }, HANDLER_TIME);
    }
}