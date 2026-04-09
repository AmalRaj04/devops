package com.example;

/**
 * Simple calculator with basic integer operations.
 * Methods are small and documented for beginners.
 */
public class Calculator {

    // Adds two integers and returns the result.
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a and returns the result.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two integers and returns the result.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides a by b and returns the integer quotient.
    // Throws ArithmeticException if b is zero.
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
