package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);
    }

    public void onClickMostrar(View view) {
        Intent intentamostrar=new Intent(getApplicationContext(),Mostrar.class);
        startActivity(intentamostrar);
    }


}
