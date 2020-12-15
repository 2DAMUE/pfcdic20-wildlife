package com.example.animalquiz.javabean;

import android.os.Parcel;
import android.os.Parcelable;

public class Respuestas implements Parcelable{
    private String pregunta;
    private String rCorrecta;

    public Respuestas(String pregunta, String rCorrecta) {
        this.pregunta = pregunta;
        this.rCorrecta = rCorrecta;
    }

    protected Respuestas(Parcel in) {
        pregunta = in.readString();
        rCorrecta = in.readString();
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getrCorrecta() {
        return rCorrecta;
    }

    public static final Creator<Respuestas> CREATOR = new Creator<Respuestas>() {
        @Override
        public Respuestas createFromParcel(Parcel in) {
            return new Respuestas(in);
        }

        @Override
        public Respuestas[] newArray(int size) {
            return new Respuestas[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(pregunta);
        dest.writeString(rCorrecta);
    }
}
