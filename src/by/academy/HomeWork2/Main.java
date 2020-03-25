package by.academy.HomeWork2;

public class Main {

    public static void main(String[] args) {
        Finder f = new Finder();
        Integer[] mass1 = new Integer[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        Integer[] mass2 = new Integer[]{1,1,2,-2,5,2,4,4,-1,-2,5};
        Integer[] mass3 = new Integer[]{20,1,1,2,2,3,3,5,5,4,20,4,5};
        Integer[] mass4 = new Integer[]{10};
        Integer[] mass5 = new Integer[]{1,1,1,1,1,1,10,1,1,1,1};
        Integer[] mass6 = new Integer[]{5,4,3,2,1,5,4,3,2,10,10};
        System.out.println("Массив 1:");
        f.search(mass1);
        System.out.println("Массив 2:");
        f.search(mass2);
        System.out.println("Массив 3:");
        f.search(mass3);
        System.out.println("Массив 4:");
        f.search(mass4);
        System.out.println("Массив 5:");
        f.search(mass5);
        System.out.println("Массив 6:");
        f.search(mass6);
    }
}
