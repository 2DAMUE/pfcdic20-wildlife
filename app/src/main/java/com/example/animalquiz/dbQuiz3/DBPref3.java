package com.example.animalquiz.dbQuiz3;

import android.content.Context;
import android.database.Cursor;

public class DBPref3 extends DBHelper {
    public DBPref3(Context contexto) {
        super(contexto);
    }

    public Cursor getPreguntas(Categoria c, Dificultad d, int limit) {
        return this.DBLite.rawQuery("SELECT `pregunta`, `rtaCorrecta`, " +
                        "`rtaIncorrecta1`, `rtaIncorrecta2`, `rtaIncorrecta3`, " +
                        "`tipo`, `imagen`, `sonido` FROM `preguntas` WHERE categoria = ? AND dificultad = ? " +
                        "ORDER BY RANDOM() LIMIT ?",
                new String[]{String.valueOf(c.C), String.valueOf(d.D), String.valueOf(limit)});
    }

    public static enum Categoria {
        HISTORIA('A'),
        GEAOGRAFIA('B'),
        LITERATURA('C'),
        ARTE('D'),
        DEPORTES('E'),
        CIENCIA('F'),
        TECNOLOGIA('G'),
        ASTRONOMIA('H'),
        CINE('I'),
        OTROS('Z');
        public final char C;

        Categoria(char c) {
            this.C = c;
        }
    }

    public static enum Dificultad {
        FACIL('F'),
        MEDIA('M'),
        DIFICIL('D');

        public final char D;

        Dificultad(char d) {
            this.D = d;
        }
    }
}
