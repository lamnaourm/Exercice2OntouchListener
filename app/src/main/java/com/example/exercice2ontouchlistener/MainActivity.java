package com.example.exercice2ontouchlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Stagiaire> stgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stgs.add(new Stagiaire("Nom 1","Prenom 1","H",R.drawable.image1));
        stgs.add(new Stagiaire("Nom 2","Prenom 2","F",R.drawable.image2));
        stgs.add(new Stagiaire("Nom 3","Prenom 3","H",R.drawable.image3));
        stgs.add(new Stagiaire("Nom 4","Prenom 4","F",R.drawable.image4));
        stgs.add(new Stagiaire("Nom 5","Prenom 5","F",R.drawable.image4));
        stgs.add(new Stagiaire("Nom 6","Prenom 6","H",R.drawable.image6));
        stgs.add(new Stagiaire("Nom 7","Prenom 7","H",R.drawable.image7));
        stgs.add(new Stagiaire("Nom 8","Prenom 8","F",R.drawable.image8));
    }
}