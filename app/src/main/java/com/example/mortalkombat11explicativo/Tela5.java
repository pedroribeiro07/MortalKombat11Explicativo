package com.example.mortalkombat11explicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5 extends AppCompatActivity {

    Button buttonGameplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonGameplay = findViewById(R.id.buttonGameplay);
        buttonGameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri jogo = Uri.parse("https://www.youtube.com/watch?v=MiJUm-J68d8");
                Intent it = new Intent(Intent.ACTION_VIEW, jogo);
                startActivity(it);
            }
        });
    }
}