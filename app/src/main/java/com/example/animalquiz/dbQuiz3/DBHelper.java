package com.example.animalquiz.dbQuiz3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.animalquiz.R;

import java.util.Scanner;

public class DBHelper extends SQLiteOpenHelper {
    public static final String NOM_DB = "Quiz3";
    public static final int DB_VERSION = 1;

    protected SQLiteDatabase DBLite;
    protected Context contexto;

    public DBHelper(Context contexto) {
        super(contexto, NOM_DB, null, DB_VERSION);
        this.contexto = contexto;
        this.open();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("debug", "onCreate, creando base de datos...");

        StringBuilder strBuilder = new StringBuilder();
        Scanner scn = new Scanner(this.contexto.getResources().openRawResource(R.raw.database3));

        while (scn.hasNextLine()) {
            strBuilder.append(scn.nextLine());
            strBuilder.append("\n");

            if (strBuilder.indexOf(";") != -1) {
                sqLiteDatabase.execSQL(strBuilder.toString());
                strBuilder.delete(0, strBuilder.capacity());
            }
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int version, int nueva) {
        Log.d("debug", "onUpgrade, método no implementado");
    }

    public void open() {
        Log.d("debug", "open, abriendo base de datos...");
        this.DBLite = this.getWritableDatabase();
    }

    public void close() {
        Log.d("debug", "close, cerrando base de datos...");
        this.DBLite.close();
    }
}
