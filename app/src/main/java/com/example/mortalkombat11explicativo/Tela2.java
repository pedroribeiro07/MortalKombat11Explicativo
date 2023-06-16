package com.example.mortalkombat11explicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}