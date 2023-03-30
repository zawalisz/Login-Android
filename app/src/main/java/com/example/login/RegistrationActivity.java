package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText login = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText pwd = (EditText) findViewById(R.id.editTextTextPassword);

        Button registrationBut = (Button) findViewById(R.id.button3);

        registrationBut.setOnClickListener(view -> {
            String loginValue = login.getText().toString();
            String pwdValue = pwd.getText().toString();
            Intent intentRegistration = new Intent(this, MainActivity.class);
            intentRegistration.putExtra("login", loginValue);
            intentRegistration.putExtra("password", pwdValue);
            startActivity(intentRegistration);
        });
    }
}