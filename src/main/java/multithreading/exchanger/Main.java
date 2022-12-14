package multithreading.exchanger;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();

        new Thread(new UseString(exchanger)).start();
        new Thread(new CreateString(exchanger)).start();
    }
}
