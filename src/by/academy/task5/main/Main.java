package by.academy.task5.main;

import by.academy.task5.main.port.Port;
import by.academy.task5.main.port.ship.*;
import static by.academy.task5.main.Constants.*;

public class Main {                                 //только 6 кораблей целесообразно создавать т.к. больше нет вариантов формирования корабля
    public static void main(String[] args) {       // the first argument in brackets is size of containers on the deck
        Port[] port = new Port[10];                //the first and the second arguments in brackets are size of containers on two decks
        port[0] = new Port(new SmallShip(BIG,HARDWATER,CONE,20,LIGHTWATER,CUBE,20));
        port[1] = new Port(new SmallShip(SMALL,HARDWATER,CYLINDER,100,LIGHTWATER,CONE,15,HARDWATER,CUBE,10,LIGHTWATER,CYLINDER,50));
        port[2] = new Port(new BigShip(BIG, BIG,HARDWATER,CYLINDER,20,LIGHTWATER,CUBE,20,HARDWATER,CUBE,45,LIGHTWATER,CONE,55));
        port[3] = new Port(new BigShip(SMALL, BIG,HARDWATER,CYLINDER,100,LIGHTWATER,CONE,15,HARDWATER,CUBE,10,LIGHTWATER,CYLINDER,50,LIGHTWATER,CYLINDER,40,HARDWATER,CONE,10));
        port[4] = new Port(new BigShip(BIG, SMALL,HARDWATER,CYLINDER,34,LIGHTWATER,CONE,12,HARDWATER,CUBE,76,LIGHTWATER,CYLINDER,58,LIGHTWATER,CYLINDER,85,HARDWATER,CONE,11));
        port[5] = new Port(new BigShip(SMALL, SMALL,HARDWATER,CYLINDER,100,LIGHTWATER,CONE,15,HARDWATER,CUBE,10,LIGHTWATER,CYLINDER,50,HARDWATER,CYLINDER,100,LIGHTWATER,CONE,15,HARDWATER,CUBE,10,LIGHTWATER,CYLINDER,50));
        port[6] = new Port(new SmallShip(BIG,HARDWATER,CONE,65,LIGHTWATER,CUBE,32));
        port[7] = new Port(new SmallShip(SMALL,HARDWATER,CYLINDER,56,LIGHTWATER,CONE,65,HARDWATER,CUBE,12,LIGHTWATER,CYLINDER,76));
        port[8] = new Port(new BigShip(BIG, BIG,HARDWATER,CYLINDER,20,LIGHTWATER,CUBE,22,HARDWATER,CUBE,34,LIGHTWATER,CONE,77));
        port[9] = new Port(new SmallShip(BIG,HARDWATER,CONE,12,LIGHTWATER,CUBE,13));
        //next arguments grouped by 3 are type of water in containers, shape of container, and height(doesn't work for cube it's height is the same as width but needed for constructor)
        for (int i = 0; i < 10; i++){
        System.out.println("Ship "+(i+1)+" carries:\n"+port[i].getShip().getShipInfo());}
    }

}