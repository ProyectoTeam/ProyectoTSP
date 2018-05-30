package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio_Tipo_1 extends AppCompatActivity {

    EditText edtRespuesta;
    TextView txtpregunta;
    Button btnAceptar;
    String Respuesta;
    int id;
    String[][] p;
    ImageView Resultado;
    Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio__tipo_1);

        edtRespuesta=(EditText)findViewById(R.id.edtAnswer);
        txtpregunta=findViewById(R.id.txtpreg);
        Resultado=findViewById(R.id.imvFondoej);
        btnAceptar=findViewById(R.id.btnIngresar);
        btnContinuar=findViewById(R.id.btnContinuar);


        btnAceptar.setVisibility(View.VISIBLE);
        edtRespuesta.setVisibility(View.VISIBLE);
        btnContinuar.setVisibility(View.INVISIBLE);


        Resultado.setImageResource(R.drawable.fondo_segundo);

        Bundle datos = this.getIntent().getExtras();
       id = datos.getInt("id");

        BaseDatos_Cuestionario db=new BaseDatos_Cuestionario(getApplicationContext());

        p=db.leer();


        //Toast.makeText(getApplicationContext(),p[id][2].toString(),Toast.LENGTH_LONG).show();
        txtpregunta.setText(p[id][1].toString());
        Respuesta=p[id][2];



    }

    public void onClickIngresar(View view) {



        if (edtRespuesta.getText().toString().compareTo(p[id][2])==0)
            {
                //Toast.makeText(getApplicationContext(),"Correcto",Toast.LENGTH_LONG).show();
                Resultado.setImageResource(R.drawable.robot_con_un_simbolo_correcto_1048_3537);
                edtRespuesta.setVisibility(View.INVISIBLE);
                btnAceptar.setVisibility(View.INVISIBLE);
                txtpregunta.setText("Correcto :3");
                btnContinuar.setVisibility(View.VISIBLE);

            }
        else
            {
                Toast.makeText(getApplicationContext(),"Incorrecto",Toast.LENGTH_LONG).show();
                Resultado.setImageResource(R.drawable.sigue);
                edtRespuesta.setVisibility(View.INVISIBLE);
                txtpregunta.setText("Sigue intentando");
                btnAceptar.setVisibility(View.INVISIBLE);
                btnContinuar.setVisibility(View.VISIBLE);
            }
    }

    public void onClickContinuar(View view)
    {
        Intent volver=new Intent(getApplicationContext(),MenuPrincipal.class);
        startActivity(volver);
    }


}
