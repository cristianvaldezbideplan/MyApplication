package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class PantallaIniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_iniciar_sesion);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.action_Perfil:
                Toast.makeText(this,"Proximamente",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Acerca_Nosotros:
                Intent pantallaNosotros = new Intent(this, PantallaAcercaNosotros.class);
                startActivity(pantallaNosotros);
                break;
            case R.id.action_Acerca_Programador:
                Intent pantallaDesarrollador = new Intent(this, PantallaAcercaDesarrollador.class);
                startActivity(pantallaDesarrollador);
                break;
            case R.id.action_CerrarSesion:
                Intent pantallaCerrarSesion = new Intent(this, MainActivity.class);
                startActivity(pantallaCerrarSesion);
                break;
            case R.id.action_Exit:
                finishAffinity();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}