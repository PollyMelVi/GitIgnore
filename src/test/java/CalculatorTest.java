import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.addition(3, 7));
        assertEquals(10, calculator.addition(1, 9));
        assertEquals(10, calculator.addition(4, 6));
        assertEquals(10, calculator.addition(-10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtraction(35, 25));
        assertEquals(10, calculator.subtraction(1050, 1040));
        assertEquals(10, calculator.subtraction(-10, -20));
        assertEquals(10, calculator.subtraction(119, 109));
    }

    @Test
    void testMultiplication() {
        assertEquals(100, calculator.multiplication(2, 50));
        assertEquals(100, calculator.multiplication(-50, -2));
        assertEquals(100, calculator.multiplication(10, 10));
        assertEquals(180, calculator.multiplication(30, 6));
    }
    @Test
    void testDif() {
        assertEquals(100, calculator.div(1000, 10));
        assertEquals(100, calculator.div(200, 2));
        assertEquals(100, calculator.div(50, 0.5));
        assertEquals(100, calculator.div(-500, -5));
    }

}

