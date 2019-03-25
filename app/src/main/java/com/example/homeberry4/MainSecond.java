package com.example.homeberry4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainSecond extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent seconIntent = new Intent(MainSecond.this, MainHome.class);
                startActivity(seconIntent);
                finish();
            }

        }, SPLASH_TIME_OUT );
    }
}
