package com.example.activitycollectionproject;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class Match3 extends AppCompatActivity {

    int[] COLOR = {Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,};

    Button button[][] = new Button[5][5];

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3_exercise);

        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 5; col++){
                String res = "button" + row + col;
                int resId = getResources().getIdentifier(res, "id", this.getPackageName());
                button[row][col] = findViewById(resId);
            }
        }
        randomize();



        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int finalI = i;
                int finalJ = j;
                button[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        handleButtonClick(finalI, finalJ);
                    }
                });
            }
        }

        Button reset = (Button) findViewById(R.id.btnRestart);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomize();
            }
        });
    }

    private void randomize(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int temp = rand.nextInt(4);
                button[i][j].setBackgroundColor(COLOR[temp]);
            }
        }
    }
    private Button selectedButton = null;
    private void handleButtonClick(int row, int col) {
        if (selectedButton == null) {
            selectedButton = button[row][col];
            return;
        }
        if(button[row - 1][col] == selectedButton || button[row + 1][col] == selectedButton ||
                button[row][col + 1] == selectedButton || button[row][col - 1] == selectedButton){
            swapColors(selectedButton, button[row][col]);
        }
        selectedButton = null;
    }

    private void swapColors(Button button1, Button button2) {
        Drawable colorDrawable1 = button1.getBackground();
        Drawable colorDrawable2 = button2.getBackground();

        int color1 = ((ColorDrawable) colorDrawable1).getColor();
        int color2 = ((ColorDrawable) colorDrawable2).getColor();

        button1.setBackgroundColor(color2);
        button2.setBackgroundColor(color1);
    }

}