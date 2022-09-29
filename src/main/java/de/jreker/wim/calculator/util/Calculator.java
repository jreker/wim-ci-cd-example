package de.jreker.wim.calculator.util;

import org.springframework.stereotype.Service;

import de.jreker.wim.calculator.entity.CalculationResult;
import de.jreker.wim.calculator.entity.Square;

@Service
public class Calculator {
    public CalculationResult calculateSquare(Square square) {
        return new CalculationResult(square.getA() * square.getB() * square.getC() + 2);
    }
}
