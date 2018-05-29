package e.subsh.proyectotsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mostrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        Bundle parametros = this.getIntent().getExtras();

        String [] temario ;
        //temario[0]=parametros.getString(getResources().getString(R.string.var_extra_tema));
    }
}
