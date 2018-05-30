package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Ejercicios extends AppCompatActivity {

    String [] arrayTemas;
    ListView lstvTemas;
    int valorTemaActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        arrayTemas = getResources().getStringArray(R.array.arrayTemas);
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
                //Toast.makeText(getApplicationContext(),"Valor: " + valorTemaActual, Toast.LENGTH_SHORT).show();
            }
        };
    }

    /*public void onClickMostrar(View view) {
        Intent intentamostrar=new Intent(getApplicationContext(),Ejercicio_Tipo_1.class);
        startActivity(intentamostrar);
    }*/


}
