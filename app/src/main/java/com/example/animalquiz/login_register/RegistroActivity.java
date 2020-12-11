package com.example.animalquiz.login_register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.animalquiz.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistroActivity extends AppCompatActivity {

    private ProgressBar progressBarR;

    FirebaseAuth fa;
    FirebaseUser fu;

    EditText etEmailR;
    EditText etContraseñaR;
    String emailR;
    String passwR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        fa = FirebaseAuth.getInstance();

        progressBarR = findViewById(R.id.progressBarR);
        etEmailR = findViewById(R.id.etEmailR);
        etContraseñaR = findViewById(R.id.etContraseñaR);

        progressBarR.setVisibility(View.GONE);

        fu = fa.getCurrentUser();

        if (fu != null){
            etEmailR.setText(fu.getEmail());
        }
    }

    public void registro(View view) {
        String msj = validarDatos();

        if (msj != null){
            Toast.makeText(this, msj , Toast.LENGTH_LONG).show();
        }else {
            fa.createUserWithEmailAndPassword(emailR, passwR)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                progressBarR.setVisibility(View.VISIBLE);
                                fu = fa.getCurrentUser();

                                Intent i = new Intent(RegistroActivity.this, LoginActivity.class);
                                startActivity(i);

                                Toast.makeText(RegistroActivity.this, getString(R.string.msj_registrado), Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(RegistroActivity.this, getString(R.string.msj_no_registrado), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }
    }

    private String validarDatos(){
        emailR = etEmailR.getText().toString().trim();
        passwR = etContraseñaR.getText().toString().trim();
        String msj = null;

        if (emailR.isEmpty() || passwR.isEmpty()){
            msj = getString(R.string.no_datos);
        }
        return msj;
    }

    public void volver(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
