package solid.openclosed;

import java.util.Arrays;
import java.util.List;

public class ITDistinctionDecider implements DistinctionDecider{
    List<String> science = Arrays.asList("Comp.Sc.","Physics");
    List<String> arts = Arrays.asList("History","English");
    @Override
    public void evaluateDistinction(Student student) {
        if (student.score > 70) {
            System.out.println(student.regNumber+" has received a distinction in arts.");
        }
    }
}
