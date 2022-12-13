package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class GarageInBerlin implements Runnable{
    private String tool;
    private Semaphore semaphore;

    public GarageInBerlin(String tool, Semaphore semaphore) {
        this.tool = tool;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(tool + " is waiting for a permit.");
        try {
            semaphore.acquire();
            System.out.println(tool + " get it");

            for (int i = 0; i < 6; i++) {
                SharedTool.count++;
                System.out.println(tool + ": " + SharedTool.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Semafore is released");
        semaphore.release();
    }
}
