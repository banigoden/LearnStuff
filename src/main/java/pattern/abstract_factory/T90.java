package pattern.abstract_factory;

public class T90 implements Tank{
    @Override
    public void drive() {
        System.out.println(" Drive slower, more safety");
    }
}
