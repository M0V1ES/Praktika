package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sign_up extends AppCompatActivity {
    private EditText name, password, phone, email, check_pas;
    private Button login;
    private CheckBox policy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.editTextText);
        phone = (EditText) findViewById(R.id.editTextPhone);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        check_pas = (EditText) findViewById(R.id.editTextTextPassword2);
        login = (Button) findViewById(R.id.button2);
        policy = (CheckBox) findViewById(R.id.checkBox);

        if ((name.length() != 0) && (phone.length() != 0) && (isEmail(email)) && (password.length() !=0) && (check_pas == password) && (policy.isChecked())){
            login.setClickable(true);
        }
        if (login.isClickable()){
            login.setBackgroundColor(0x0560FA);
        }

    }
    public void onClick(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}