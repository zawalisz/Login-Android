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
        EditText editTextLogin = findViewById(R.id.editTextTextPersonName);
        EditText editTextPassword = findViewById(R.id.editTextTextPassword2);

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

    }
}