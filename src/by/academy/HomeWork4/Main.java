package by.academy.HomeWork4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Randomizer rnd = new Randomizer(); //свой рандомер для имён, паролей и дат
        DataContainer<Person> personContainer = new DataContainer<>(new Person[0]);

        for (int i = 0; i < 100; i++) {
            String nick = rnd.getName();
            String password = rnd.getPassword();
            LocalDate date = rnd.getDate();
            personContainer.add(new Person(nick,password,date));
        }
        System.out.println(personContainer.getData());

        DataContainer<Animal> animalContainer= new DataContainer<>(new Animal[0]);

        for (int i = 0; i < 100; i++) {
            String nick = rnd.getName();
            int age = (int)Math.random()*16;
            animalContainer.add(new Animal(age, nick));

        }



    }
}
