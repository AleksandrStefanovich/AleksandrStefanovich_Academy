package by.academy.HomeWork7;

import by.academy.HomeWork4.*;


import java.time.LocalDate;

public class IOStreamMain {
    public static void main(String[] args) {
        Randomizer rnd = new Randomizer();
        DataContainer<Person> personContainer = new DataContainer<>(new Person[0]);

        for (int i = 0; i < 100000; i++) {
            String nick = rnd.getName();
            String password = rnd.getPassword();
            LocalDate date = rnd.getDate();
            personContainer.add(new Person(nick,password,date));
        }

        PersonRegistrationComparator persComp = new PersonRegistrationComparator();
        DataContainer.sort(personContainer, persComp);
    }
}
