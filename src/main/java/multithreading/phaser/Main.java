package multithreading.phaser;
/*
In the first phase, separate threads are used to validate
customer information, check inventory, and confirm pricing. When
that phase is complete, the second phase has two threads that
compute shipping costs and all applicable tax. After that, a final
phase confirms payment and determines estimated shipping time.
 */

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhaser;

        System.out.println("Starting");

        new Thread(new CreateGarageThread(phaser, "garageInBerlin")).start();
        new Thread(new CreateGarageThread(phaser, "garageInLeipzig")).start();
        new Thread(new CreateGarageThread(phaser, "garageInFrankfurt")).start();

        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhaser + " is completed." );

        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhaser + " is completed." );

        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhaser + " is completed." );

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()){
            System.out.println("Terminated");
        }

    }
}
