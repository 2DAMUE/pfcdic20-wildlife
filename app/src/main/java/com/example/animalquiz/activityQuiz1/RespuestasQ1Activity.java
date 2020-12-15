package com.example.animalquiz.activityQuiz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;
import com.example.animalquiz.adapters.MamiferoAdapter;
import com.example.animalquiz.adapters.RespuestasAdapter;
import com.example.animalquiz.javabean.DatosMamiferos;
import com.example.animalquiz.javabean.DatosPreguntas;

public class RespuestasQ1Activity extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager llm;
    RespuestasAdapter ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas_q1);

        final DatosPreguntas datosRespuestas = new DatosPreguntas();

        rv = findViewById(R.id.rvRespuestas);

        rv.setHasFixedSize(true);

        ra = new RespuestasAdapter(datosRespuestas.getListaPreguntas());

        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setAdapter(ra);
    }

    public void volverPrincipalQuiz(View view) {
        Intent volver = new Intent(this, PrincipalQuizActivity.class);
        startActivity(volver);
    }
}
