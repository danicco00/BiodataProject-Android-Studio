package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(v -> openactivity2());
        button2.setOnClickListener(v -> openactivity3());
        button3.setOnClickListener(v -> openactivity4());
        button4.setOnClickListener(v -> openactivity5());
    }


         public void openactivity2() {

            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        public void openactivity3() {

            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
        public void openactivity4() {

        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        }
        public void openactivity5() {

        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }}
