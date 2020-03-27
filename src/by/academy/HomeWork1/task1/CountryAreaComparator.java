package by.academy.HomeWork1.task1;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Countries> {

    @Override
    public int compare(Countries o1, Countries o2) {

        if (o1.getArea()==o2.getArea()){return 0;}
        if (o1.getArea()>o2.getArea()){return 1;}
        else  {return -1;}
    }
}
