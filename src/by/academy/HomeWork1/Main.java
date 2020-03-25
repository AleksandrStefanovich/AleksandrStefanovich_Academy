package by.academy.HomeWork1;


public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        float result;




        // 4.1 + 15 * 7 + (28 / 5) ^ 2 вывод в result
        // первым выполняется деление, потом возведение в квадрат, сложение с результатом произведения и последним сложение с 4.1

        result = (float)calc.add((calc.add(calc.square(calc.divide(28, 5),2),calc.multiply(15, 7))),4.1);
        System.out.println(result);
        System.out.println(calc.sqrt(290,2));
    }
}
