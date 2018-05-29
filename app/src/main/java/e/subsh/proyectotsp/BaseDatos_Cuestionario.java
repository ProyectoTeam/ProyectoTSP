package e.subsh.proyectotsp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos_Cuestionario extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="CrearCuestionarinormal.db";

    //NOMBRE TABLA
    public static final String TABLA_CUESTIONARIO="Cuestionario";
    public static final String COLUMNA_ID="_id";
    public static final String COLUMNA_PREGUNTA="pregunta";
    public static final String COLUMNA_RESPUESTAS="respuesta";

    private static final String SQL_CREAR="create table "
            + TABLA_CUESTIONARIO +"(" + COLUMNA_ID + " integer primary key autoincrement,"
            +COLUMNA_PREGUNTA + " TEXT NOT NULL,"
            + COLUMNA_RESPUESTAS + " TEXT NOT NULL);";


    public BaseDatos_Cuestionario(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREAR);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){

    }

    //Metodos

    public void Agregar(String nombre,String respuesta)
    {
        SQLiteDatabase db =this.getWritableDatabase();

        //Contenedro de valores
        ContentValues values=new ContentValues();

        //Se insertan los valores por pares

        values.put(COLUMNA_PREGUNTA,nombre);
        values.put(COLUMNA_RESPUESTAS,respuesta);
        //values.put(COLUMNA_IMAGEN,imagen);

        //Insertar

        db.insert(TABLA_CUESTIONARIO,null,values);


    }

    public long GuardarPregunta(Cuestionario cuestionario){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        return sqLiteDatabase.insert(TABLA_CUESTIONARIO,null,cuestionario.toContentValues());
    }



}
