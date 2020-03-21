package by.academy.task5.main.port.ship.deck.container;

import static by.academy.task5.main.Constants.*;

public class SmallContainer implements Container {
    private int density;
    private int volume;
    private int weight;
    private String shape;
    private String densityName;
    private String containerInfo;

    public SmallContainer() {
    }
    public SmallContainer(int waterType, int shapeType, int height) {
        switch (waterType){
            case LIGHTWATER: {density = 1000 ; densityName = "Light Water"; break;}
            case HARDWATER: {density = 2000; densityName = "Hard Water"; break;}
            default: {densityName = "Wrong water";break;}
        }
        if (10 <= height && height <= 100){
        switch (shapeType){
            case CUBE:  {shape = "Cube"; volume = 10*10*10; break;}
            case CONE:  {shape = "Cone"; volume = (int)((Math.PI*5*5*height)/3); break;}
            case CYLINDER:  {shape = "Cylinder"; volume = (int)(Math.PI*5*5*height); break;}
            default: {shape = "Wrong shape"; break;}
        }

        weight = volume * density;
    }else {
        shape = "Wrong hieght";}
    }
    public String getContainer(){
        containerInfo ="Small " + shape + " filled with " + densityName + ". It's weight is "+weight;
        return containerInfo;
    }
}
