package com.example.fitnessplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpperBody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);
    }

    public void sendMain7(View view) {
        Intent intent=new Intent(this,lowerbody.class);
        startActivity(intent);
    }
}