package solid.single;

public class EmloyeeFacade {
    Cooker cooker = new Cooker();
    Janiour janiour = new Janiour();

    public void cook(){
        cooker.cook();
    }

    public void cleanFloor(){
        janiour.cleanFloor();
    }
}
