package com.example.mylinecardjava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Gestor_Principal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestor_principal);

        Toolbar toolbar= findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gestor, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.lineasafiliadas:
                Toast.makeText(this, "LÍNEAS AFILIADAS", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.tarifas:
                Toast.makeText(this, "TARIFAS", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.rutas:
                Toast.makeText(this, "RUTAS", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.pagosrealizados:
                Toast.makeText(this, "PAGOS REALIZADOS", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.manualdeinstrucciones:
                Toast.makeText(this, "MANUAL DE ISNTRUCCIONES", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.quejasysugerencias:
                Toast.makeText(this, "QUEJAS Y SUGERENCIAS", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.cerrarsesion:
                Toast.makeText(this, "CERRAR SESIÓN", Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }
}