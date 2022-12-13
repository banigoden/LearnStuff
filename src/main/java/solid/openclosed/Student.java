package solid.openclosed;

//not closed for modification
abstract class Student{
        String name;
        String regNumber;
        String department;
        double score;

        public Student(String name, String regNumber,
                       double score) {
                this.name = name;
                this.regNumber = regNumber;
                this.score = score;
        }
        public void displayResult() {
// some code
        }

        @Override
        public String toString() {
                return ("Name: " + name +
                        "\nReg Number: " + regNumber +
                        "\nDept:" + department +
                        "\nMarks:" + score +
                        "\n*******");
        }
// Some other code, if any
}
