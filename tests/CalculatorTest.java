import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 3;
        int b = 4;
        int expected = 7;
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {
        int a = 6;
        int b = 4;
        int expected = 2;
        int result = calculator.subtract(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        int a = 5;
        int b = 4;
        int expected = 20;
        int result = calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        int a = 10;
        int b = 2;
        int expected = 5;
        int result = calculator.divide(a, b);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        calculator.divide(a, b);
    }
}
