package multithreading.atomic;

public class AtomThread implements Runnable {
    private String name;

    public AtomThread(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("Starting " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " got " + SharedResource.atomicInteger.getAndSet(i));
        }
    }
}
