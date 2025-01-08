import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class CalculatorTest {

    Calculator calc = new Calculator(); // Khởi tạo đối tượng Calculator

    @Test
    void testAdd() {
        assertEquals(
                new BigDecimal("8"),
                calc.add(new BigDecimal("5"), new BigDecimal("3")),
                "Addition failed"
        );
    }

    @Test
    void testSubtract() {
        assertEquals(
                new BigDecimal("2"),
                calc.subtract(new BigDecimal("5"), new BigDecimal("3")),
                "Subtraction failed"
        );
    }

    @Test
    void testMultiply() {
        assertEquals(
                new BigDecimal("20"),
                calc.multiply(new BigDecimal("4"), new BigDecimal("5")),
                "Multiplication failed"
        );
    }

    @Test
    void testDivide() {
        assertEquals(
                new BigDecimal("4"),
                calc.divide(new BigDecimal("20"), new BigDecimal("5")),
                "Division failed"
        );
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calc.divide(new BigDecimal("1"), BigDecimal.ZERO)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(
                new BigDecimal("64"),
                calc.power(new BigDecimal("4"), 3),
                "Power calculation failed"
        );
    }

    @Test
    void testSqrt() {
        assertEquals(
                new BigDecimal("5"),
                calc.sqrt(new BigDecimal("25")).setScale(0), // Làm tròn đến 0 chữ số sau dấu thập phân
                "Square root calculation failed"
        );
    }

    @Test
    void testSqrtNegative() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calc.sqrt(new BigDecimal("-25"))
        );
        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }
}