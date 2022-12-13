package pattern.factory;

import pattern.abstract_factory.Factory;
import pattern.abstract_factory.Tank;

public class TreeFactory  implements Factory {
   /* public enum Type {DOG, TIGER};
    public Animal createAnimal(Type animalType){
        Animal animal;
        if (animalType.equals(Type.DOG))
        {
            animal = new Dog();
        }
        else if (animalType.equals(Type.TIGER))
        {
            animal = new Tiger();
        }
*/
    public Tree createTree(String treeType){
        Tree tree;

        switch (treeType){
            case "fesalis" -> tree = new Fesalis();
            case "lotus" -> tree = new Lotus();
            default -> {
                System.out.println(" No tree");
                throw new IllegalArgumentException("Unknow tree");
            }
        }
        return tree;
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}
