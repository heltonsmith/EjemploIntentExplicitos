package com.heltonbustos.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actitivy2 extends AppCompatActivity {

    Button btnIr2;
    TextView txtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitivy2);

        btnIr2 = findViewById(R.id.btnIr2);
        txtUsuario = findViewById(R.id.txtUsuario);

        String nombre = getIntent().getStringExtra("nom");
        String apellido = getIntent().getStringExtra("ape");

        txtUsuario.setText("Bienvenido: " + nombre + " " + apellido);

        btnIr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}