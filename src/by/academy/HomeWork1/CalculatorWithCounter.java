package by.academy.HomeWork1;

public class CalculatorWithCounter implements ICalculator {
    private ICalculator calc;
    private int countOperation = 0;

    public int getCountOperation() {
        return countOperation;
    }

    public CalculatorWithCounter(ICalculator calc) {
        this.countOperation++;
        this.calc = calc;
    }

    @Override
    public double divide(double a, double b) {
        this.countOperation++;
        return calc.divide(a,b);
    }

    @Override
    public double multiply(double a, double b) {
        this.countOperation++;
        return calc.multiply(a,b);
    }

    @Override
    public double add(double a, double b) {
        this.countOperation++;
        return calc.add(a,b);
    }

    @Override
    public double subtract(double a, double b) {
        this.countOperation++;
        return calc.subtract(a,b);
    }

    @Override
    public double modulus(double a) {
        this.countOperation++;
        return calc.modulus(a);
    }

    @Override
    public double square(double a, double b) {
        this.countOperation++;
        return calc.square(a,b);
    }

    @Override
    public double sqrt(double a, double b) {
        this.countOperation++;
        return calc.sqrt(a,b);
    }
}
//2. Продолжаем писать калькуляторы:
//        2.1. Сохранённый результат попробовать поделить на 0 (если возникнет ошибка закомментировать).+
//        2.2. Далее сохранённый результат попробовать поделить на 0.0d  (если возникнет ошибка закомментировать).
//        https://habr.com/ru/post/219595/  +
//        2.3. Создать интерфейс ICalculator, в котором будут объявлены все методы которые присутсвовали в нашем
//        калькуляторе CalculatorWithOperator. В CalculatorWithOperator заимплементить   +
//        2.4. Создать класс CalculatorWithMath. Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)  +
//        2.5. В классе CalculatorWithMath должны присутствовать 4 метода (деления, умножение, вычитание, сложение) данные
//        методы можно скопировать из класса CalculatorWithOperator. В методах (Возведение в степень, Модуль числа, Корень из числа)
//        можно использовать только вызовы  методов библиотеки Math     +
//        2.6. Повторить пункты 3-5 с классом CalculatorWithMath   +
//        Задание посложнее. Для того чтобы преступить к данному заданию необходимо выполнить все предыдущие.
//        2.7*. Создать класс CalculatorWithCounter. У данного класса должно быть два конструктора (или один если сможете,
//        https://refactoring.guru/ru/design-patterns/decorator) один принимающий в себя CalculatorWithOperator, а другой CalculatorWithMath.
//        Данные конструкторы должны сохранять переданные значения в приватные поля класса. Он также имеет 4 метода как и другие калькуляторы +
//        1 метод getCountOperation() который должен вернуть значение внутреннего счётчика.
//        В реализации 4 методов вы должны вызвать одно из полей класса, и вызвать соответсвующий метод у них. К примеру. Если вызывают метод
//        plus у CalculatorWithCounter то он должен вызвать метод plus у CalculatorWithOperator или CalculatorWithMath (смотря что передали в
//        конструктор) и увеличить значение внутреннего счётчика операций.
//        Точно также создаём отдельный класс с мэйн методом. Там создаём экземпляр класса CalculatorWithCounter (помним что у нас нет дефолтного
//        констуктора) и сохраняем данный объект в переменную.
//        Через эту переменную проводим всё теже операции что и раньше. В конце программы необходимо вывести в консоль инфомацию возвращаему методом getCountOperation()