package multithreading.exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    private Exchanger<String> exchanger;
    private String value;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            try {
                value = exchanger.exchange(new String());
                System.out.println("Got: " + value);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
