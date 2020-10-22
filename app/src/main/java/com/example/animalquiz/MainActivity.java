package com.example.animalquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.animalquiz.activities.PrincipalActivity;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    TextView tv_slogan;
    ProgressBar progressBar;
    TextView tvCarga;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Animation rotate = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        tv_slogan.startAnimation(rotate);*/

        progressBar = findViewById(R.id.progressBar);
        tvCarga = findViewById(R.id.tvCarga);

        timer = new Timer();

        // hola

        progressBar.setVisibility(View.INVISIBLE);
        tvCarga.setVisibility(View.INVISIBLE);

        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tvCarga.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.VISIBLE);

                Intent intent = new Intent(MainActivity
                        .this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
