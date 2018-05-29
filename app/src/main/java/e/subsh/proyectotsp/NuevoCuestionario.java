package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NuevoCuestionario extends AppCompatActivity {

    EditText edtPregunta1;
    EditText edtPregunta2;
    EditText edtRespuesta1;
    EditText edtRespuesta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cuestionario);


        edtPregunta1=findViewById(R.id.edtPregunta1);
        edtPregunta2=findViewById(R.id.edtPregunta2);
        edtRespuesta1=findViewById(R.id.edtRespuesta1);
        edtRespuesta2=findViewById(R.id.edtRespuesta2);



    }

    public void onClickTerminar(View view) {
        Intent intentterminar = new Intent(getApplicationContext(),Personalizado.class);
        startActivity(intentterminar);
    }
}
