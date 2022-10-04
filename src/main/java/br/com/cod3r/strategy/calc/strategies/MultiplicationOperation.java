package br.com.cod3r.strategy.calc.strategies;

public class MultiplicationOperation implements OperationStrategy {
    @Override
    public int calculate(final int num1, final int num2) {
        return num1 * num2;
    }
}
