package com.rizkykhapidsyah.p_gridview__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView TV_TextView_IDJAVA;
    public static String EXTRA_NAMA_KOTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TV_TextView_IDJAVA = findViewById(R.id.TV_TextView_IDXML);

        String Nama = getIntent().getStringExtra(EXTRA_NAMA_KOTA);
        String Teks = "Anda Memilih Kota : " + Nama + ".";

        TV_TextView_IDJAVA.setText(Teks);
    }
}
