package com.example.mortalkombat11explicativo;

import static java.util.Objects.requireNonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button botao, botao2, botao3, botao4, botao5, botao6;
    SwitchCompat switchMode;
    boolean nightMode;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = findViewById(R.id.curiosidades);


         botao.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Tela2.class);
                 startActivity(intent);

             }
         });
         botao2 = findViewById(R.id.Personagens);

         botao2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Tela3.class);
                 startActivity(intent);
             }

         });
        botao3 = findViewById(R.id.Jogadores);

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Tela4.class);
                startActivity(intent);

            }
        });
        botao4 = findViewById(R.id.MortalKomabat1);

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Tela5.class);
                startActivity(intent);

            }
        });
        botao5 = findViewById(R.id.endreco);

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri jogo = Uri.parse("https://www.mortalkombat.com/pt-br/purchase");
                Intent it = new Intent(Intent.ACTION_VIEW, jogo);
                startActivity(it);
            }
        });

        switchMode = findViewById(R.id.switchMode);

        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        nightMode = sharedPreferences.getBoolean("nightMode", false);

        if (nightMode){
            switchMode.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        switchMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nightMode){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("nightMode", false);
                }
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("nightMode", true);
                }
                editor.apply();
            }
        });
        botao6 = findViewById(R.id.localizacao);

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:41.881832,-87.623177?z=14");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);startActivity(mapIntent );
            }
        });

    }
}