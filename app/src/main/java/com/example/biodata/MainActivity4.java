package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> openactivity1());
    }



    public void openactivity1()  {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}