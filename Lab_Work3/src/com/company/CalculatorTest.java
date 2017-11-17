package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculate() throws Exception {
        String expression = "(8 + 2 * 5) / (1 + 3 * 2 - 4)";
        assertEquals(6.0, Calculator.calculate(expression),0.0);
    }

}