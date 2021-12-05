package com.example.catteranddogger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.catteranddogger.model.Animal;

public class ProfileActivity extends AppCompatActivity {

    Animal animal;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        animal = (Animal) intent.getSerializableExtra(ListAnimalActivity.ANIMAL_MINE);
        inisialisasiView();
        tampilkanProfil(animal);

    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
    }


    private void tampilkanProfil(Animal animal) {
        Log.d("Profil","Menampilkan "+animal.getJenis());
        txJudul.setText(animal.getJenis());
        txJenis.setText(animal.getRas());
        txAsal.setText(animal.getLatin());
        txDeskripsi.setText(animal.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(animal.getDrawableRes()));
    }
}

