package by.academy.HomeWork3;

public class Car implements ICar {
    private Door[] door = new Door[4];
    private Wheel[] wheel = new Wheel[4];
    private Engine engine = new Engine();
    private Tank tank = new Tank();
    private int numberOfSeats;

    public void start(){}
    public void stop(){}
    public void addDriver(){}
    public void addPassanger(){}
}
