package solid.liskov;

public class Rectangle implements Shape {
     private int width;
     private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return height;
    }

    public void setHight(int hight) {
        this.height = hight;
    }

    public int getSquare(){
        return width * height;
    }
}
