package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio_Tipo_1 extends AppCompatActivity {

    EditText edtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio__tipo_1);

        edtRespuesta=(EditText)findViewById(R.id.edtAnswer);



    }

    public void onClickIngresar(View view) {



        if (edtRespuesta.getText().toString().compareTo("condicional")==0)
            {
                Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_LONG).show();
            }
        else
            {
                Toast.makeText(getApplicationContext(),"Incorrecto",Toast.LENGTH_LONG).show();
            }
    }

}
