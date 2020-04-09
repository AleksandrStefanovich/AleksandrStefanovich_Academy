package by.academy.HomeWork4;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()) { //0 если одинаковый, 1 если 1 старше, -1 если 2 старше
            return 0;
        } else if(o1.getAge() > o2.getAge()) {
        return 1;
        } else {
        return -1;
        }
    }
}
