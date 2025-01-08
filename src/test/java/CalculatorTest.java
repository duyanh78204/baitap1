import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "Addition of 2 and 3 should be 5");
        assertEquals(0, calculator.add(0, 0), "Addition of 0 and 0 should be 0");
        assertEquals(-5, calculator.add(-2, -3), "Addition of -2 and -3 should be -5");
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1), "Adding beyond MAX_VALUE should throw exception");
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, calculator.subtract(2, 3), "Subtraction of 3 from 2 should be -1");
        assertEquals(0, calculator.subtract(0, 0), "Subtraction of 0 from 0 should be 0");
        assertThrows(ArithmeticException.class, () -> calculator.subtract(Integer.MIN_VALUE, 1), "Subtracting beyond MIN_VALUE should throw exception");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "Multiplication of 2 and 3 should be 6");
        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2), "Multiplying MAX_VALUE by 2 should throw exception");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "Division of 6 by 3 should be 2");
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0), "Division by zero should throw exception");
    }

    @Test
    void testEdgeCases() {
        // Trường hợp đặc biệt
        assertEquals(0, calculator.add(Integer.MIN_VALUE, Integer.MAX_VALUE), "Sum of MIN_VALUE and MAX_VALUE should be 0");
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0), "Adding MAX_VALUE and 0 should return MAX_VALUE");
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE, 0), "Adding MIN_VALUE and 0 should return MIN_VALUE");
    }
}