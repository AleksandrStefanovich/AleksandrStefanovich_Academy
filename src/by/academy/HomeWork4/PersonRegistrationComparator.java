package by.academy.HomeWork4;

import java.util.Comparator;

public class PersonRegistrationComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getRegistration().compareTo(o2.getRegistration());//0 если равны, 1 если 1 позже, -1 если 2 позже
    }
}

