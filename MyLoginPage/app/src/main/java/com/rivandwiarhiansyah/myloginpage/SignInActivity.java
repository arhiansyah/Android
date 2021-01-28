package com.rivandwiarhiansyah.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SignInActivity extends AppCompatActivity {

    FloatingActionButton telepon,fb,google;
    float v=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        fb = findViewById(R.id.fab_facebook);
        telepon = findViewById(R.id.fab_telepon);
        google = findViewById(R.id.fab_google);

        fb.setTranslationY(300);
        telepon.setTranslationY(300);
        google.setTranslationY(300);

        fb.setAlpha(v);
        telepon.setAlpha(v);
        google.setAlpha(v);

        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        telepon.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
    }
}