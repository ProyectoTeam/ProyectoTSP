package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    Button btnPersonalizar;
    Button btnAprender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnPersonalizar = (Button) findViewById(R.id.btnPersonalizado);
        btnPersonalizar.setOnClickListener(onClickPersonalizar);


    }

    public View.OnClickListener onClickPersonalizar= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentdatos = new Intent(getApplicationContext(),Personalizado.class);
            startActivity(intentdatos);
        }
    };

    public void onClickAprender(View view) {
        Intent intentaprender=new Intent(getApplicationContext(),Aprender.class);
        startActivity(intentaprender);
    }

    public void onClickEjemplos(View view) {
        Intent intentaejemplos=new Intent(getApplicationContext(),Ejemplos.class);
        startActivity(intentaejemplos);
    }

    public void onClickEjercicios(View view) {
        Intent intentaejercicios=new Intent(getApplicationContext(),Ejercicios.class);
        startActivity(intentaejercicios);
    }

}
