package com.example.activitycollectionproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class activity_button_exercise extends AppCompatActivity {

    Button changebgcolor, changebgbuttoncolor, hide, exit, toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        changebgcolor = findViewById(R.id.btnChangeBackground);
        changebgcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                ConstraintLayout constraintLayout = findViewById(R.id.buttonExercise);
                constraintLayout.setBackgroundColor(color);
            }


        });
        changebgbuttoncolor = findViewById(R.id.btnChangeBackgroundButton);
        changebgbuttoncolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                changebgbuttoncolor.setBackgroundColor(color);
            }


        });

        hide = (Button) findViewById(R.id.btnHide);
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hide.setVisibility(View.GONE);
            }
        });

        toast = (Button) findViewById(R.id.btnToast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_button_exercise.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });

        exit = (Button) findViewById(R.id.btnExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ret = new Intent(activity_button_exercise.this, MainActivity.class);
                startActivity(ret);
            }
        });
    }
}