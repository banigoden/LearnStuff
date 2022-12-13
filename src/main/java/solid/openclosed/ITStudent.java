package solid.openclosed;

public class ITStudent extends Student{
    public ITStudent(String name, String regNumber, double score, String dept) {
        super(name, regNumber, score);
        this.department = dept;
    }
}
