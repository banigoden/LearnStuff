package pattern.abstract_factory;

import pattern.factory.Tree;

public class Client {

    public static void main(String[] args) {
        Factory tankFactory = new AbstractFactory().createFactory("tank");
        Factory treeFactory = new AbstractFactory().createFactory("tree");
        Tree lotus = treeFactory.createTree("lotus");
        //lotus.displayBehavior();
        Tank t90 = tankFactory.createTank("t90");
        t90.drive();

    }
}
