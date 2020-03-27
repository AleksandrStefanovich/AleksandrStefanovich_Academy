package by.academy.HomeWork1;


import by.academy.HomeWork1.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        float result;

        // 4.1 + 15 * 7 + (28 / 5) ^ 2 вывод в result
        // первым выполняется деление, потом возведение в квадрат, сложение с результатом произведения и последним сложение с 4.1
        // дробную степень например 2/5 можно реализовать как calc.sqrt(calc.squre(n,2),5)
        //calc.sqrt считает корень любой степени с точностью до 3 знаков после запятой

        result = (float)calc.add((calc.add(calc.square(calc.divide(28, 5),2),calc.multiply(15, 7))),4.1);
        System.out.println(result);
        System.out.println(calc.sqrt(4096,2));


    }
}
