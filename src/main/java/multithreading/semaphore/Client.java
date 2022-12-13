package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(new GarageInBerlin("Key", semaphore)).start();
        new Thread(new GarageInBremen("key2",semaphore)).start();
    }
}
