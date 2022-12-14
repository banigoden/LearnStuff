package multithreading.exchanger;

import java.util.concurrent.Exchanger;

public class CreateString implements Runnable {
    private Exchanger exchanger;
    private String string;

    public CreateString(Exchanger exchanger) {
        this.exchanger = exchanger;
        this.string = new String();
    }

    @Override
    public void run() {
        char value = 'A';

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 5; j++) {
                string += value++;
            }
        try {
            string = (String) exchanger.exchange(string);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        }
    }
}
