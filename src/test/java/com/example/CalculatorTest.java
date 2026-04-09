package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator.
 * Includes one intentional failing test for demonstration.
 */
public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calc.subtract(2, 3), "2 - 3 should equal -1");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0), "Division by zero should throw");
    }

    @Test
    public void failingTestExample() {
        // Intentional failing test: expecting wrong value
        assertEquals(10, calc.add(2, 3), "Intentional failing test: 2 + 3 != 10");
    }
}
