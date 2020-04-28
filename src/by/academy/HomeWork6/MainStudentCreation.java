package by.academy.HomeWork6;

import by.academy.HomeWork4.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainStudentCreation {
    public static void main(String[] args) throws IOException {
        Randomizer rnd = new Randomizer();
        Person[] student = new Person[100000];

        for (int i = 0; i < student.length; i++) {
            student[i] = new Person(rnd.getName(), rnd.getPassword(), rnd.getDate());
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.txt"));
        out.writeObject(student);
        out.close();
    }
}
