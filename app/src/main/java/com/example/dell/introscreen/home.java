package com.example.dell.introscreen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}



