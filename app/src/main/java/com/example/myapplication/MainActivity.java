package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewCrearCuenta;

    Button btnIniciarSesion;

    EditText editTextPassword;

    EditText editTextEmailAddress;

    private void ValidarDatos(){

        if (editTextEmailAddress.getText().toString().equals("cristian")){
            if (editTextPassword.getText().toString().equals("1234")) {
                Toast.makeText(this, "Iniciando Sesion", Toast.LENGTH_SHORT).show();
                Intent pantalla2 = new Intent(this, PantallaIniciarSesion.class);
                startActivity(pantalla2);
            }
            else{
                Toast.makeText(this,"Error en la Contraseña",Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this,"Error en el Correo",Toast.LENGTH_SHORT).show();
        }
    }

    private void CrearUsuario(){
        Intent pantalla3 = new Intent(this, PantallaCrearCuenta.class);
        startActivity(pantalla3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCrearCuenta = findViewById(R.id.textViewCrearCuenta);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidarDatos();
            }
        });

        textViewCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CrearUsuario();
            }
        });

    }
}