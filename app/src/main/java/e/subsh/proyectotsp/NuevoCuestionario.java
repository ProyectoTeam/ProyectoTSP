package e.subsh.proyectotsp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.security.AccessController;

import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_NOMBRE;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_PREGUNTA;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_RESPUESTAS;

public class NuevoCuestionario extends AppCompatActivity {

    EditText edtPregunta1;
    //EditText edtPregunta2;
    EditText edtRespuesta1;
    EditText edtNombre;
    //EditText edtRespuesta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cuestionario);


        edtPregunta1=findViewById(R.id.edtPregunta1);
      //  edtPregunta2=findViewById(R.id.edtPregunta2);
        edtRespuesta1=findViewById(R.id.edtRespuesta1);
        //edtRespuesta2=findViewById(R.id.edtRespuesta2);
        edtNombre=findViewById(R.id.edtNombreCuestionario);



    }

    public void onClickTerminar(View view) {
        Intent intentterminar = new Intent(getApplicationContext(),Personalizado.class);

         Context context;
         context=getApplicationContext();

        BaseDatos_Cuestionario db = new BaseDatos_Cuestionario(context);
        ContentValues values = new ContentValues();
        values.put(COLUMNA_PREGUNTA, edtPregunta1.getText().toString());
        values.put(COLUMNA_RESPUESTAS,edtRespuesta1.getText().toString());
        values.put(COLUMNA_NOMBRE,edtNombre.getText().toString());

        db.ActualizarDB(values);

        //BaseDatos_Cuestionario db=new BaseDatos_Cuestionario(context);
        
        
        startActivity(intentterminar);
    }
}
