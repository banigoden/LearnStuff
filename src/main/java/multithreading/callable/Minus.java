package multithreading.callable;

import java.util.concurrent.Callable;

public class Minus implements Callable<Integer> {
    private int a;
    private int b;

    public Minus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return a - b;
    }
}
