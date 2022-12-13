package pattern.prototype;

public class StudentAddress implements Cloneable{
    String address;
    public StudentAddress(String address) {
        this.address = address;
    }

    protected StudentAddress cloneAddress() throws CloneNotSupportedException {
        return (StudentAddress) this.clone();
    }

    @Override
    public String toString() {
        return this.address;
    }
}
