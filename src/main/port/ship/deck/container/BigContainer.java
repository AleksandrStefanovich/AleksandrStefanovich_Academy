package main.port.ship.deck.container;

import static main.Constants.*;

public class BigContainer implements Container {
    private int density;
    private int volume;
    private int weight;
    private String shape;
    private String densityName;
    private String containerInfo;

    public BigContainer() {
    }

    public BigContainer(int waterType, int shapeType, int height) {
        if (waterType == LIGHTWATER) {density = 1000 ; densityName = "Light Water";}
        if (waterType == HARDWATER) {density = 2000; densityName = "Hard Water";}
        switch (shapeType){
            case CUBE:  {shape = "Cube"; volume = 20*20*20; break;}
            case CONE:  {shape = "Cone"; volume = (int)((Math.PI*10*10*height)/3); break;}
            case CYLINDER:  {shape = "Cylinder"; volume = (int)(Math.PI*10*10*height); break;}}

        weight = volume * density;
    }

    public String getContainer(){
        containerInfo ="Big " + shape + " filled with " + densityName + ". It's weight is "+weight;
        return containerInfo;
    }


}

