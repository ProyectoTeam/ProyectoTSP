package e.subsh.proyectotsp;

import android.content.Context;

import java.util.ArrayList;

public class GestorCuestionario {

    private Context context;

    public GestorCuestionario (Context context)
    {
        this.context = context;
    }

    public ArrayList<Cuestionario> AsignarCuestionario ()
    {
        BaseDatos_Cuestionario db = new BaseDatos_Cuestionario(context);

        return db.extraerAlbumDataBase();
    }

}
