package solid.dependecy;
// class depend from lower level classes
//top level classes
public class Client {
    DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}
