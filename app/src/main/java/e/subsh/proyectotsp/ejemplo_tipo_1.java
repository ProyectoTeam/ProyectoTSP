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
        temario=parametros.getString(getResources().getString(R.string.var_extra_temarioEjemplo));
        Toast.makeText(getApplicationContext(),"Tema: "+ temario,Toast.LENGTH_SHORT).show();
        txtSubtema = findViewById(R.id.txtNombreTemaEjemplo);
        txtCuerpo=findViewById(R.id.txtCuerpoTemaEjemplo);
        subtemas=getResources().getStringArray(R.array.arraySubtemasEjemplo);
        cuerpos=getResources().getStringArray(R.array.arrayCuerposEjemplos);

        switch(temario)
        {
            case "00":
                txtSubtema.setText(subtemas[0]);
                txtCuerpo.setText(cuerpos[0]);
                break;
            case "01":
                txtSubtema.setText(subtemas[1]);
                txtCuerpo.setText(cuerpos[1]);
                break;
            case "02":
                txtSubtema.setText(subtemas[2]);
                txtCuerpo.setText(cuerpos[2]);
                break;
            case "10":
                txtSubtema.setText(subtemas[3]);
                txtCuerpo.setText(cuerpos[3]);
                break;
            case "11":
                txtSubtema.setText(subtemas[4]);
                txtCuerpo.setText(cuerpos[4]);
                break;
            case "12":
                txtSubtema.setText(subtemas[5]);
                txtCuerpo.setText(cuerpos[5]);
                break;
            case "20":
                txtSubtema.setText(subtemas[6]);
                txtCuerpo.setText(cuerpos[6]);
                break;
            case "21":
                txtSubtema.setText(subtemas[7]);
                txtCuerpo.setText(cuerpos[7]);
                break;
            case "22":
                txtSubtema.setText(subtemas[8]);
                txtCuerpo.setText(cuerpos[8]);
                break;
            case "30":
                txtSubtema.setText(subtemas[9]);
                txtCuerpo.setText(cuerpos[9]);
                break;
            case "31":
                txtSubtema.setText(subtemas[10]);
                txtCuerpo.setText(cuerpos[10]);
                break;
            case "32":
                txtSubtema.setText(subtemas[11]);
                txtCuerpo.setText(cuerpos[11]);
                break;
            case "40":
                txtSubtema.setText(subtemas[12]);
                txtCuerpo.setText(cuerpos[12]);
                break;
            case "41":
                txtSubtema.setText(subtemas[13]);
                txtCuerpo.setText(cuerpos[13]);
                break;
            case "42":
                txtSubtema.setText(subtemas[14]);
                txtCuerpo.setText(cuerpos[14]);
                break;
            default:
                break;
        }
    }
}
