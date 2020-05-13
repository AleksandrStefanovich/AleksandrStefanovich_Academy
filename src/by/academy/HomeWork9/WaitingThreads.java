package by.academy.HomeWork9;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class WaitingThreads {

    static long a = 0;
    static Thread t1 = new Thread(() -> {
        for (long i = 0; i < 100L; i++) {
            a += 1;
            try {
                TimeUnit.MILLISECONDS.sleep(49); //если поставить 50, будет too late
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) {
        int counter = 0;
        t1.start();

        while(t1.isAlive()){
            try {
                t1.join(1000);
                counter++;

                if (counter > 5){
                    throw new TimeoutException();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println("Time is out");
                break;
            }
        }
        while(true) {
            if (!t1.isAlive()&& counter <= 5) {
                System.out.println("Done");
                break;
            }
            if (!t1.isAlive()&& counter > 5) {
                System.out.println("Done too late");
                break;
            }
        }
    }
}
