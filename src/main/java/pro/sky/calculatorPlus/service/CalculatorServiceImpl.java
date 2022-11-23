package pro.sky.calculatorPlus.service;

import org.springframework.stereotype.Service;
import pro.sky.calculatorPlus.exeption.DivisionByZeroExeption;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int subtract(int a, int b){
        return a-b;
    }
    @Override
    public int multiply(int a, int b){
        return a*b;
    }
    @Override
    public int divide(int a, int b){
        if(b==0){
            throw new DivisionByZeroExeption();
        }
        return a/b;
    }
}
