package com.platformpbp.uajy.ugd1_9590_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMenu;
    private RadioGroup radioGroup;
    private RadioButton profil, kalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = (Button) findViewById(R.id.buttonPilihMenu);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        profil = (RadioButton) findViewById(R.id.Profil);
        kalkulator = (RadioButton) findViewById(R.id.Kalkulator);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pilihan();
            }
        });
    }

    private void Pilihan() {
        if(profil.isChecked()){
            Intent i = new Intent(MainActivity.this, ProfilActivity.class);
            startActivity(i);
        }
        else if(kalkulator.isChecked()){
            Intent i = new Intent(MainActivity.this, KalkulatorActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "Tidak Ada Yang Dipilih", Toast.LENGTH_SHORT).show();
        }
    }
}