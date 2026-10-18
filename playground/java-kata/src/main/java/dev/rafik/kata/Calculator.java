package dev.rafik.kata;

/**
 * Deliberately poor code: loops instead of operators, a magic -1 for errors,
 * printing instead of returning, duplicated calls. Ask your assistant to
 * refactor it without changing what {@link CalculatorTest} observes.
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Multiplication: " + 5 * 3);
        if (divide(6, 3) != -1) {
            System.out.println("Division: " + divide(6, 3));
        }
        if (divide(5, 0) != -1) {
            System.out.println("Division by zero test passed");
        }
    }

    public static int add(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result++;
        }
        for (int i = 0; i < a; i++) {
            result++;
        }
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            result--;
        }
        return result;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return -1;
        }
        int count = 0;
        int x = a;
        while (x >= b) {
            x = x - b;
            count++;
        }
        return count;
    }
}
