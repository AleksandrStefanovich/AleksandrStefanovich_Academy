package by.academy.task5.main.port;

import by.academy.task5.main.port.ship.Ship;

public class Port {
    private Ship ship;

    public Port(Ship ship) {
        this.ship = ship;
    }

    public Ship getShip(){
        return ship;
    }


}
