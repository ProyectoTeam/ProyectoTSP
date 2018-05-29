package e.subsh.proyectotsp;

import android.content.ContentValues;

import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_PREGUNTA;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_RESPUESTAS;

public class Cuestionario {
    private String pregunta;

    private String respuesta;
    //private String imagen;

    public Cuestionario(String pregunta, String respuesta){
        this.pregunta=pregunta;
        this.respuesta=respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }


    public String getRespuesta() {
        return respuesta;
    }


    public ContentValues toContentValues() {
        ContentValues values=new ContentValues();
        values.put(COLUMNA_PREGUNTA, pregunta);
        values.put(COLUMNA_RESPUESTAS,respuesta);
        return values;
    }

}
