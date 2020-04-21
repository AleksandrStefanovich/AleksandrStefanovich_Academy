package by.academy.HomeWork5;

import java.io.IOException;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Pathos3\\IdeaProjects\\AleksandrStefanovich_Academy\\src\\by\\academy\\HomeWork5\\Война и мир.txt";

        //System.out.println( readAllBytesJava7( filePath ) );

        EasySearchV2 eSearch = new EasySearchV2(); // для запуска первой версии убрать V2 из EasySearch

        System.out.println(eSearch.search(readAllBytesJava7( filePath ),"война"));
        System.out.println(eSearch.search(readAllBytesJava7( filePath ),"и"));
        System.out.println(eSearch.search(readAllBytesJava7( filePath ),"мир"));

    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}