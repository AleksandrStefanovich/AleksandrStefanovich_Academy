package by.academy.HomeWork7;

import by.academy.HomeWork4.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainStudentCreation {
    public static void main(String[] args) throws IOException {
        /*
        * Создание 100000 студентов по имени, возрасту и ID
        * */
        Randomizer rnd = new Randomizer();
        Student[] student = new Student[100000];

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student(rnd.getName(), rnd.getAge(), (1+i));
        }
        /*
        * Запись массива в файл
        * */
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.bin"));
        out.writeObject(student);
        out.close();
    }
}
