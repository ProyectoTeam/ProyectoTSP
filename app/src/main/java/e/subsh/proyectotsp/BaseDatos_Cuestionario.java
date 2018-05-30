package e.subsh.proyectotsp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class BaseDatos_Cuestionario extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="CrearCuestionarinormal.db";

    //NOMBRE TABLA
    public static final String TABLA_CUESTIONARIO="Cuestionario"; //Creado
    public static final String COLUMNA_ID="_id";
    public static final String COLUMNA_PREGUNTA="pregunta";
    public static final String COLUMNA_RESPUESTAS="respuesta";
    public static final String COLUMNA_NOMBRE="nombre";

    private static final String SQL_CREAR="create table "
            + TABLA_CUESTIONARIO +"(" + COLUMNA_ID + " integer primary key autoincrement,"
            +COLUMNA_PREGUNTA + " TEXT NOT NULL,"
            + COLUMNA_NOMBRE + " TEXT NOT NULL,"
            + COLUMNA_RESPUESTAS + " TEXT NOT NULL);";


    public BaseDatos_Cuestionario(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREAR);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){

    }


    //Extare datos
    public ArrayList<Cuestionario> extraerAlbumDataBase ()
    {
        ArrayList<Cuestionario> cuestionarios = new ArrayList<>();
        String query = "SELECT * FROM " + TABLA_CUESTIONARIO;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);
        while (registros.moveToNext())
        {
            Cuestionario cuestionarioctual = new Cuestionario(registros.getString(1), registros.getString(2),registros.getString(3));
            cuestionarios.add(cuestionarioctual);
        }
        db.close();
        return cuestionarios;
    }

    //Metodos

    public void Agregar(String pregunta,String respuesta,String nombre)
    {
        SQLiteDatabase db =this.getWritableDatabase();

        //Contenedro de valores
        ContentValues values=new ContentValues();

        //Se insertan los valores por pares

        values.put(COLUMNA_PREGUNTA,pregunta);
        values.put(COLUMNA_RESPUESTAS,respuesta);
        values.put(COLUMNA_NOMBRE,nombre);
        //values.put(COLUMNA_IMAGEN,imagen);

        //Insertar

        db.insert(TABLA_CUESTIONARIO,null,values);


    }

    public long GuardarPregunta(Cuestionario cuestionario){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        return sqLiteDatabase.insert(TABLA_CUESTIONARIO,null,cuestionario.toContentValues());
    }

    public void ActualizarDB(ContentValues contentValues)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLA_CUESTIONARIO, null,contentValues);

        db.close();
    }

    public String[][] leer(){
        String result[][]=new String[10][3];
        String columnas[]={"Nombre","Pregunta","Respuesta"};
        Cursor c=this.getReadableDatabase().query(TABLA_CUESTIONARIO,columnas,null,null,null,null,null);

        int id,iu,ip;
        id=c.getColumnIndex(COLUMNA_NOMBRE);
        iu=c.getColumnIndex(COLUMNA_PREGUNTA);
        ip=c.getColumnIndex(COLUMNA_RESPUESTAS);

        int contador=0;



        for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
            result[contador][0]=c.getString(id);
            result[contador][1]=c.getString(iu);
            result[contador][2]=c.getString(ip);
            contador++;

        }
        return result;
    }



}
