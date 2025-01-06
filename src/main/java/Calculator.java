package com.employee;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Ví dụ sử dụng
        System.out.println("Addition: " + calculator.add(5, 3));       // Kết quả: 8
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Kết quả: 2
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Kết quả: 15
        System.out.println("Division: " + calculator.divide(6, 2));   // Kết quả: 3.0

        // Thử nghiệm lỗi chia cho 0
        try {
            calculator.divide(5, 0);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}