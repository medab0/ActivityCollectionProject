package com.example.activitycollectionproject;


import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Calculator {
    String numbers;

    // Calls the string
    public Calculator(String str) {
        this.numbers = str;
    }
    // The main function when PEMDAS is applied
    public String calculate() {
        if(numbers.length() == 0) {
            return "0";
        } else if(numbers.charAt(0) == '+' ||
                numbers.charAt(0) == '-' ||
                numbers.charAt(0) == '*' ||
                numbers.charAt(0) == '/') {
            return "ERROR";
        }

        List<String> list = parseDisplay(numbers);
        Stack<String> stack = infixToPostfix(list);

        Stack<Double> resultStack = new Stack<>();
        double num1 = 0, num2 = 0;

        // While loop for the implementation of the stack
        while(!stack.isEmpty()) {
            String token = stack.remove(0);
            if(Objects.equals(token, ".")) {
                return "ERROR";
            }
            // If-else for the operations
            if (isOperator(token)) {
                num2 = resultStack.pop();
                num1 = resultStack.pop();
                switch(token) {
                    case "+":
                        resultStack.push(num1 + num2);
                        break;
                    case "-":
                        resultStack.push(num1 - num2);
                        break;
                    case "*":
                        resultStack.push(num1 * num2);
                        break;
                    case "/":
                        if (num2 == 0) {
                            return "UNDEFINED";
                        } else {
                            resultStack.push(num1 / num2);
                        }
                        break;
                }
            } else {
                resultStack.push(Double.parseDouble(token));
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(resultStack.pop());
    }

    // Sequential Operations when PEMDAS is not yet applied
    public String sequential() {
        if(numbers.length() == 0) {
            return "0";
        } else if(numbers.charAt(0) == '+' ||
                numbers.charAt(0) == '-' ||
                numbers.charAt(0) == '*' ||
                numbers.charAt(0) == '/') {
            return "ERROR";
        }

        // Parse String
        List<String> list = parseDisplay(numbers);

        double num1 = 0, num2 = 0, total = 0;
        while(list.size() > 1) {
            if(list.get(0).equals(".")) {
                return "ERROR";
            } else {
                num1 = Double.parseDouble(list.remove(0));
            }
            String operator = list.remove(0);

            // Operations for Sequential
            if(list.get(0).equals(".")) {
                return "ERROR";
            } else {
                num2 = Double.parseDouble(list.remove(0));
            }
            switch(operator) {
                case "+":
                    total = num1 + num2;
                    break;
                case "-":
                    total = num1 - num2;
                    break;
                case "*":
                    total = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        return "UNDEFINED";
                    } else {
                        total = num1 / num2;
                    }
                    break;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            list.add(0, decimalFormat.format(total));
        }

        return list.get(list.size() - 1);
    }

    //  Conversion of the string to CharArray
    private List<String> parseDisplay(String str){
        char[] chars = str.toCharArray();
        StringBuilder number = new StringBuilder();
        List<String> list = new LinkedList<>();
        for(int i = 0; i < str.length(); i++) {
            if (Character.isDigit(chars[i]) || chars[i] == '.') {
                number.append(chars[i]);
                if(i == str.length() - 1) {
                    list.add(new String(number));
                    //number = new StringBuilder();
                }
            } else {
                list.add(new String(number));
                number = new StringBuilder();
                if(i <= str.length() - 2) {
                    list.add(String.valueOf(chars[i]));
                }
            }
        }
        return list;
    }

    // To rearrange the operators using precedence() via PEMDAS
    private Stack<String> infixToPostfix(List<String> list) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (String symbol : list) {
            if (isOperator(symbol)) {
                while (!stack1.isEmpty() && precedence(symbol) <= precedence(stack1.peek())) {
                    stack2.push(stack1.pop());
                }
                stack1.push(symbol);
            } else {
                stack2.push(symbol);
            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2;
    }

    public static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }


    // To check which operator is used
    private int precedence(String str) {
        if (str.equals("+")  || str.equals("-") ) {
            return 1;
        } else if (str.equals("*")  || str.equals("/") ) {
            return 2;
        }
        return 0;
    }
}