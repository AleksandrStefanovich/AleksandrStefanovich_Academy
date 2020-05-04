package by.academy.HomeWork4;

import java.time.LocalDate;
import java.util.Random;

public class Randomizer {

    public int getAge(){
        return (int) (18 + Math.random()*80);
    }


    public String getName(){
        String name;
        name = names[(int)(Math.random()*names.length)];
        return name;
    }

    public String getPassword(){
    String pass;
    pass = String.valueOf((int)(Math.random()*100000000));
    return pass;
    }

    public LocalDate getDate(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(1998, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 04, 06).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    private String[] names = {"Emma","Olivia","Ava","Isabella","Sophia","Charlotte", //около 100 имён ctrl+c из сети
            "Mia","Amelia","Harper","Evelyn","Abigail","Emily",
            "Elizabeth","Mila","Ella","Avery", "Sofia","Camila",
            "Aria","Scarlett", "Victoria","Madison",
            "Luna","Grace", "Chloe","Penelope","Layla","Riley", "Zoey", "Nora",
            "Lily","Eleanor","Hannah","Lillian", "Addison","Aubrey", "Ellie","Stella",
            "Natalie","Zoe",  "Leah","Hazel", "Violet","Aurora",
            "Savannah","Audrey", "Brooklyn","Bella", "Claire","Skylar",
            "Liam","Noah", "William","James", "Oliver","Benjamin",
            "Elijah","Lucas", "Mason", "Logan","Alexander","Ethan",
            "Jacob","Michael", "Daniel","Henry",  "Jackson","Sebastian",
            "Aiden","Matthew", "Samuel","David", "Joseph","Carter",
            "Owen", "Wyatt", "John", "Jack","Luke", "Jayden",
            "Dylan","Grayson", "Levi", "Isaac", "Gabriel","Julian",
            "Mateo", "Anthony", "Jaxon", "Lincoln", "Joshua","Christopher",
            "Andrew", "Theodore", "Caleb", "Ryan", "Asher","Nathan","Thomas", "Leo"};

}
