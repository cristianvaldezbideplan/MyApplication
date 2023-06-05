package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
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
    private String url;

    private void Telefono(){
        Toast.makeText(this,"Iniciando Contacto",Toast.LENGTH_SHORT).show();
        Intent Tel = new Intent(Intent.ACTION_DIAL);
        Tel.setData(Uri.parse("tel:" + 15330926));
        startActivity(Tel);
    }

    private void Whatssap(){
        Toast.makeText(this,"Iniciando Whatssap",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.setPackage("com.whatsapp");
        intent.putExtra(Intent.EXTRA_TEXT, "Hola soy Nombre, y te contacto para consultarte sobre:....");
        try{
            startActivity(intent);
        }catch (ActivityNotFoundException ex){
            Toast.makeText(PantallaEnlacesComunicacion.this, "La aplicación Whastapp no se encuentra instalada en el dispositivo.", Toast.LENGTH_SHORT).show();
        }
    }

    private void GitHub(){
        Toast.makeText(this,"Iniciando GitHub",Toast.LENGTH_SHORT).show();
        url="https://github.com/cristianvaldezbideplan/MyApplication";
        Uri webpage = Uri.parse(url);
        Intent Link = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(Link);
    }

    private void Linkedin(){
        Toast.makeText(this,"Iniciando Linkedin",Toast.LENGTH_SHORT).show();
        url="http:linkedin.com/in/cristianvaldezbideplandeveloper/";
        Uri webpage = Uri.parse(url);
        Intent Link = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(Link);
    }

    private void PortaFolio(){
        Toast.makeText(this,"Iniciando PortaFolio",Toast.LENGTH_SHORT).show();
        url="https://bruno-simon.com/";
        Uri webpage = Uri.parse(url);
        Intent Link = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(Link);
    }

    private void Correo(){
        Toast.makeText(this,"Iniciando Correo",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, "Cristianvaldezbideplan@gmail.com");
        intent.putExtra(Intent.EXTRA_CC, "Cristianvaldezbideplan@gmail.com");
        intent.putExtra(Intent.EXTRA_BCC, "Cristianvaldezbideplan@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Consulta de Nombre");
        intent.putExtra(Intent.EXTRA_TEXT, "Hola soy Nombre, y te contacto para consultarte sobre:....");
        startActivity(intent);
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