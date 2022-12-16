package multithreading.callable;

import java.util.concurrent.*;

public class Main {
    //TODO
    //Three different computations. The first
    //returns the minus of a value, the second computes the factorial, and
    //the third computes the division of a value.
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f1;
        Future<Integer> f2;
        Future<Double> f3;

        System.out.println("Starting");

        f1 = executorService.submit(new Minus(10,22));
        f2 = executorService.submit(new Factorial(8));
        f3 = executorService.submit(new Deviding(24,6));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }

        executorService.shutdown();
        System.out.println("All is done");
    }
}
