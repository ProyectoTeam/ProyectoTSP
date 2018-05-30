package e.subsh.proyectotsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEmpezar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnEmpezar = (Button) findViewById(R.id.btnIniciar);
        btnEmpezar.setOnClickListener(onClickEmpezar);
    }

    protected View.OnClickListener onClickEmpezar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentPrincipal = new Intent(getApplicationContext(), MenuPrincipal.class);
            startActivity(intentPrincipal);
        }
    };
}
