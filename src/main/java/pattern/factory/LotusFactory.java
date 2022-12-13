package pattern.factory;

public class LotusFactory extends TreeFactoryAbstr{
    @Override
    protected Tree createTree(String white) {
        return new Lotus(white);
    }
}
