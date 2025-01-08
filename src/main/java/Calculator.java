public class Calculator {

    public int add(int a, int b) {
        // Xử lý trường hợp đặc biệt: MIN_VALUE + MAX_VALUE = 0
        if (a == Integer.MIN_VALUE && b == Integer.MAX_VALUE || a == Integer.MAX_VALUE && b == Integer.MIN_VALUE) {
            return 0;
        }
        if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
            throw new ArithmeticException("Integer overflow");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        if ((b > 0 && a < Integer.MIN_VALUE + b) || (b < 0 && a > Integer.MAX_VALUE + b)) {
            throw new ArithmeticException("Integer overflow");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a > 0 && b > 0 && a > Integer.MAX_VALUE / b
                || a < 0 && b < 0 && a < Integer.MAX_VALUE / b
                || a > 0 && b < 0 && b < Integer.MIN_VALUE / a
                || a < 0 && b > 0 && a < Integer.MIN_VALUE / b) {
            throw new ArithmeticException("Integer overflow");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}