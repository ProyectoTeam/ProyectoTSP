package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ejercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        BaseDatos_Cuestionario db=new BaseDatos_Cuestionario(getApplicationContext());

        String[][] p=db.leer();



      //  Toast.makeText(getApplicationContext(),p[0].toString(),Toast.LENGTH_LONG).show();


    }

    public void onClickMostrar(View view) {
        Intent intentamostrar=new Intent(getApplicationContext(),Ejercicio_Tipo_1.class);
        intentamostrar.putExtra("id",1);//1 es al que de click
        startActivity(intentamostrar);
    }


}
