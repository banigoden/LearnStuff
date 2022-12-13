package pattern.prototype;

public class Student implements Cloneable{
    private int id;
    private  String name;
    private StudentAddress studentAddress;

    public Student(int id, String name, StudentAddress studentAddress) {
        this.id = id;
        this.name = name;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        // For the shallow Copy
        return (Student) super.clone();
        /*
        for deep copy
        Student student = (Student) this.clone();
        student.studentAddress = (StudentAddress) this.studentAddress.cloneAddress();
        return student;

         */
    }
}
