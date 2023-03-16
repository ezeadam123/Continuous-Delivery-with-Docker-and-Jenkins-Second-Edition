package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  
     private Calculator calculator = new Calculator();
    
     /**
     * Tests if the results of a calculator 
     *are true/false(in this instance, is 2+3 = 5)
     */

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}
