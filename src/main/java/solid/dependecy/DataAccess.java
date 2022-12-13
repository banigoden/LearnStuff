package solid.dependecy;
// lower level classes. Data Access can be used in more than 20 clients
public class DataAccess implements DAO{
    public void execute(){
        System.out.println("execute");
    }
}
