package pattern.abstract_factory;

import pattern.factory.Tree;

public class TankFactory implements Factory{

    public Tank createTank(String typeOfTank){
        Tank tank;
        switch (typeOfTank){
            case "t52" -> tank = new T52();
            case "t90" -> tank = new T90();
            default -> {
                System.out.println("no tank");
                throw new IllegalArgumentException("Unknow tank");
            }
        }
        return tank;
    }

    @Override
    public Tree createTree(String typeOfTree) {
        return null;
    }
}
