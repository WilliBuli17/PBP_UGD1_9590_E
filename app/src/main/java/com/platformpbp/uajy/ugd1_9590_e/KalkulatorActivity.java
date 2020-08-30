package com.platformpbp.uajy.ugd1_9590_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorActivity extends AppCompatActivity {

    private EditText angka1,angka2;
    private Button btntambah, btnkurang, btnkali, btnbagi, btnKembali;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = (EditText) findViewById(R.id.inputan1);
        angka2 = (EditText) findViewById(R.id.inputan2);
        btntambah = (Button) findViewById(R.id.tambah);
        btnkurang = (Button) findViewById(R.id.kurang);
        btnkali = (Button) findViewById(R.id.kali);
        btnbagi = (Button) findViewById(R.id.bagi);
        btnKembali = (Button) findViewById(R.id.buttonKembali);
        hasil = (TextView) findViewById(R.id.output);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angka1.getText().length()>0) && (angka2.getText().length()>0))
                {
                    double angka_pertama = Double.parseDouble(angka1.getText().toString());
                    double angka_kedua = Double.parseDouble(angka2.getText().toString());
                    double result = angka_pertama + angka_kedua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Masukkan Inputan Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angka1.getText().length()>0) && (angka2.getText().length()>0))
                {
                    double angka_pertama = Double.parseDouble(angka1.getText().toString());
                    double angka_kedua = Double.parseDouble(angka2.getText().toString());
                    double result = angka_pertama - angka_kedua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Masukkan Inputan Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angka1.getText().length()>0) && (angka2.getText().length()>0))
                {
                    double angka_pertama = Double.parseDouble(angka1.getText().toString());
                    double angka_kedua = Double.parseDouble(angka2.getText().toString());
                    double result = angka_pertama * angka_kedua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Masukkan Inputan Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angka1.getText().length()>0) && (angka2.getText().length()>0))
                {
                    double angka_pertama = Double.parseDouble(angka1.getText().toString());
                    double angka_kedua = Double.parseDouble(angka2.getText().toString());
                    double result = angka_pertama / angka_kedua;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Masukkan Inputan Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KalkulatorActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}