package com.example.cecyt9.examen1_mora_guerrero_leon_sergio_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    TextView Respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        try {
            Intent recibido = getIntent();
            Bundle DatosRec = recibido.getExtras();

            Respuesta = (TextView) findViewById(R.id.txtResultado);
            Respuesta.setText("Leon Sergio Mora Guerrero "+DatosRec.getString("Resultado"));
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Parece que ha ocurrido un error...", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickCorreo(View vw)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Primer Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:\n"+Respuesta.getText().toString());
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}
