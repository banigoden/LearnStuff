package pattern.factory;

public class Fesalis implements Tree{
    public Fesalis() {
        System.out.println("\nA fesalis is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println ("It prefers home.");
    }
}
