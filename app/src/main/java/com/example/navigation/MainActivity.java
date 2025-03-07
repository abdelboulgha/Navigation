package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bn;
    private EditText nomEtPrenom ,email,phone,adresse;
    private RadioButton f,m;
private Spinner villes;
private String genre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=findViewById(R.id.btnEnvoyer);
        nomEtPrenom = findViewById(R.id.nom);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        villes=findViewById(R.id.villes);
        m=findViewById(R.id.m);
        f=findViewById(R.id.f);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Screen2.class);
                intent.putExtra("nomPrenomKey", nomEtPrenom.getText().toString());
                intent.putExtra("emailKey", email.getText().toString());
                intent.putExtra("phoneKey", phone.getText().toString());
                intent.putExtra("adresseKey", adresse.getText().toString());
                intent.putExtra("villeKey", villes.getSelectedItem().toString());
                if(m.isChecked()){
                    genre="Homme";
                } else if (f.isChecked()) {
                    genre="Femme";
                }
                intent.putExtra("genre", genre.toString());
                startActivity(intent);
            }
        });


    }
}