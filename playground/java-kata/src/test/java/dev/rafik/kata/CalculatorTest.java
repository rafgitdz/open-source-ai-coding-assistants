package dev.rafik.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Characterization tests: they pin down what the code does today, bugs
 * included, so that a refactoring made by an assistant cannot silently change
 * behavior. Change them only on purpose.
 */
class CalculatorTest {

    @Test
    void adds_positive_numbers() {
        assertThat(Calculator.add(5, 3)).isEqualTo(8);
    }

    @Test
    void adds_zero() {
        assertThat(Calculator.add(0, 0)).isZero();
    }

    @Test
    void subtracts() {
        assertThat(Calculator.subtract(5, 3)).isEqualTo(2);
    }

    @Test
    void divides_with_integer_result() {
        assertThat(Calculator.divide(7, 2)).isEqualTo(3);
    }

    @Test
    void returns_minus_one_when_dividing_by_zero() {
        assertThat(Calculator.divide(5, 0)).isEqualTo(-1);
    }
}
