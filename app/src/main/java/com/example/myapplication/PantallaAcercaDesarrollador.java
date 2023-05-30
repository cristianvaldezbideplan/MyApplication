package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PantallaAcercaDesarrollador extends AppCompatActivity {

    TextView textViewDContactar2;

    private void Enlaces(){
        Intent PantallaContartar = new Intent(this, PantallaEnlacesComunicacion.class);
        startActivity(PantallaContartar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_acerca_desarrollador);

        textViewDContactar2 = findViewById(R.id.textViewDContarcar2);

        textViewDContactar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Enlaces();
            }
        });

    }
}