package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okBut = (Button) findViewById(R.id.button);
        Button regBut = (Button) findViewById(R.id.button2);
        EditText editTextLogin = findViewById(R.id.editTextLogin);
        EditText editTextPassword = findViewById(R.id.editTextPassword);

        regBut.setOnClickListener(view -> {
            Intent intentRegistration = new Intent(this, RegistrationActivity.class);
            startActivity(intentRegistration);
        });

        okBut.setOnClickListener(view -> {
            String login = editTextLogin.getText().toString();
            String password = editTextPassword.getText().toString();

            if (TextUtils.isEmpty(login) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Nie wpisałeś loginu lub hasła", Toast.LENGTH_SHORT).show();
            } else {
                Intent intentWelcome = new Intent(this, WelcomeActivity.class);
                intentWelcome.putExtra("login", login);
                startActivity(intentWelcome);
            }
        });

/*
        okBut.setOnClickListener(but -> {
            Bundle arguments = getIntent().getExtras();
            if (arguments != null) {
                String login = arguments.get("login").toString();
                String password = arguments.get("password").toString();
                Toast.makeText(this, login, Toast.LENGTH_SHORT).show();
                Intent intentWelcome = new Intent(this, WelcomeActivity.class);
                startActivity(intentWelcome);
            }else{
                Toast.makeText(getApplicationContext(), "Nie wpisałeś loginu lub hasła", Toast.LENGTH_SHORT).show();
            }
        });
*/
    }
}