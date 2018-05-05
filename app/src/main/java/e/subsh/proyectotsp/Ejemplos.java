package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejemplos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos);
    }

    public void onClickMostrar(View view) {
        Intent intentamostrar=new Intent(getApplicationContext(),Mostrar.class);
        startActivity(intentamostrar);
    }


}
