package de.jreker.wim.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import de.jreker.wim.calculator.entity.CalculationResult;
import de.jreker.wim.calculator.entity.Square;
import de.jreker.wim.calculator.util.Calculator;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculationResult() {
        CalculationResult result = new CalculationResult(2.0);
        result.setResult(3.0);

        assertEquals(3.0, result.getResult());
    }


    @Test
    public void squareCalculatorTest() {
        Square square = new Square();
        square.setA(2);
        square.setB(2);
        square.setC(2);

        CalculationResult result = calculator.calculateSquare(square);


        assertEquals(8,result.getResult());

    }


}
