package Task_11;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads){
            t.getState();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + count);
    }

    private static void work(int i){
        long startTime = System.currentTimeMillis();
        long result = calc(((int)((i+2)*Math.sqrt((i+5)*10))));
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " time: " + (endTime-startTime));
    }

    private static long calc(int i) {
        long result = 0;
        for (int j = 0; j < 1_000_000; j++) {
            count.incrementAndGet();
            result += (long) (Math.sqrt(i * 1000 / Math.PI) * Math.sqrt(i * 1000 / Math.PI) - 1 + Math.log((double) i));
        }
        return result;
    }
}