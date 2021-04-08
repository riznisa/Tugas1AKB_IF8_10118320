package com.latihan.a10118320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void btnlogin (View view){
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);

    }

    public void btnregister (View view){
        Intent i = new Intent(Login.this, Registrasi.class);
        startActivity(i);
    }

}