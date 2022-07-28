package com.mo_samy.summary.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.mo_samy.summary.R;

public class SplashActivity extends AppCompatActivity {
    private Button btnSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btnSkip = findViewById(R.id.skip_splash);
        btnSkip.setOnClickListener(view -> {
            startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        });
    }
}