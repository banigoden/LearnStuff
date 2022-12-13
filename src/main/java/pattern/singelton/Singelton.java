package pattern.singelton;

public class Singelton {
   static Singelton singelton = new Singelton();
    private Singelton(){
    }

    public static Singelton getSingelton() {
        return singelton;
    }
}
