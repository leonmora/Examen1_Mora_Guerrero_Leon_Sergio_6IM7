package com.example.cecyt9.examen1_mora_guerrero_leon_sergio_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Actividad1 extends AppCompatActivity {

    EditText Cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        Cantidad=(EditText)findViewById(R.id.cantidad);

    }

    public void onClickConvertir(View vw)
    {
        try{
            int resultado = Integer.parseInt(Cantidad.getText().toString());
            Toast.makeText(getApplicationContext(),""+resultado/15, Toast.LENGTH_LONG).show();
            Intent intento=new Intent(this,Actividad2.class);
            Bundle datos=new Bundle();
            datos.putString("Resultado",""+resultado/15);
            intento.putExtras(datos);
            finish();
            startActivity(intento);

        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Parece que hubo un error..."+e.getMessage(), Toast.LENGTH_LONG).show();
        }


    }
}
