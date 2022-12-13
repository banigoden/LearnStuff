package multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CdlMain {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        System.out.println("Starting");

        new Thread(new ToyFacrory(countDownLatch)).start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Done");
    }
}
