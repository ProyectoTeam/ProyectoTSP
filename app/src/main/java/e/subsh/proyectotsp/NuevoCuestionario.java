package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NuevoCuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cuestionario);
    }

    public void onClickTerminar(View view) {
        Intent intentterminar = new Intent(getApplicationContext(),Personalizado.class);
        startActivity(intentterminar);
    }
}
