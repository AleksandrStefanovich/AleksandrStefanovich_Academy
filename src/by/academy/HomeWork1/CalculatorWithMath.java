package by.academy.HomeWork1;

public class CalculatorWithMath implements ICalculator {


    public double divide(double a, double b) {
        return a / b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double modulus(double a) {
        return Math.abs(a);
    }
    public double square(double a, double b) {
        return Math.pow(a,b);
    }
    public double sqrt(double a, double b) {
        return Math.pow(a,1/b);
    }
}
