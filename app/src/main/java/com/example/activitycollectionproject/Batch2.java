package com.example.activitycollectionproject;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Batch2 extends AppCompatActivity {

    private GridLayout gridLayout;
    private Button returnButton;
    private int[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private Button[][] buttons;
    private int gridSize = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midterms_batch2);

        gridLayout = findViewById(R.id.gridLayout);
        returnButton = findViewById(R.id.returnButton);

        initializeGrid();

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeColors();
                enableCells(true);
            }
        });
    }

    private void initializeGrid() {
        buttons = new Button[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                final Button button = new Button(this);
                button.setLayoutParams(new GridLayout.LayoutParams());
                button.setBackgroundColor(randomColor());
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        changeColors(button);
                        if (checkWinCondition()) {
                            enableCells(false);
                        }
                    }
                });
                buttons[i][j] = button;
                gridLayout.addView(button);
            }
        }
    }

    private int randomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

    private void randomizeColors() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                buttons[i][j].setBackgroundColor(randomColor());
            }
        }
    }

    private void changeColors(Button button) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (buttons[i][j] == button) {
                    changeAdjacentColors(i, j);
                    return;
                }
            }
        }
    }

    private void changeAdjacentColors(int i, int j) {
        if (i > 0) changeColor(buttons[i - 1][j]);
        if (i < gridSize - 1) changeColor(buttons[i + 1][j]);
        if (j > 0) changeColor(buttons[i][j - 1]);
        if (j < gridSize - 1) changeColor(buttons[i][j + 1]);
    }

    private void changeColor(Button button) {
        int currentColor = ((ColorDrawable) button.getBackground()).getColor();
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == currentColor) {
                button.setBackgroundColor(colors[(i + 1) % colors.length]);
                return;
            }
        }
    }

    private boolean checkWinCondition() {
        int firstColor = ((ColorDrawable) buttons[0][0].getBackground()).getColor();
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (((ColorDrawable) buttons[i][j].getBackground()).getColor() != firstColor) {
                    return false;
                }
            }
        }
        return true;
    }

    private void enableCells(boolean enabled) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                buttons[i][j].setEnabled(enabled);
            }
        }
    }
}

