package multithreading.cyclic_barrier;

/*
A situation not uncommon in concurrent programming occurs when a
set of two or more threads must wait at a predetermined execution
point until all threads in the set have reached that point.
 */

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());

        System.out.println("Starting");

        new Thread(new MyThread(cyclicBarrier, "A")).start();
        new Thread(new MyThread(cyclicBarrier, "B")).start();
        new Thread(new MyThread(cyclicBarrier, "C")).start();
    }
}
