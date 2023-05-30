package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaCrearCuenta extends AppCompatActivity {

    Button btnCrearCuenta;
    EditText editTextNombre;
    EditText editTextContraseña;
    EditText editTextRepContraseña;
    EditText editTextTelefono;
    EditText editTextCorreo;
    TextView textViewNombre;
    TextView textViewCContraseña;
    TextView textViewCRContraseña;
    TextView textViewTelefono;
    TextView textViewCCorreo;

    private void CrearCuenta(){
        Toast.makeText(this,"En proceso",Toast.LENGTH_SHORT).show();
        Intent CuentaCreada = new Intent(this, MainActivity.class);
        startActivity(CuentaCreada);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_crear_cuenta);

        btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        editTextNombre = findViewById(R.id.editTextTNombre);
        editTextContraseña = findViewById(R.id.editTextContraseña);
        editTextRepContraseña = findViewById(R.id.editTextRepContraseña);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        textViewNombre = findViewById(R.id.textViewNombre);
        textViewCContraseña = findViewById(R.id.textViewCContraseña);
        textViewCRContraseña = findViewById(R.id.textViewCRContraseña);
        textViewTelefono = findViewById(R.id.textViewTelefono);
        textViewCCorreo = findViewById(R.id.textViewCCorreo);

        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrearCuenta();
            }
        });

    }
}