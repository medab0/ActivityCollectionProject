package com.example.activitycollectionproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Map;

public class MapsExercise extends AppCompatActivity {
    ImageButton btnCoron, btnDaikoku, btnNewZealand, btnSiargao, btnNurburgring;
    ConstraintLayout MapsExercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);
        MapsExercise = findViewById(R.id.MapsExercise);

        btnCoron = (ImageButton) findViewById(R.id.btnCoron);
        btnCoron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:11.948194744247635, 120.20994303787087"));
                startActivity(intent);
                MapsExercise.setBackgroundResource(R.drawable.coron);
            }
        });
        btnSiargao = (ImageButton) findViewById(R.id.btnSiargao);
        btnSiargao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.810472025615013, 126.15512269422327"));
                startActivity(intent);
                MapsExercise.setBackgroundResource(R.drawable.siargao);
            }
        });
        btnDaikoku = (ImageButton) findViewById(R.id.btnDaikoku);
        btnDaikoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.46198372049559, 139.68051209659475"));
                startActivity(intent);
                MapsExercise.setBackgroundResource(R.drawable.daikoku);
            }
        });
        btnNurburgring = (ImageButton) findViewById(R.id.btnNurburgring);
        btnNurburgring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.33324434791754, 6.9458994679442325"));
                startActivity(intent);
                MapsExercise.setBackgroundResource(R.drawable.nurburgring);
            }
        });
        btnNewZealand = (ImageButton) findViewById(R.id.btnNewZealand);
        btnNewZealand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-45.027961888948035, 168.68365690103212"));
                startActivity(intent);
                MapsExercise.setBackgroundResource(R.drawable.newzealand);
            }
        });

    }
}


