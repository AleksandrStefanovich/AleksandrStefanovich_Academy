package by.academy.HomeWork6;

import by.academy.HomeWork4.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainStudentRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"));

        Person[] student = (Person[]) in.readObject();

        System.out.println(student);
    }
}
