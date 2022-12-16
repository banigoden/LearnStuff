package multithreading.callable;

import java.util.concurrent.Callable;

public class Deviding implements Callable<Double> {
    private double a;
    private double b;

    public Deviding(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double call() throws Exception {
        return a / b;
    }
}
