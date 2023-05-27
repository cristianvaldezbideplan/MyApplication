package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
                Toast.makeText(this,"Iniciando Perfel",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Acerca_Nosotros:
                Toast.makeText(this,"Iniciando Acerca de Nosotros",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Acerca_Programador:
                Toast.makeText(this,"Iniciando Acerca del Desarrollado",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}