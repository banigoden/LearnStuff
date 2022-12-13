package pattern.singelton;

/*
• To work with a centralized system (for example, consider a database).
• To maintain a common log file.
• To maintain a thread pool in a multithreaded environment.
• To implement a caching mechanism or device drivers and so forth.
 */
public class Client {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getSingelton();
        System.out.println("Captain for your team.");
        Captain captain1 = Captain.getCaptain();
        System.out.println("Another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same.");
        }

        Sailor.INSTANCE.getSailor();
    }
}
