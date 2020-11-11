package com.example.animalquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalquiz.activities.PrincipalActivity;
import com.example.animalquiz.activityQuiz1.Quiz1Activity;
import com.example.animalquiz.activityQuiz2.Quiz2Activity;
import com.example.animalquiz.activityQuiz3.Quiz3Activity;

public class PrincipalQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_quiz);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal_quiz, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemHome){
            Intent home = new Intent(this, PrincipalActivity.class);
            startActivity(home);
        }else if (item.getItemId() == R.id.itemEditarPerfilQuiz){
            Toast.makeText(this, "Próximamente", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.itemDesarrolladoresQuiz){
            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle("Salir app");
            dialogo1.setMessage("¿ Desea salir de la app ?");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    finish();
                    onDestroy();
                }
            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    dialogo1.dismiss();
                }
            });
            dialogo1.show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void entrarPrincipal(View v){
        Intent i = new Intent(PrincipalQuizActivity.this, PrincipalActivity.class);
        startActivity(i);
    }

    public void entrarQuiz1(View v){
        Intent i = new Intent(PrincipalQuizActivity.this, Quiz1Activity.class);
        startActivity(i);
    }

    public void entrarQuiz2(View view) {
        Intent i = new Intent(this, Quiz2Activity.class);
        startActivity(i);
    }

    public void entrarQuiz3 (View v){
        Intent i = new Intent(this, Quiz3Activity.class);
        startActivity(i);
    }
}
