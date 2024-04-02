package com.example.splash;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class New_password extends AppCompatActivity {
    private EditText password, check_pas;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
        password = (EditText) findViewById(R.id.editTextTextPassword4);
        check_pas = (EditText) findViewById(R.id.editTextTextPassword5);
        button = (Button) findViewById(R.id.button2);
        if(password.length() !=0 && check_pas == password){
            button.setClickable(true);
        }
        if(button.isClickable()){
            button.setBackgroundColor(0x0560FA);
        }
    }
}