package com.rizkykhapidsyah.p_gridview__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView GV_GridView_IDJAVA;

    String[] ListNamaKota = {
            "Banda Aceh",
            "Medan",
            "Gunung Sitoli",
            "Padang Sidempuan",
            "Tarutung",
            "Sibolga",
            "Parapat",
            "Kutacane",
            "Pekanbaru",
            "Padang",
            "Jambi",
            "Palembang",
            "Bengkulu",
            "Bandar Lampung",
            "Bangka Belitung",
            "Kuala Simpang",
            "Lhokseumawe"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV_GridView_IDJAVA = findViewById(R.id.GV_GridView_IDXML);

        final ArrayList<String> Daftar = new ArrayList<>();
        for (int X = 0; X <= 16; X++) {
            Daftar.add(ListNamaKota[X]);
        }

        ArrayAdapter<String> Pencocok = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ListNamaKota);
        GV_GridView_IDJAVA.setAdapter(Pencocok);

        GV_GridView_IDJAVA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda Memijit : " + Daftar.get(position), Toast.LENGTH_SHORT).show();

                Intent PindahDataKeActivityBaru = new Intent(MainActivity.this, SecondActivity.class);
                PindahDataKeActivityBaru.putExtra(SecondActivity.EXTRA_NAMA_KOTA, Daftar.get(position));
                startActivity(PindahDataKeActivityBaru);
            }
        });
    }
}
