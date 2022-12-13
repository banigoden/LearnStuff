package solid.single;
// Or we can use also pattern Facade, not recommend.

//Class should have only one reason to change. If there are two reason, then we should change.
public interface Employee {
    //each class should be responsible for one
    /*void getSalary(){}
    void cook(){}
    void getClean(){}
     */

    int getSalary();
}
