package by.academy.HomeWork1;

public class Main2 {
    public static void main(String[] args) {
        double result1;
        double result2;
        ICalculator calc1 = new CalculatorWithCounter(new CalculatorWithMath());
        ICalculator calc2 = new CalculatorWithCounter(new CalculatorWithOperator());
        result1 = calc1.add((calc1.add(calc1.square(calc1.divide(28, 5),2),calc1.multiply(15, 7))),4.1);
        result2 = calc2.add((calc2.add(calc2.square(calc2.divide(28, 5),2),calc2.multiply(15, 7))),4.1);
        System.out.println(result1 +" in "+ ((CalculatorWithCounter) calc1).getCountOperation()+" operations.");
        System.out.println(result2 +" in "+ ((CalculatorWithCounter) calc2).getCountOperation()+" operations.");
    }
}
