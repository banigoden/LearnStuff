package pattern.abstract_factory;

import pattern.factory.Tree;

public interface Factory {
     Tree createTree(String typeOfTree);
     Tank createTank(String typeOfTank);
}
