package multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class ToysFacrory implements Runnable {
    CountDownLatch latch;

    public ToysFacrory(CountDownLatch countDownLatch) {
        latch = countDownLatch;
    }


    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
