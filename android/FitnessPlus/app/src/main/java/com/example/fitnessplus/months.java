package com.example.fitnessplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class months extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);
    }

    public void sendMain20(View view) {
        Intent intent=new Intent(this,lowerbody.class);
        startActivity(intent);
    }

    public void sendMain21(View view) {
        Intent intent=new Intent(this,UpperBody.class);
        startActivity(intent);
    }
}