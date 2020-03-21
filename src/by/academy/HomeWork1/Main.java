package by.academy.HomeWork1;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        float result;
        result = (float)calc.add((calc.add(calc.square(calc.divide(28, 5),2),calc.multiply(15, 7))),4.1);
        System.out.println(result);
    }
}
