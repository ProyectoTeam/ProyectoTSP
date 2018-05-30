package e.subsh.proyectotsp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Ejercicios extends AppCompatActivity {

    String [] arrayTemas;
    ListView lstvTemas;
    int valorTemaActual;
    boolean eliminar;
    String[] p_nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        BaseDatos_Cuestionario db=new BaseDatos_Cuestionario(getApplicationContext());
        Bundle datos = this.getIntent().getExtras();
        eliminar = datos.getBoolean("Eliminar");

        Log.i("Elimnar es"," "+eliminar);


        int usoto=  db.Elementos();



        Log.i("Llega aqui", "onCreate: "+usoto);

         p_nombres=new String[usoto];
        String[][] p=db.leer();
        for(int i=0;i<=usoto-1;i++) {
            p_nombres[i] = p[i][0];
        }
        arrayTemas=p_nombres;

       //arrayTemas = getResources().getStringArray(R.array.arrayTemas);
        lstvTemas = findViewById(R.id.lstvEjercicios);
        lstvTemas.setOnItemClickListener(ItemListener());
        ArrayAdapter<String> AdapterTemas = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayTemas);
        lstvTemas.setAdapter(AdapterTemas);





    }

    protected AdapterView.OnItemClickListener ItemListener(){
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                valorTemaActual = position;

                if(eliminar==false) {
                    Intent intentamostrar = new Intent(getApplicationContext(), Ejercicio_Tipo_1.class);
                    intentamostrar.putExtra("id", valorTemaActual);
                    startActivity(intentamostrar);
                }
                else{
                    Context context;
                    context=getApplicationContext();

                    BaseDatos_Cuestionario db2 = new BaseDatos_Cuestionario(context);

                    String tmp = p_nombres[valorTemaActual];

                    db2.Eliminar(tmp);

                    Intent intentamostrar = new Intent(getApplicationContext(), MenuPrincipal.class);
                    startActivity(intentamostrar);
                }
                //Toast.makeText(getApplicationContext(),"Valor: " + valorTemaActual, Toast.LENGTH_SHORT).show();
            }
        };
    }

    /*public void onClickMostrar(View view) {

    }*/


}
