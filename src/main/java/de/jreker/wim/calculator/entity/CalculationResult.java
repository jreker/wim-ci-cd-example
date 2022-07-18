package de.jreker.wim.calculator.entity;

public class CalculationResult {
    public CalculationResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double result;

}
