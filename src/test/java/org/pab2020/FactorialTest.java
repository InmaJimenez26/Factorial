package org.pab2020;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest
{
    @Test
    public void shouldFactorial0return1(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(0);
        int expectedValue = 1;
        assertEquals(expectedValue,result);
    }

    @Test
    public void shouldFactorial1return1(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(1);
        int expectedValue = 1;
        assertEquals(expectedValue,result);
    }

    @Test
    public void shouldFactorial2return2(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(2);
        int expectedValue = 2;
        assertEquals(expectedValue,result);
    }
    @Test
    public void shouldFactorial_return___(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(5);
        int expectedValue = 120;
        assertEquals(expectedValue,result);
    }
    @Test
    public void shouldFactorialNegReturn___(){
        Factorial factorial = new Factorial();
        assertThrows(RuntimeException.class, ()->factorial.compute(-1));
    }
    @Test
    public void shouldFactorial_10return_3628800(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(10);
        int expectedValue = 3628800;
        assertEquals(expectedValue,result);
    }
    @Test
    public void Factorial_12(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(12);
        System.out.println(result);
    }
    @Test
    public void Factorial_11(){
        Factorial factorial = new Factorial();
        int result = factorial.compute(13);
        System.out.println(result);
    }
}
