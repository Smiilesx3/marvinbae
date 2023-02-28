package calculator;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();
    @Test
    void methodeAddition() {
        assertEquals(2,calc.methodeAddition(1,1));
    }

    @Test
    void methodeSubtraction() {
        assertEquals(2,calc.methodeSubtraction(4,2));
    }
}