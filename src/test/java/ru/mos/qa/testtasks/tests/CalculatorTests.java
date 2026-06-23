package ru.mos.qa.testtasks.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mos.qa.testtasks.Calculator;

public class CalculatorTests {
    Calculator calc = new Calculator();

    @Test
    public void sum() {
        Assertions.assertEquals(10, calc.sum(5, 5));
    }

    @Test
    public void minus() {
        Assertions.assertEquals(3, calc.minus(5, 2));
    }

    @Test
    public void divide() {
        Assertions.assertEquals(3, calc.divide(9, 3));
    }

    @Test
    public void multiply() {
        Assertions.assertEquals(9, calc.multiply(3, 3));
    }
}