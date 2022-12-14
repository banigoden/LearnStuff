package multithreading.phaser;

import java.util.concurrent.Phaser;

public class CreateGarageThread implements Runnable {
    private Phaser phaser;
    private String garageLocation;

    public CreateGarageThread(Phaser phaser, String garageLocation) {
        this.phaser = phaser;
        this.garageLocation = garageLocation;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Garage creation " + garageLocation + "Phase one");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garage creation " + garageLocation + "Phase two");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garage creation " + garageLocation + "Phase three");
        phaser.arriveAndDeregister();
    }
}
