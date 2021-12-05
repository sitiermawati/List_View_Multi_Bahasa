package com.example.catteranddogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnTiger,btnLion,btnElephant,btnProfile;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

        btnProfile = findViewById(R.id.profile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent i = new Intent(getApplicationContext(),MyProfile.class );
           startActivity(i);
           
            }
        });
    }

    public void Move(View view){
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
    }

    private void inisialisasiView() {
        btnTiger = findViewById(R.id.ras_tiger);
        btnLion = findViewById(R.id.ras_lion);
        btnElephant = findViewById(R.id.ras_elephant);
        btnTiger.setOnClickListener(view -> bukaGaleri("Tiger"));
        btnLion.setOnClickListener(view -> bukaGaleri("Lion"));
        btnElephant.setOnClickListener(view -> bukaGaleri("Elephant"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Open activity tiger");
        Intent intent = new Intent(this, ListAnimalActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}