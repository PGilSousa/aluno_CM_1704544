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
}