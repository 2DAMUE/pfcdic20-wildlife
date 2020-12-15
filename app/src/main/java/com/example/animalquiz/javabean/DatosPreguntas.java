package com.example.animalquiz.javabean;

import com.example.animalquiz.R;
import com.example.animalquiz.dbQuiz1.Pregunta;

import java.util.ArrayList;

public class DatosPreguntas {
    private ArrayList<Respuestas> listaPreguntas;

    public DatosPreguntas() {
        listaPreguntas = new ArrayList<Respuestas>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaPreguntas.add(new Respuestas("¿Cuánto pesa el león macho adulto?","160-190kgs"));

        listaPreguntas.add(new Respuestas("¿Qué animal come hojas de Eucalipto?","Koala"));

        listaPreguntas.add(new Respuestas("¿Dónde habita el Lince Ibérico?","Europa"));

        listaPreguntas.add(new Respuestas("¿Qué animal se alimenta de ratas y ratones?","Boa Constrictor"));

        listaPreguntas.add(new Respuestas("La mamba negra habita en...","Estepas o sabanas"));

        listaPreguntas.add(new Respuestas("¿En qué continente se encuentra el Cardenal?","América del norte"));

        listaPreguntas.add(new Respuestas("El Faisán de corona blanca puede llegar a vivir de...","50 - 60 años"));

        listaPreguntas.add(new Respuestas("¿De qué clase es el Tigre de Bengala?","Mammalia"));

        listaPreguntas.add(new Respuestas("¿Cuál es el promedio de vida de la Carpa Plateada?","Hasta 20 años"));

        listaPreguntas.add(new Respuestas("¿Las pirañas son carnívoras?","SI"));

    }

    public ArrayList<Respuestas> getListaPreguntas(){
        return listaPreguntas;
    }
}
