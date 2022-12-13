package pattern.abstract_factory;

import pattern.factory.Tree;
import pattern.factory.TreeFactory;

public class AbstractFactory {
    public Factory createFactory(String typeOfFactory){
        Tank tank;
        Tree tree;
        switch (typeOfFactory) {
            case "tank" : return new TankFactory();
            case "tree" : return new TreeFactory();
            default : throw new IllegalArgumentException("Unknow tank");
        }
    }
}
