package pattern.factory;

public class Lotus implements Tree{

    public Lotus() {
        System.out.println("\nA lotus is created.");
    }

    public Lotus(String color) {
        System.out.println("\nA lotus with " + color + " is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It is in a jungle.");
    }
}
