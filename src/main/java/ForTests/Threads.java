package ForTests;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {
    static int totalSum;
    static int totalSum1;
    static ReentrantLock lock = new ReentrantLock();
    static long[] sum = new long[12];

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        long result = 0;
        for (int i = 0; i < sum.length; i++) {
            result += sum[i];
        }
        System.out.println(result);
    }

    private static void work(int i){
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 1000, 100_000_000, i);
        long endTime = System.currentTimeMillis();

        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count, int j){
        long a =0;
        long b =0;
        for (int i = 0; i < count; i++) {
            a += (start+i) * (start + i) * Math.sqrt(start+i);
            totalSum++;
            b++;
        }
        sum[j]+=b;
        return a;
    }
}
