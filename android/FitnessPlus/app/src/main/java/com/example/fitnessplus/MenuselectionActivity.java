package com.example.fitnessplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuselectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuselection);
    }
    public void sendMain(View view) {
        Intent intent=new Intent(this,TrainActivity.class);
        startActivity(intent);
    }

    public void sendMain2(View view) {
        Intent intent=new Intent(this, months.class);
        startActivity(intent);
    }

    public void sendMain3(View view) {
        Intent intent=new Intent(this, calories.class);
        startActivity(intent);
    }

    public void sendMain4(View view) {
        Intent intent=new Intent(this, Conta.class);
        startActivity(intent);
    }
}