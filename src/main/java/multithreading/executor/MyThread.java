package multithreading.executor;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    private String name;
    CountDownLatch countDownLatch;

    public MyThread( CountDownLatch countDownLatch, String name) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }



    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            countDownLatch.countDown();
        }
    }
}
