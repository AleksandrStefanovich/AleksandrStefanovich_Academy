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
        if (a < 0 ){result = a * -1;}else {
        result = a;}
        return result;
    }
    public double square(double base, double exponent){ //метод не может в дробные степени
       if (exponent == 0) {return 1;}else{
           if (exponent == 1){return base;}else{
       if (exponent > 1){
        result = base;
        for (int i = 1; i < exponent; i++){
           result *= base;
       }}else if(exponent < 0){
           result = 1;
           for (int i = -1; i > exponent; i--);
           result /= base;
       }
        return result;}}
    }
    public double sqrt(double base, double exponent){
        result = pow(base,(double)1/exponent);
        return result;

    }

}
