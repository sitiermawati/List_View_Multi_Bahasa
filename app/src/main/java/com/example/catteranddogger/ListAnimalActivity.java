package com.example.catteranddogger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.catteranddogger.model.Animal;

import java.util.List;

public class ListAnimalActivity extends AppCompatActivity {
    public final static String ANIMAL_MINE = "animal_obj_key";
    List<Animal> animals;
    ListView listView;
    String jenisAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animal);
        Intent intent = getIntent();
        jenisAnimal = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("LIST TYPE ANIMAL OF " +jenisAnimal.toUpperCase());
        animals = DataProvider.getHewansByTipe(this, jenisAnimal);
        setupListView();
    }

    private void setupListView(){
        listView = findViewById(R.id.listview_daftar_animal);
        ListAnimalAdapter adapter = new ListAnimalAdapter(this, animals);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClick);
    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Animal mine = animals.get(position);
            openProfileAnimal(mine);
        }
    };

    private void openProfileAnimal(Animal animalMine) {
        Log.d("MAIN", "Open Activity Galery");
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(ANIMAL_MINE, animalMine);
        startActivity(intent);
    }
}

