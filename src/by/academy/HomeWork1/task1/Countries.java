package by.academy.HomeWork1.task1;

public enum Countries implements IGetterOfCountryInfo
                        { BELARUS(207600,9468000), RUSSIA(17075200,143300000),
                        POLAND(312685,38167000), USA(9629091,310241000),
                        FRANCE(547030,65447000), GREECE(131940,11306000),
                        GERMANY(357021,81802000), ITALY(301230,60402000),
                        CHINA(9596960,1339450000), MADAGASKAR(587040,20146000);
    private int area;
    private int numberOfCitizens;

    Countries(int area, int numberOfCitizens) {
        this.area = area;
        this.numberOfCitizens = numberOfCitizens;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }
}
//        1. Создать энум страны Country:           +
//        1.1. В котором есть 10 элементов          +
//        1.2. У каждого элемента есть два свойства (площадь страны, количество человек)        +
//        1.3. Добавить интерфейс с методами получения площади страны и количеством человек     +
//        1.4. Энум должен реализовывать созданный интерфейс        +
//        1.5. Воспользоваться методом valueOf передав туда название элемента энума     +
//        1.6. Сравнить результат valueOf и элемент энума через оператор ==         +
//        1.7. Передать в valueOf имя несуществующего элемента      +
//        1.8. Изучить что делаем метод compareTo в энумах.   +
//        1.9. Изучить интерфейсы Comparable и Comparator из jdk
//        1.9. Создать класс CountryAreaComparator. Данный класс
//        должен реализоватвать интерфейс Comparator
//        (implements Comparator<Country> написать вот так, что такое
//        в скобочках мы пока не изучали, если что это тема generics).
//        В данном классе необходимо сравнить площадь двух переданных стран.