package by.academy.HomeWork1;

public class Main2 {
    public static void main(String[] args) {
        double result1;
        double result2;
        ICalculator calc1 = new CalculatorWithCounter(new CalculatorWithMath());
        ICalculator calc2 = new CalculatorWithCounter(new CalculatorWithOperator());
        result1 = calc1.add((calc1.add(calc1.square(calc1.divide(28, 5),2),calc1.multiply(15, 7))),4.1);
        result2 = calc2.add((calc2.add(calc2.square(calc2.divide(28, 5),2),calc2.multiply(15, 7))),4.1);
        System.out.println("Result is "+result1 +" in "+ ((CalculatorWithCounter) calc1).getCountOperation()+" operations.");
        System.out.println("Result is "+result2 +" in "+ ((CalculatorWithCounter) calc2).getCountOperation()+" operations.");

        CalculatorStringExpression calc3 = new CalculatorStringExpression();
        calc3.calculateExpression("4.1 + 15 * 7 + (28 / 5)^2");
        CalculatorStringExpression calc4 = new CalculatorStringExpression();
        calc4.calculateExpression("2+2*2");
        CalculatorStringExpression calc5 = new CalculatorStringExpression();
        calc5.calculateExpression("4/4-2+|-10|*2^3");
    }
}
