package solid.liskov;

// should't change parent behavior, better impl Shape
public class Square implements Shape{
    // should't change parent behavior
//    public void setWidth(int weigth){
//    this.setWidth(weigth);
//    height = weigth;
//    }
//
//    public void setHeight(int height){
//        this.setHeight(height);
//        width = height;
//    }
     private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getSquare() {
        return value * value;
    }
}
