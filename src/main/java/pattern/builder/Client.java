package pattern.builder;

public class Client {
    public static void main(String[] args) {
        WorkTable workTable = new WorkTable.Builder("Shine")
                .setColor("Black").setHeight(73).build();
        System.out.println(workTable.getColor());
        System.out.println(workTable.getHeight());
        System.out.println(workTable.getWeight());

        Builder builder = new CarBuilder();
        Director director = new CarDirector();
        Vehicle vehicle=director.instruct(builder);
        vehicle.showProduct();
    }
}
