package by.academy.HomeWork5;

import java.io.IOException;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) {

        String filePath = "C:/Users/Alexander/IdeaProjects/AleksandrStefanovich_Academy/src/by/academy/HomeWork5/Война и мир.txt";

        System.out.println( readAllBytesJava7( filePath ) );

        EasySearch eSearch = new EasySearch();

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