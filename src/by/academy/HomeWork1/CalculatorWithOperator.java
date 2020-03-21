package by.academy.HomeWork1;

import static java.lang.StrictMath.pow;

public class CalculatorWithOperator {
   private double result;
    public double divide(double a, double b){
        result = a / b;
       return result;
   }
    public double multiply(double a, double b){
        result = a * b;
        return result;
    }
    public double add(double a, double b){
        result = a + b;
        return result;
    }
    public double subtract(double a, double b){
        result = a - b;
        return result;
    }
    public double modulus(double a){
        result = Math.abs(a);
        return result;
    }
    public double square(double base, double exponent){
       result = pow(base, exponent);
        return result;
    }
    public double sqrt(double base, double exponent){
        result = pow(base,(double)1/exponent);
        return result;
    }

}
