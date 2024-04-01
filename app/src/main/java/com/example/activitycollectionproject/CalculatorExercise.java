package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorExercise extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPoint, btnClearEverything, btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals, btnPercentage, btnClear;
    TextView displayText, displayAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPoint = findViewById(R.id.btnPoint);
        btnClearEverything = findViewById(R.id.btnClearEverything);
        btnClear = findViewById(R.id.btnClear);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEquals = findViewById(R.id.btnEquals);
        btnPercentage = findViewById(R.id.btnPercent);
        displayText = findViewById(R.id.displayText);
        displayAnswer = findViewById(R.id.displayAnswer);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "1");
                update();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "2");
                update();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "3");
                update();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "4");
                update();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "5");
                update();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "6");
                update();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "7");
                update();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "8");
                update();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "9");
                update();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + "0");
                update();
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(displayText.getText() + ".");
                update();
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = displayText.getText().toString();
                displayText.setText(displayText.getText() + "+");
                if(Calculator.isOperator(temp.charAt(temp.length() - 1) + "")) {
                    displayText.setText(temp.substring(0, temp.length() - 1));
                }
                update();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = displayText.getText().toString();
                displayText.setText(displayText.getText() + "-");
                if(Calculator.isOperator(temp.charAt(temp.length() - 1) + "")) {
                    displayText.setText(temp.substring(0, temp.length() - 1));
                }
                update();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = displayText.getText().toString();
                displayText.setText(displayText.getText() + "*");
                if(Calculator.isOperator(temp.charAt(temp.length() - 1) + "")) {
                    displayText.setText(temp.substring(0, temp.length() - 1));
                }
                update();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = displayText.getText().toString();
                displayText.setText(displayText.getText() + "/");
                if(Calculator.isOperator(temp.charAt(temp.length() - 1) + "")) {
                    displayText.setText(temp.substring(0, temp.length() - 1));
                }
                update();
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculator calculator = new Calculator(displayText.getText().toString());
                displayAnswer.setText(calculator.calculate());
            }
        });
        btnClearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText("");
                displayAnswer.setText("0");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText("");
                update();
            }
        });
    }
    private void update() {
        Calculator calculator = new Calculator(displayText.getText().toString());
        displayAnswer.setText(calculator.sequential());
    }
}