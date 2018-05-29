package e.subsh.proyectotsp;

import android.content.ContentValues;

import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_NOMBRE;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_PREGUNTA;
import static e.subsh.proyectotsp.BaseDatos_Cuestionario.COLUMNA_RESPUESTAS;

public class Cuestionario {
    private String pregunta;
    private String nombre;//Cuestionario
    private String respuesta;
    //private String imagen;

    public Cuestionario(String pregunta, String respuesta, String nombre){
        this.pregunta=pregunta;
        this.respuesta=respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }


    public String getRespuesta() {
        return respuesta;
    }

    public String getNombre(){
        return nombre;
    }


    public ContentValues toContentValues() {
        ContentValues values=new ContentValues();
        values.put(COLUMNA_PREGUNTA, pregunta);
        values.put(COLUMNA_RESPUESTAS,respuesta);
        values.put(COLUMNA_NOMBRE,nombre);
        return values;
    }

}
