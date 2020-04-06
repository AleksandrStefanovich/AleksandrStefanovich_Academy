package by.academy.HomeWork4;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 04, 06).toEpochDay();
        long randomDay;
        String alphabet = "ABCDEFGHIJKLMNOPPQRSTUVWXYZ";
        String alphabetWithNumbers = "ABCDEFGHIJKLMNOPPQRSTUVWXYZ0123456789";

        DataContainer personContainer = new DataContainer();

        for (int i = 0; i < 100000; i++) {
            String nick = alphabet.charAt((int)Math.random()*27) + alphabet.charAt((int)Math.random()*27) + alphabet.charAt((int)Math.random()*27)+ alphabet.charAt((int)Math.random()*27)+"";
            String password = "" + alphabetWithNumbers.charAt((int)Math.random()*27)+ alphabetWithNumbers.charAt((int)Math.random()*27)+ alphabetWithNumbers.charAt((int)Math.random()*27)+ alphabetWithNumbers.charAt((int)Math.random()*27);
            randomDay = minDay + random.nextInt(maxDay - minDay);
            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            personContainer.add(new Person(nick,password,randomDate));
        }
        System.out.println(personContainer.getData());

        DataContainer animalContainer = new DataContainer();

        for (int i = 0; i < 100000; i++) {
            String nick = alphabet.charAt((int)Math.random()*27) + alphabet.charAt((int)Math.random()*27) + alphabet.charAt((int)Math.random()*27)+ alphabet.charAt((int)Math.random()*27)+"";
            int age = (int)Math.random()*16;
            animalContainer.add(new Animal(age, nick));

        }


    }
}
