package by.academy.HomeWork6;

import java.util.Scanner;

public class MainClassWork {

    public static void main(String[] args) {
        int counter = 0;
        Scanner scan =  new Scanner(System.in);
        do  {
            try {
                System.out.println("Input 1 to 10");
                int number = scan.nextInt();
                check(number);
                System.out.println("Good user");
                break;
            } catch (Exception e){
                scan =  new Scanner(System.in);
                counter++;

            }
        } while ( counter < 3);
        if (counter == 3) System.out.println("User is stupid");

    }
    public static void check(int number){
        if (number < 1 || number > 10)
            throw new NumberFormatException();

    }
}