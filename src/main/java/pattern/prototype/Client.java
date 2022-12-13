package pattern.prototype;
/*
This pattern provides an alternative method for instantiating new objects by copying or
cloning an instance of an existing object.
In case of gibernate.
 */
public class Client {
    public static void main(String[] args) {
        StudentAddress studentAddress = new StudentAddress("21, abc Road, USA");
        Hash hash = new Hash();

        hash.setStudent(new Student(1, "John", studentAddress));
        try {
            Student student = hash.getStudent();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        NumericTest factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = i * result;
            }
          return result;
        };

        System.out.println("The factorial 6 is " + factorial.func(5));

        SomeFunc<String> reverse = (str) ->{
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(" Reverse is " + reverse.func("sengri"));

    }

}
