package by.academy.HomeWork7;

import by.academy.HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStudentRead {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        * Чтение массива студентов из файла в Лист
        * */

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.bin"));
        List<Student> student = new ArrayList<Student>();
        student = Arrays.asList((Student[])in.readObject());

        /*
        * Сортировка студентов по имени
        * */

        student.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });

        /*
        * Запись полей отсортированных студентов в файл
        * */

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortedStudents.bin"));
        for (Student student1 : student) {
            out.writeUTF(student1.getName());
            out.writeInt(student1.getAge());
            out.writeInt(student1.getId());
        }
        out.close();

        /*
        * Чтение отсортированных студентов из файла по полям
        * */

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("sortedStudents.bin"));
        List<Student> sortedStudentFromFile = new ArrayList<Student>();
        while(true){
            try{
                sortedStudentFromFile.add(new Student(in2.readUTF(),in2.readInt(),in2.readInt()));
            } catch (EOFException e){
                break;
            }
        }
        in2.close();

     //   System.out.println(); //для бряки
    }




}
