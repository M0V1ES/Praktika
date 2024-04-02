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

public class forgot_password extends AppCompatActivity {
    private EditText email;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        button = (Button) findViewById(R.id.button2);
        if (isEmail(email)){
            button.setClickable(true);
        }
        if(button.isClickable()){
            button.setBackgroundColor(0x0560FA);
        }
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        Intent intent = new Intent(this, Log_in.class);
        startActivity(intent);
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}