package com.example.exercice2ontouchlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Stagiaire> stgs;

    Button b1,b2,b3,b4;
    EditText e1,e2;
    RadioGroup grp;
    ImageView image;

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.idfirst);
        b2 = findViewById(R.id.idprec);
        b3 = findViewById(R.id.idnext);
        b4 = findViewById(R.id.idlast);
        e1 = findViewById(R.id.idnom);
        e2 = findViewById(R.id.idprenom);
        grp = findViewById(R.id.grp);
        image = findViewById(R.id.im);

        stgs.add(new Stagiaire("Nom 1","Prenom 1","H",R.drawable.image1));
        stgs.add(new Stagiaire("Nom 2","Prenom 2","F",R.drawable.image2));
        stgs.add(new Stagiaire("Nom 3","Prenom 3","H",R.drawable.image3));
        stgs.add(new Stagiaire("Nom 4","Prenom 4","F",R.drawable.image4));
        stgs.add(new Stagiaire("Nom 5","Prenom 5","F",R.drawable.image4));
        stgs.add(new Stagiaire("Nom 6","Prenom 6","H",R.drawable.image6));
        stgs.add(new Stagiaire("Nom 7","Prenom 7","H",R.drawable.image7));
        stgs.add(new Stagiaire("Nom 8","Prenom 8","F",R.drawable.image8));

        position = 0;
        afficheDonneesStagiaire();
    }


    public void afficheDonneesStagiaire(){
        e1.setText(stgs.get(position).getNom());
        e2.setText(stgs.get(position).getPrenom());
        if(stgs.get(position).getSexe().equals("H"))
            grp.check(R.id.rdh);
        else
            grp.check(R.id.rdf);
        image.setImageResource(stgs.get(position).getImage());
    }
}