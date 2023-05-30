package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PantallaEnlacesComunicacion extends AppCompatActivity {

    Button btnECTelefono;
    Button btnECWhatssap;
    Button btnECGitHub;
    Button btnECLinkedin;
    Button btnECPortaFolio;
    Button btnECCorreo;

    private void Telefono(){
        Toast.makeText(this,"Iniciando Telefono",Toast.LENGTH_SHORT).show();
    }

    private void Whatssap(){
        Toast.makeText(this,"Iniciando Whatssap",Toast.LENGTH_SHORT).show();
    }

    private void GitHub(){
        Toast.makeText(this,"Iniciando GitHub",Toast.LENGTH_SHORT).show();
    }

    private void Linkedin(){
        Toast.makeText(this,"Iniciando Linkedin",Toast.LENGTH_SHORT).show();
    }

    private void PortaFolio(){
        Toast.makeText(this,"Iniciando PortaFolio",Toast.LENGTH_SHORT).show();
    }

    private void Correo(){
        Toast.makeText(this,"Iniciando Correo",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_enlaces_comunicacion);

        btnECTelefono = findViewById(R.id.btnECTelefono);
        btnECWhatssap = findViewById(R.id.btnECWhatssap);
        btnECGitHub = findViewById(R.id.btnECGitHub);
        btnECLinkedin = findViewById(R.id.btnECLinkedin);
        btnECPortaFolio = findViewById(R.id.btnECPortaFolio);
        btnECCorreo = findViewById(R.id.btnECCorreo);

        btnECTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefono();
            }
        });

        btnECWhatssap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Whatssap();
            }
        });

        btnECGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GitHub();
            }
        });

        btnECLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Linkedin();
            }
        });

        btnECPortaFolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PortaFolio();
            }
        });

        btnECCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Correo();
            }
        });
    }
}