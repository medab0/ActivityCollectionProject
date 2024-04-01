package com.example.activitycollectionproject;

public class Match3 {


    /*
    import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final int GRID_SIZE = 5;
    private static final int COLORS_COUNT = 4;

    private Button[][] buttons;
    private TextView scoreTextView;
    private Button restartButton;

    private int[][] grid;
    private int score;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = new Button[GRID_SIZE][GRID_SIZE];
        grid = new int[GRID_SIZE][GRID_SIZE];
        random = new Random();

        scoreTextView = findViewById(R.id.scoreTextView);
        restartButton = findViewById(R.id.buttonRestart);

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame();
            }
        });

        initializeGrid();
        restartGame();
    }

    private void initializeGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            TableRow tableRow = findViewById(getResources().getIdentifier("tblrw" + (i + 1), "id", getPackageName()));
            for (int j = 0; j < GRID_SIZE; j++) {
                Button button = tableRow.findViewById(getResources().getIdentifier("button" + ((i * GRID_SIZE) + j + 1), "id", getPackageName()));
                buttons[i][j] = button;
                final int finalI = i;
                final int finalJ = j;
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        handleButtonClick(finalI, finalJ);
                    }
                });
            }
        }
    }

    private void handleButtonClick(int x, int y) {
        if (x > 0) {
            swapCells(x, y, x - 1, y); // Swap with upper neighbor
        }
        if (x < GRID_SIZE - 1) {
            swapCells(x, y, x + 1, y); // Swap with lower neighbor
        }
        if (y > 0) {
            swapCells(x, y, x, y - 1); // Swap with left neighbor
        }
        if (y < GRID_SIZE - 1) {
            swapCells(x, y, x, y + 1); // Swap with right neighbor
        }
        checkMatches();
    }

    private void swapCells(int x1, int y1, int x2, int y2) {
        int tempColor = grid[x1][y1];
        grid[x1][y1] = grid[x2][y2];
        grid[x2][y2] = tempColor;
        updateButtonColor(x1, y1);
        updateButtonColor(x2, y2);
    }

    private void updateButtonColor(int x, int y) {
        buttons[x][y].setBackgroundColor(getColorForCell(grid[x][y]));
    }

    private void checkMatches() {
        // Your logic to check for matches goes here
        // Once matches are found, update score and UI
        // Example:
        score++;
        updateScore();
    }

    private void updateScore() {
        scoreTextView.setText(getString(R.string.score, score));
    }

    private void restartGame() {
        score = 0;
        // Reset the grid and UI to initial state
        // Example:
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = random.nextInt(COLORS_COUNT);
                updateButtonColor(i, j);
            }
        }
        updateScore();
    }

    private int getColorForCell(int colorIndex) {
        // Your logic to map color index to actual color goes here
        // Example:
        switch (colorIndex) {
            case 0:
                return getResources().getColor(android.R.color.holo_red_light);
            case 1:
                return getResources().getColor(android.R.color.holo_green_light);
            case 2:
                return getResources().getColor(android.R.color.holo_blue_light);
            case 3:
                return getResources().getColor(android.R.color.holo_orange_light);
            default:
                return getResources().getColor(android.R.color.white);
        }
    }
}

*/
}
