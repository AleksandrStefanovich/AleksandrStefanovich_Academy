package by.academy.task5.main.port.ship.deck;

import by.academy.task5.main.port.ship.deck.container.Container;

public class Deck {
    private Container container;

    public Deck(Container container) {
        this.container = container;
    }

    public Container getContainer(){
        return container;
    }

}
