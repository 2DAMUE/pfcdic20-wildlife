package com.example.animalquiz.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.animalquiz.PrincipalQuizActivity;
import com.example.animalquiz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatosQuiz1Fragment extends Fragment {

    private int numCorrectas;
    private int numIncorrectas;
    private int puntuacion;
    private int numPreguntas;
    private TextView tvPuntuacion, tvCorrectasF, tvIncorrectasF, tvPreguntasTotales;
    private Button btnContinuarF;
    private ProgressBar pbCarga;

    public DatosQuiz1Fragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null){
            numCorrectas = getArguments().getInt("numCorrectas");
            numIncorrectas = getArguments().getInt("numIncorrectas");
            puntuacion = getArguments().getInt("puntuacion");
            numPreguntas = getArguments().getInt("numPreguntas");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datos_quiz1, container, false);

        tvPuntuacion = view.findViewById(R.id.tvPuntuacion);
        btnContinuarF = view.findViewById(R.id.btnContinuarF);
        tvCorrectasF = view.findViewById(R.id.tvAciertos);
        tvIncorrectasF = view.findViewById(R.id.tvFallos);
        tvPreguntasTotales = view.findViewById(R.id.tvPreguntasTotales);
        pbCarga = view.findViewById(R.id.pbCarga1);

        pbCarga.setVisibility(View.INVISIBLE);

        numCorrectas = getArguments().getInt("numCorrectas");
        numIncorrectas = getArguments().getInt("numIncorrectas");
        puntuacion = getArguments().getInt("puntuacion");
        numPreguntas = getArguments().getInt("numPreguntas");

        numPreguntas = numPreguntas -1;

        tvPuntuacion.setText("Puntos totales: " + numCorrectas);
        tvCorrectasF.setText("Has acertado: " + numCorrectas + " preguntas");
        tvIncorrectasF.setText("Has fallado: " + numIncorrectas + " preguntas");
        tvPreguntasTotales.setText("Preguntas realizadas: " + numPreguntas);

        btnContinuarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbCarga.setVisibility(View.VISIBLE);
                openApp(true);
            }
        });

        return view;
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getActivity(), PrincipalQuizActivity.class);
                getActivity().finish();
            }
        }, 2000);
    }
}
