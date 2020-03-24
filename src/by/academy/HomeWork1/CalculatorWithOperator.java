package by.academy.HomeWork1;

import static java.lang.StrictMath.pow;

public class CalculatorWithOperator {
   private double result;
    public double divide(double a, double b){
               return a / b;
   }
    public double multiply(double a, double b){
                return a * b;
    }
    public double add(double a, double b){
                return a + b;
    }
    public double subtract(double a, double b){
                return a - b;
    }
    public double modulus(double a){
        if (a < 0 ){return -a;}else {
        return a;}
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
