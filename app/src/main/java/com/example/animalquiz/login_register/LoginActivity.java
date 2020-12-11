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
import com.example.animalquiz.activities.PrincipalActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    FirebaseAuth fa;
    FirebaseUser fu;

    EditText etEmail;
    EditText etContraseña;
    String email;
    String passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fa = FirebaseAuth.getInstance();

        progressBar = findViewById(R.id.progressBarLogin);

        progressBar.setVisibility(View.GONE);

        etEmail = findViewById(R.id.etEmail);
        etContraseña = findViewById(R.id.etContraseña);

        fu = fa.getCurrentUser();

        if (fu != null){
            etEmail.setText(fu.getEmail());
        }
    }

    public void entrar(View view) {

        String msj = validarDatos();

        if (msj != null){
            Toast.makeText(this, msj , Toast.LENGTH_LONG).show();
        }else {
            fa.signInWithEmailAndPassword(email, passw)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                fu = fa.getCurrentUser();

                                progressBar.setVisibility(View.VISIBLE);

                                etEmail.setText("");
                                etContraseña.setText("");

                                Intent i = new Intent(LoginActivity.this, PrincipalActivity.class);
                                //i.putExtra(CLAVE_EMAIL, fu.getEmail());
                                startActivity(i);

                            } else {
                                Toast.makeText(LoginActivity.this, 	getString(R.string.msj_no_accede),Toast.LENGTH_SHORT).show();
                            } } });
        }

    }

    private String validarDatos(){
        email = etEmail.getText().toString().trim();
        passw = etContraseña.getText().toString().trim();
        String msj = null;

        if (email.isEmpty() || passw.isEmpty()){
            msj = getString(R.string.no_datos);
        }
        return msj;
    }

    public void registrarse(View view) {
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }
}
