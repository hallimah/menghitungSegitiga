package com.example.menghitungsegitiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputAlas;
    EditText inputTinggi;
    Button btnHitung;
    TextView tvHasil;
    Spinner spinnerPilihan;
    String[] pilihan = {"Luas Segitiga", "Keliling Segitiga"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAlas = findViewById(R.id.input_alas);
        inputTinggi = findViewById(R.id.input_tinggi);
        btnHitung = findViewById(R.id.btn_Hitung);
        tvHasil = findViewById(R.id.tv_hasil);
        spinnerPilihan = findViewById(R.id.spinner_pilihan);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinnerPilihan.getSelectedItem().toString().equals(pilihan[0])){
                    //rumus luas
                    rumusLuas();
                }else if(spinnerPilihan.getSelectedItem().toString().equals(pilihan[1])){
                    //rumus keliling
                    rumusKeliling();
                }
            }

        });

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, pilihan);
        spinnerPilihan.setAdapter(adapter);
    }

    private void rumusKeliling() {
        Double alas = Double.valueOf(inputAlas.getText().toString());
        Double tinggi = Double.valueOf(inputTinggi.getText().toString());
        Double hasil = alas + tinggi;
        tvHasil.setText(hasil.toString());
    }

    private void rumusLuas() {
        Double alas = Double.valueOf(inputAlas.getText().toString());
        Double tinggi = Double.valueOf(inputAlas.getText().toString());
        Double hasil = alas * tinggi / 2;
        tvHasil.setText(hasil.toString());

    }
}
