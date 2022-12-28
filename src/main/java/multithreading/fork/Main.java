package multithreading.fork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        long sec = System.currentTimeMillis();
        Callable <Integer> task = () -> IntStream.range(0, 1_000_000)
                .boxed()
                .parallel()
                .map(x -> x / 3)
                .peek( th -> System.out.println(Thread.currentThread().getName()))
                .reduce((x, y) -> x + (int)(3 * Math.sin(y)))
                .get();
        ForkJoinPool pool = new ForkJoinPool(4);
        try {
            int result = pool.submit(task).get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - sec) / 1000);
    }
}
