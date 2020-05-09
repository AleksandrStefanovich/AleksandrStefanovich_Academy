package by.academy.HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain1 {
    public static void main(String[] args) {
        String text = "Я люблю JAVA";
        /**
         * Из исходников. matches() сравнивает целиком предеданную строку на схожесть с
         * переданным условием
         *
         * Attempts to match the entire region against the pattern.
         * @return  {@code true} if, and only if, the entire region sequence
         *          matches this matcher's pattern
         */
        System.out.println(text.matches("h?"));
        System.out.println(text.matches("h*"));
        System.out.println(text.matches("h+"));
        System.out.println("_____________");
        /**
         * Опять же исходники. find() сравнивает посимвольно. т.е. вернёт true если часть
         * строки подходит под условие
         * 
         * Attempts to find the next subsequence of the input sequence that matches
         * the pattern.
         *  @return  {@code true} if, and only if, a subsequence of the input
         *           sequence matches this matcher's pattern
         * */
        Pattern p1 =Pattern.compile("h?");
        Pattern p2 =Pattern.compile("h*");
        Pattern p3 =Pattern.compile("h+");
        Matcher matcher1 = p1.matcher(text);
        Matcher matcher2 = p2.matcher(text);
        Matcher matcher3 = p3.matcher(text);
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());

    }
}
