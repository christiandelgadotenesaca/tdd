package ec.edu.epn.tdd.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    ICalculator c = null;

    @Before
    public void setUp(){
        System.out.println("setUp");
        c = Mockito.mock(ICalculator.class);
    }

    @Test
    public void given_two_integers_when_addition_ok() {
        System.out.println("Test 1");
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

    @Test
    public void given_two_integers_when_subtraction_ok(){
        System.out.println("Test 2");
        Mockito.when(c.subtraction(3,2)).thenReturn(1);
        assertEquals(1, c.subtraction(3,2));
    }

    @Test
    public void given_two_integers_when_division_ok(){
        System.out.println("Test 3");
        Mockito.when(c.division(10,2)).thenReturn(5);
        assertEquals(5,c.division(10,2));
    }

    @Test
    public void given_two_integers_when_multiplication_ok() {
        System.out.println("Test 4");
        Mockito.when(c.multiplication(6, 3)).thenReturn(18);
        assertEquals(18,c.multiplication(6,3));
    }
}