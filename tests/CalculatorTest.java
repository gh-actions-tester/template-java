package com.example.calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int expected = 30;
        int actual = calculator.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int a = 20;
        int b = 10;
        int expected = 10;
        int actual = calculator.subtract(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int a = 10;
        int b = 20;
        int expected = 200;
        int actual = calculator.multiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int a = 20;
        int b = 10;
        int expected = 2;
        int actual = calculator.divide(a, b);
        assertEquals(expected, actual);
    }
}
