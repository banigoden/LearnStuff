package pattern.factory;

public class Client {
    public static void main(String[] args) {
        TreeFactory animalFactory = new TreeFactory();
        Tree tree = animalFactory.createTree("lotus");
        tree.displayBehavior();
        tree = animalFactory.createTree("fesalis");
        tree.displayBehavior();

        TreeFactoryAbstr factoryAbstr;
        factoryAbstr = new LotusFactory();
        tree = factoryAbstr.createTree("white");
        tree.displayBehavior();

    }
}
