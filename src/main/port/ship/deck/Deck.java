package main.port.ship.deck;

import main.port.ship.deck.container.Container;

public class Deck {
    private Container container;

    public Deck(Container container) {
        this.container = container;
    }

    public Container getContainer(){
        return container;
    }

}
