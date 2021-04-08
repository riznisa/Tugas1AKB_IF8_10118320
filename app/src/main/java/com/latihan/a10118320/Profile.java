package com.latihan.a10118320;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void btnprofile (View view){
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }
}