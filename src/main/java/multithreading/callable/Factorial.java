package multithreading.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    private int value;

    public Factorial(int value) {
        this.value = value;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= value ; i++) {
            fact *= i;
        }
        return fact;
    }
}
