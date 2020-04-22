package by.academy.HomeWork6;

public class MainStackOverflow {
    public static void main(String[] args) {
        try{
            goRecursion();
        } catch(StackOverflowError e){
            System.out.println("Got Stack Overflow");
        }
    }
    
    public static long goRecursion(){
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        goRecursion();
        return a + b + c + d;
    }
}
