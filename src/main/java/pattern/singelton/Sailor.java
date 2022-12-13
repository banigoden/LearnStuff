package pattern.singelton;

public enum Sailor {
    INSTANCE;
    public synchronized void getSailor() {
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
    }
}
