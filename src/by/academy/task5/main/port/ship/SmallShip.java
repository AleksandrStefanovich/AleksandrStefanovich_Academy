package by.academy.task5.main.port.ship;

import by.academy.task5.main.port.ship.deck.*;
import by.academy.task5.main.port.ship.deck.container.*;

public class SmallShip implements Ship {
    private String shipInfo;
    private int sizeOfContainer;
    private Deck[] deck = new Deck[0];
    private StringBuilder builder = new StringBuilder();

    public SmallShip(int sizeOfContainer,int water1, int shape1,int height1,int water2, int shape2,int height2,int water3, int shape3,int height3,int water4, int shape4,int height4) {
        this.sizeOfContainer = sizeOfContainer;
        this.deck = new Deck[4];
        this.deck[0] = new Deck(new SmallContainer(water1,shape1,height1));
        this.deck[1] = new Deck(new SmallContainer(water2,shape2,height2));
        this.deck[2] = new Deck(new SmallContainer(water3,shape3,height3));
        this.deck[3] = new Deck(new SmallContainer(water4,shape4,height4));
        for (int i = 0; i < 4;i++){
            this.builder.append(deck[i].getContainer().getContainer()+"\n");
        }
        this.shipInfo = ""+builder;
    }
    public SmallShip(int sizeOfContainer,int water1, int shape1,int height1,int water2, int shape2,int height2) {

        this.deck = new Deck[2];
        this.deck[0] = new Deck(new BigContainer(water1,shape1,height1));
        this.deck[1] = new Deck(new BigContainer(water2,shape2,height2));
        for (int i = 0; i < 2;i++){
            this.builder.append(deck[i].getContainer().getContainer()+"\n");
        }
        this.shipInfo = ""+builder;
    }

    @Override
    public String getShipInfo() {
        return shipInfo;
    }
}
