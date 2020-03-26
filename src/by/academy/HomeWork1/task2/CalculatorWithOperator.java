package by.academy.HomeWork1.task2;

import static java.lang.StrictMath.pow;

public class CalculatorWithOperator {
   private double result;
   private double result2;
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
           for (int i = -1; i > exponent; i--){
           result /= base;}
       }
        return result;}}
    }
    public double sqrt(double base, double exponent) {

        double counter = 1;
        result2 = 0;
        for (int i = 1; square(i,exponent) < base; i *= 10) { //поиск едениц, десятков, сотен и т.д.
            if (i == 1) {
                if (0 > base) {
                    counter = 1;
                } }else {
                    if (square(i, exponent) < base) {
                        counter = i;
                    }
                }
            }
        for (int j = (int)counter; j >= 1; j /= 10){ //поиск первой и последующих цифр до запятой
        for (int i = 0; i < 11; i++) {
            if (square(result2 + i * j, exponent) > base) {
                result2 = result2 + (i - 1) * j; break;
            }
        }
    }
        counter = 1;
         for (int i = 1; i < 4; i++ ){ counter /=10; //поиск трёх цифр после запятой
             for(double j = 0; j < 11; j++){
                 if (( square(result2 + j * counter, exponent)) > base) {
                     result2 = result2 + (j - 1) * counter; break;
             }
         }
         }
        return result2;
            }

}
