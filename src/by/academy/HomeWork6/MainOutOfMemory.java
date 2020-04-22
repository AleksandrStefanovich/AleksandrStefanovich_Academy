package by.academy.HomeWork6;

public class MainOutOfMemory {
    public static void main(String[] args) {
        try{
            String[] s = new String[900000000];
            while (true){
                for (int i = 0; i < s.length; i++) {
                    s[i] += "Memory eater";
                }
            }
        }catch(OutOfMemoryError e){
            System.out.println("Got Out Of Memory");
        }
    }
}
