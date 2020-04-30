package by.academy.HomeWork7;

import by.academy.HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStudentRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.bin"));

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
       //BufferedWriter out = new BufferedWriter(new FileWriter("sortedStudents.bin"));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortedStudents.bin")); //работает как в комментах
        //DataOutputStream out = new DataOutputStream(new FileOutputStream("sortedStudents.bin")); //просто работает:)
        for (int i = 0; i < student.size(); i++) {
           // out.append(student.get(i)+"\n");
            //out.writeChars(student.get(i)+"\n"); //записывает все символы через пробел
            out.writeUTF(student.get(i).toString()); //записывает одно из NUL+"+-,.\" перед каждым Person + как в writeBytes
          // out.writeBytes(student.get(i)+"\n"); //записывает лишнее "z NUL NUL EOT NUL" в рандомных местах примерно через каждые 50-150 строк
//            if (i%10 == 0){
//                out.flush();
//            }
        }
        out.close();
    }
}
