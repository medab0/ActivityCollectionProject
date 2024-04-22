package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLayout, btnButton, btnCalculator, btnMatch3, btnPassingIntent, btnFragments, btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayout = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent layoutActivity = new Intent(MainActivity.this, LayoutTestingActivity.class);
                startActivity(layoutActivity);
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
                Toast toast = Toast.makeText(MainActivity.this, "Moriel Edgar Deandre A. Bien, Match 3", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnPassingIntent = (Button) findViewById(R.id.btnPassingIntent);
        btnPassingIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(buttonActivity);
            }
        });

        btnFragments = (Button) findViewById(R.id.btnFragments);
        btnFragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(buttonActivity);
            }
        });
        btnMenu = (Button) findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(buttonActivity);
            }
        });
    }
}