package e.subsh.proyectotsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ejemplo_tipo_1 extends AppCompatActivity {

    TextView txtSubtema;
    TextView txtCuerpo;
    String [] subtemas;
    String [] cuerpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_tipo_1);

        Bundle parametros = this.getIntent().getExtras();

        String temario;
        temario=parametros.getString(getResources().getString(R.string.var_extra_temario));
        Toast.makeText(getApplicationContext(),"Tema: "+ temario,Toast.LENGTH_SHORT).show();
        txtSubtema = findViewById(R.id.txtNombreTema);
        txtCuerpo=findViewById(R.id.txtCuerpoTema);
        subtemas=getResources().getStringArray(R.array.arraySubtemas);
        cuerpos=getResources().getStringArray(R.array.arrayCuerpos);
    }
}
