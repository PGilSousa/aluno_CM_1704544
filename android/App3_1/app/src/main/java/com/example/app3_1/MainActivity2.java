package com.example.app3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void send4(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey4);
    }

    public void send5(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey5);
    }

    public void send6(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey6);
    }

    public void send7(View view) {
        ImageView iv;
        iv=findViewById(R.id.imageView2);
        iv.setImageResource(R.mipmap.mickey7);
    }
}