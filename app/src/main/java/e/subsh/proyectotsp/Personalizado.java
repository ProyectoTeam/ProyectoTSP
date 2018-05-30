package e.subsh.proyectotsp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_NOMBRE;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_PREGUNTA;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_RESPUESTAS;

public class Personalizado extends AppCompatActivity {

    String cuestionarios[];
   // Spinner spCuestionariosAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizado);

        cuestionarios = getResources().getStringArray(R.array.array_Cuestionarios);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cuestionarios);
        //spCuestionariosAbrir.setAdapter(adapter);
    }

    public void onClickCuestionario(View view) {
        Intent intentcuestionario = new Intent(getApplicationContext(),NuevoCuestionario.class);
        startActivity(intentcuestionario);
    }

    public void OnClickBorrarCuestionario(View view){
        Intent intentterminar = new Intent(getApplicationContext(),Ejercicios.class);
        intentterminar.putExtra("Eliminar",true);


        //BaseDatos_Cuestionario db=new BaseDatos_Cuestionario(context);


        startActivity(intentterminar);
    }
}
