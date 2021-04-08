package com.latihan.a10118320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnprofile (View view){
        Intent intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }

    public void btnlogout (View view){
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }
}