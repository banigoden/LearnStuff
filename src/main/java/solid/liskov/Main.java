package solid.liskov;
/*
The LSP says that you should be able to substitute a parent (or base)
type with a subtype
 */
public class Main {
    static Rectangle getRectangle(){
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        rectangle.setHight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare());
    }
}
