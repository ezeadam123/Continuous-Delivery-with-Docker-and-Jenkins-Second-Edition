package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Represents a calculator test being ran to ensure
* the given sum of 2 and 3 is equal to 5
*/
public class CalculatorTest {
     private Calculator calculator = new Calculator();
     /** Checks to see whether the sum of 2 and 3
     * is equal to 5. nothing is returned
     */
     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}


