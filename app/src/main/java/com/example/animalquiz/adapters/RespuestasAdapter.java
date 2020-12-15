package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Mamiferos;
import com.example.animalquiz.javabean.Respuestas;

import java.util.ArrayList;

public class RespuestasAdapter extends RecyclerView.Adapter<RespuestasAdapter.RespuestasViewHolder> implements View.OnClickListener{

    private ArrayList<Respuestas> datosRespuestas;
    private View.OnClickListener aaListener;

    public RespuestasAdapter(ArrayList<Respuestas> datosRespuestas) {
        this.datosRespuestas = datosRespuestas;
    }

    public static class RespuestasViewHolder extends RecyclerView.ViewHolder {

        private TextView tvPregunta;
        private TextView tvRespuestaC;

        public RespuestasViewHolder(View v) {
            super(v);
            tvPregunta = v.findViewById(R.id.tv_pregunta);
            tvRespuestaC = v.findViewById(R.id.tv_respuesta_correcta);
        }

        public void bindListaItem(Respuestas r) {
            tvPregunta.setText(r.getPregunta());
            tvRespuestaC.setText(r.getrCorrecta());
        }
    }

    public RespuestasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_respuestas, parent, false);
        v.setOnClickListener(this);
        RespuestasViewHolder vh = new RespuestasAdapter.RespuestasViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RespuestasViewHolder holder, int position) {
        holder.bindListaItem(datosRespuestas.get(position));
    }

    @Override
    public int getItemCount() {
        return datosRespuestas.size();
    }

    @Override
    public void onClick(View v) {
        if (aaListener != null){
            aaListener.onClick(v);
        }
    }

    public void asignacionOnClickListener(View.OnClickListener listener) {

        aaListener = listener;
    }
}
