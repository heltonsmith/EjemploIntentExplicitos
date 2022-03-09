package com.heltonbustos.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnIr1;
    EditText txtNombre, txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIr1 = findViewById(R.id.btnIr1);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);

        btnIr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String apellido = txtApellido.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Actitivy2.class);
                intent.putExtra("nom", nombre);
                intent.putExtra("ape", apellido);

                startActivity(intent);
            }
        });
    }
}