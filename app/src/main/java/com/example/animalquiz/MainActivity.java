package com.example.animalquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.animalquiz.login_register.LoginActivity;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    TextView tv_slogan;
    ProgressBar progressBar;
    TextView tvNomApp;
    Timer timer;

    private ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_slogan = findViewById(R.id.tvSlogan);
        tvNomApp = findViewById(R.id.tv_nomApp);

        imgLogo = findViewById(R.id.img_logo);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.zoom_mas_menos);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.zoom_menos_mas);
        Animation myanim3 = AnimationUtils.loadAnimation(this, R.anim.zoom_menos_mas2);

        imgLogo.startAnimation(myanim);
        tv_slogan.startAnimation(myanim2);
        tvNomApp.startAnimation(myanim3);
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}
