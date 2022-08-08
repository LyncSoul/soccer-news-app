package me.dio.soccernews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import me.dio.soccernews.R;

public class FormLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_form_login);

        TextView email = findViewById(R.id.edit_email);
        TextView senha = findViewById(R.id.edit_senha);

        Button logar = findViewById(R.id.btn_entrar);

        //processoseletivo | lucasaprovado
        logar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (email.getText().toString().equals("processoseletivo") && senha.getText().toString().equals("lucasaprovado")) {
                    finish();
                    Intent intent = new Intent(view.getContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Você não acertou o resultado!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        }
}