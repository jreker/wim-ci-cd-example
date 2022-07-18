package de.jreker.wim.calculator;

import de.jreker.wim.calculator.entity.CalculationResult;
import de.jreker.wim.calculator.entity.Square;
import de.jreker.wim.calculator.util.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    Calculator calculator;


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
