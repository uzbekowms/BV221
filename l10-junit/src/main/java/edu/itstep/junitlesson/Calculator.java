package edu.itstep.junitlesson;

public class Calculator {


    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Argument cannot be zero");
        }
        return (double) a / b;
    }
}
