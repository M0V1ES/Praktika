package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Log_in extends AppCompatActivity {
    private EditText email, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        password = (EditText) findViewById(R.id.editTextTextPassword3);
        login = (Button) findViewById(R.id.button2);
        if(isEmail(email) && password.length() != 0){
            login.setClickable(true);
        }
        if (login.isClickable()){
            login.setBackgroundColor(0x0560FA);
        }

    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public void onClick(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        Intent intent = new Intent(this, Sign_up.class);
        startActivity(intent);
    }
    public void onClick3(View view){
        Intent intent = new Intent(this, forgot_password.class);
        startActivity(intent);
    }
}