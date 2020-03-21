package by.academy.task5.main.port.ship;

import by.academy.task5.main.port.ship.deck.Deck;
import by.academy.task5.main.port.ship.deck.container.*;
import static by.academy.task5.main.Constants.*;

public class BigShip implements Ship {
    private String shipInfo;
    private Deck[] deck = new Deck[0];
    private StringBuilder builder = new StringBuilder();

    public BigShip(int sizeOfContainer1, int sizeOfContainer2, int water1, int shape1,int height1,int water2, int shape2,int height2,int water3, int shape3,int height3,int water4, int shape4,int height4) {
        if ((sizeOfContainer1 == BIG)&&(sizeOfContainer2==BIG)){
            this.deck = new Deck[4];
            this.deck[0] = new Deck(new BigContainer(water1,shape1,height1));
            this.deck[1] = new Deck(new BigContainer(water2,shape2,height2));
            this.deck[2] = new Deck(new BigContainer(water3,shape3,height3));
            this.deck[3] = new Deck(new BigContainer(water4,shape4,height4));
            for (int i = 0; i < 4;i++){
                this.builder.append(deck[i].getContainer().getContainer()+"\n");
                            }
            this.shipInfo = ""+builder;
        }}
    public BigShip(int sizeOfContainer1, int sizeOfContainer2,int water1, int shape1,int height1,int water2, int shape2,int height2,int water3, int shape3,int height3,int water4, int shape4,int height4,int water5, int shape5,int height5,int water6, int shape6,int height6) {
        if ((sizeOfContainer1 == SMALL)&&(sizeOfContainer2==BIG)){
            this.deck = new Deck[6];
            this.deck[0] = new Deck(new SmallContainer(water1,shape1,height1));
            this.deck[1] = new Deck(new SmallContainer(water2,shape2,height2));
            this.deck[2] = new Deck(new SmallContainer(water3,shape3,height3));
            this.deck[3] = new Deck(new SmallContainer(water4,shape4,height4));
            this.deck[4] = new Deck(new BigContainer(water5,shape5,height5));
            this.deck[5] = new Deck(new BigContainer(water6,shape6,height6));
        }
        if ((sizeOfContainer1 == BIG)&&(sizeOfContainer2==SMALL)){
            this.deck = new Deck[6];
            this.deck[0] = new Deck(new BigContainer(water1,shape1,height1));
            this.deck[1] = new Deck(new BigContainer(water2,shape2,height2));
            this.deck[2] = new Deck(new SmallContainer(water3,shape3,height3));
            this.deck[3] = new Deck(new SmallContainer(water4,shape4,height4));
            this.deck[4] = new Deck(new SmallContainer(water5,shape5,height5));
            this.deck[5] = new Deck(new SmallContainer(water6,shape6,height6));
        }
        for (int i = 0; i < 6;i++){
            this.builder.append(deck[i].getContainer().getContainer()+"\n");
        }
        this.shipInfo = ""+builder;
    }
    public BigShip(int sizeOfContainer1, int sizeOfContainer2,int water1, int shape1,int height1,int water2, int shape2,int height2,int water3, int shape3,int height3,int water4, int shape4,int height4,int water5, int shape5,int height5,int water6, int shape6,int height6,int water7, int shape7,int height7,int water8, int shape8,int height8) {
        if ((sizeOfContainer1 == SMALL)&&(sizeOfContainer2==SMALL)){
            this.deck = new Deck[8];
            this.deck[0] = new Deck(new SmallContainer(water1,shape1,height1));
            this.deck[1] = new Deck(new SmallContainer(water2,shape2,height2));
            this.deck[2] = new Deck(new SmallContainer(water3,shape3,height3));
            this.deck[3] = new Deck(new SmallContainer(water4,shape4,height4));
            this.deck[4] = new Deck(new SmallContainer(water5,shape5,height5));
            this.deck[5] = new Deck(new SmallContainer(water6,shape6,height6));
            this.deck[6] = new Deck(new SmallContainer(water7,shape7,height7));
            this.deck[7] = new Deck(new SmallContainer(water8,shape8,height8));
            for (int i = 0; i < 8;i++){
                this.builder.append(deck[i].getContainer().getContainer()+"\n");
            }
            this.shipInfo = ""+builder;
        }}

    @Override
    public String getShipInfo() {
        return shipInfo;
    }
}

