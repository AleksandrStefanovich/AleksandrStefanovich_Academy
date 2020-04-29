package by.academy.HomeWork7;

import by.academy.HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStudentRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"));

        List<Person> student = new ArrayList<Person>();

        student = Arrays.asList((Person[])in.readObject());

        student.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getNick().charAt(0) == o2.getNick().charAt(0)) return 0;
                else if (o1.getNick().charAt(0) > o2.getNick().charAt(0)) return 1;
                else return -1;
            }
        });


       // BufferedWriter out = new BufferedWriter(new FileWriter("sortedStudents.txt"));

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortedStudents.txt"));
        for (int i = 0; i < student.size(); i++) {
            //out.append(student.get(i).toString()+"\n");

            //out.writeChars(student.get(i).toString()+"\n"); //записывает все символы через пробел
            //out.writeUTF(student.get(i).toString()+"\n"); //записывает одно из NUL+"+-,.\" перед каждым Person + как в writeBytes
            out.writeBytes(student.get(i).toString()+"\n"); //записывает лишнее "z NUL NUL EOT NUL" в рандомных местах примерно через каждые 50-150 строк
        }
        out.flush();
        out.close();






    }
}
