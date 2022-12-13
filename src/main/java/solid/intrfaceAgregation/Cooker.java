package solid.intrfaceAgregation;
 // has lunch and work full day
public class Cooker implements IWorker{
    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
