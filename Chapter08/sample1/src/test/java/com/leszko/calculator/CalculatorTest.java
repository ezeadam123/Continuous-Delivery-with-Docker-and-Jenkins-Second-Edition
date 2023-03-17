package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     /**
     *Checking for Javadoc comments
     *This code will test to ensure the sum of (2,3) is 
     *equal to 5
     */
     private Calculator calculator = new Calculator();
     /**
     *Checking for Javadoc comments
     *This code will test to ensure the sum of (2,3) is 
     *equal to 5
     */
     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}


