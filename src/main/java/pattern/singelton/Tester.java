package pattern.singelton;

public class Tester {

    private static final Tester TESTER_INSTANCE =
            new Tester();

    private Tester() {
        System.out.println("\tNew captain is elected for your team.");
    }

    public static Tester getTester() {
        System.out.println("\tYou already have a tester for your team.");
        return TESTER_INSTANCE;
    }
}
