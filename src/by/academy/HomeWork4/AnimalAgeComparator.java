package by.academy.HomeWork4;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if(o1.getAge() > o2.getAge()) {
        return 1;
        } else {
        return -1;
        }
    }
}
