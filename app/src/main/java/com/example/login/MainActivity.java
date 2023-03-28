package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okBut = (Button) findViewById(R.id.button);
        Button regBut = (Button) findViewById(R.id.button2);

        regBut.setOnClickListener(view -> {
            Intent intentRegestration = new Intent(this, RegistrationActivity.class);
            startActivity(intentRegestration);
        });

        okBut.setOnClickListener(but -> {
            Bundle arguments = getIntent().getExtras();
            if (arguments != null) {
                String login = arguments.get("login").toString();
                String password = arguments.get("password").toString();
                Toast.makeText(this, login, Toast.LENGTH_SHORT).show();
            }
        });

    }
}