package pro.sky.calculatorPlus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.calculatorPlus.exeption.DivisionByZeroExeption;
import pro.sky.calculatorPlus.service.CalculatorService;

public class CalculatorController {

    private final CalculatorService calculatorService;

        public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    @GetMapping("/plus")
    public String addNumbers(@RequestParam int a, @RequestParam int b){
        return generateMassage (a,b, "+",calculatorService.add(a,b));
    }

    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam int a, @RequestParam int b){
        return generateMassage(a,b,"-",calculatorService.subtract(a,b));
    }
    @GetMapping("/multiply")
    public String multiplyNumbers (@RequestParam int a, @RequestParam int b) {
        return generateMassage(a,b,"*",calculatorService.multiply(a,b));
    }
    @GetMapping("/divide")
    public String divideNumbers (@RequestParam int a, @RequestParam int b) {
            return generateMassage(a,b,"/",calculatorService.divide(a,b));
    }
        private String generateMassage(int a, int b, String operation, int result){
        return String.format("%d %s %d = %d",a,operation,b, result);
    }
}

