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
public class DatosQuiz3Fragment extends Fragment {

    private int numCorrectas3;
    private int numIncorrectas3;
    private int puntuacion3;
    private int numPreguntas3;
    private TextView tvPuntuacion, tvCorrectasF, tvIncorrectasF, tvPreguntasTotales;
    private Button btnContinuarF;
    private ProgressBar pbCarga3;

    public DatosQuiz3Fragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datos_quiz3, container
                , false);

        tvPuntuacion = view.findViewById(R.id.tvPuntuacion3);
        btnContinuarF = view.findViewById(R.id.btnContinuarF);
        tvCorrectasF = view.findViewById(R.id.tvAciertos3);
        tvIncorrectasF = view.findViewById(R.id.tvFallos3);
        tvPreguntasTotales = view.findViewById(R.id.tvPreguntasTotales3);
        pbCarga3 = view.findViewById(R.id.pbCarga3);

        numCorrectas3 = getArguments().getInt("numCorrectasQ3");
        numIncorrectas3 = getArguments().getInt("numIncorrectasQ3");
        puntuacion3 = getArguments().getInt("puntuacionQ3");
        numPreguntas3 = getArguments().getInt("numPreguntasQ3");

        pbCarga3.setVisibility(View.INVISIBLE);

        numPreguntas3 = numPreguntas3 - 1;

        tvPuntuacion.setText("Puntos totales: " + numCorrectas3);
        tvCorrectasF.setText("Has acertado: " + numCorrectas3 + " preguntas");
        tvIncorrectasF.setText("Has fallado: " + numIncorrectas3 + " preguntas");
        tvPreguntasTotales.setText("Preguntas realizadas: " + numPreguntas3);

        btnContinuarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pbCarga3.setVisibility(View.VISIBLE);
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
