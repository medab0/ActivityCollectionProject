package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayout, btnButton, btnCalculator, btnMatch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "Bien, Moriel Edgar Deandre", Toast.LENGTH_SHORT).show();
        btnLayout = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent layoutActivity = new Intent(MainActivity.this, LayoutTestingActivity.class);
                startActivity(layoutActivity);
            }
        });
        btnCalculator = (Button) findViewById(R.id.btnCalculator);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcu = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(calcu);
            }
        });
        btnMatch3 = (Button) findViewById(R.id.btnMatch3);
        btnMatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent match3 = new Intent(MainActivity.this, Match3.class);
                startActivity(match3);
            }
        });

        btnButton = (Button) findViewById(R.id.btnButtonExercise);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(buttonActivity);
            }
        });
    }
}