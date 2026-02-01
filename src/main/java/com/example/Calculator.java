package com.example;

public class Calculator {

    public int calculate(int a, int b, String op) {
        switch (op) {
            case "add":
                return add(a, b);
            case "sub":
                return subtract(a, b);
            case "mul":
                return multiply(a, b);
            case "div":
                return divide(a, b);
            case "mod":
                return modulo(a, b);
            case "pow":
                return power(a, b);
            default:
                return 0;
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    private int modulo(int a, int b) {
        return a % b;
    }

    private int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }

}
