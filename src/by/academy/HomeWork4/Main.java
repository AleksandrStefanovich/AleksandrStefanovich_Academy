package by.academy.HomeWork4;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Randomizer rnd = new Randomizer(); //свой рандомер для имён, паролей и дат
        DataContainer<Person> personContainer = new DataContainer<>(new Person[0]);

        for (int i = 0; i < 100000; i++) {
            String nick = rnd.getName();
            String password = rnd.getPassword();
            LocalDate date = rnd.getDate();
            personContainer.add(new Person(nick,password,date));
        }

        DataContainer<Animal> animalContainer= new DataContainer<>(new Animal[0]);

        for (int i = 0; i < 100000; i++) {
            String nick = rnd.getName();
            int age = (int)(Math.random()*16);
            animalContainer.add(new Animal(age, nick));
        }

        AnimalAgeComparator animComp = new AnimalAgeComparator();
        DataContainer.sort(animalContainer, animComp);
        animalContainer.delete(265);
        animalContainer.delete(animalContainer.getData()[14]);

        PersonRegistrationComparator persComp = new PersonRegistrationComparator();
        DataContainer.sort(personContainer, persComp);
        personContainer.delete(200000);
        personContainer.delete(personContainer.getData()[687]);



    }
}
