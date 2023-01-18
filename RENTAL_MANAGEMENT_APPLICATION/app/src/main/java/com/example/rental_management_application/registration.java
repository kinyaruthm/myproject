package com.example.rental_management_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        EditText name = findViewById(R.id.name);
        EditText password = findViewById(R.id.passwrd);
        EditText email = findViewById(R.id.email);
        EditText username = findViewById(R.id.username);
        EditText phone = findViewById(R.id.phoneno);
        Button signup = findViewById(R.id.btn2);
        Button login = findViewById(R.id.btn3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log_in= new Intent(registration.this, MainActivity.class);
                startActivity(log_in);
            }
        });
    }

}