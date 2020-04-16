package by.academy.HomeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainForMap {
    public static void main(String[] args) {

        String filePath = "C:/Users/Alexander/IdeaProjects/AleksandrStefanovich_Academy/src/by/academy/HomeWork5/Война и мир.txt";

        EasySearchWithMap search = new EasySearchWithMap(readAllBytesJava7(filePath));

        System.out.println(search.search( readAllBytesJava7(filePath),"мир"));
        System.out.println(search.getNumberOfWords());


        search.sort();
        System.out.println(search.getSortedWords());
        System.out.println(search.getWords());

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
