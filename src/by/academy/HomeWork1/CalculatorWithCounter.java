package by.academy.HomeWork1;

public class CalculatorWithCounter implements ICalculator {
    private ICalculator calc;
    private int countOperation = 0;

    public int getCountOperation() {
        return countOperation;
    }

    public CalculatorWithCounter(ICalculator calc) {
        this.countOperation++;
        this.calc = calc;
    }

    @Override
    public double divide(double a, double b) {
        this.countOperation++;
        return calc.divide(a,b);
    }

    @Override
    public double multiply(double a, double b) {
        this.countOperation++;
        return calc.multiply(a,b);
    }

    @Override
    public double add(double a, double b) {
        this.countOperation++;
        return calc.add(a,b);
    }

    @Override
    public double subtract(double a, double b) {
        this.countOperation++;
        return calc.subtract(a,b);
    }

    @Override
    public double modulus(double a) {
        this.countOperation++;
        return calc.modulus(a);
    }

    @Override
    public double square(double a, double b) {
        this.countOperation++;
        return calc.square(a,b);
    }

    @Override
    public double sqrt(double a, double b) {
        this.countOperation++;
        return calc.sqrt(a,b);
    }
}
