package pro.sky.calculatorPlus.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorPlus.exeption.DivisionByZeroExeption;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorPlus.service.Constants.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne(){
int result  = calculatorService.add(ONE, ONE);
assertEquals(ONE+ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne(){
        int result  = calculatorService.add(TWO, ONE);
        assertEquals(TWO+ONE, result);
    }

    @Test
    public void shouldReturnOneWhenSubtractTwoAndOne(){
        int result  = calculatorService.subtract(TWO, ONE);
        assertEquals(TWO-ONE, result);
    }
    @Test
    public void shouldReturnZeroWhenSubtractOneAndOne(){
        int result  = calculatorService.subtract(ONE, ONE);
        assertEquals(ONE-ONE, result);
    }
    @Test
    public void shouldReturnTwoWhenMultiplyOneAndTwo(){
        int result  = calculatorService.multiply(ONE, TWO);
        assertEquals(ONE*TWO, result);
    }
    @Test
    public void shouldReturnOneWhenMultiplyOneAndOne(){
        int result  = calculatorService.multiply(ONE, ONE);
        assertEquals(ONE*ONE, result);
    }
    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne(){
        int result  = calculatorService.divide(TWO,ONE);
        assertEquals(TWO/ONE, result);
    }
    @Test
    public void shouldReturnOneWhenDivideOneAndOne(){
        int result  = calculatorService.multiply(ONE, ONE);
        assertEquals(ONE/ONE, result);
    }
    @Test
    public void shouldThrowDivisionByZeroExeptionWhenDivideByZero(){
                assertThrows(DivisionByZeroExeption.class,()->calculatorService.divide(ONE, ZERO));
    }
}