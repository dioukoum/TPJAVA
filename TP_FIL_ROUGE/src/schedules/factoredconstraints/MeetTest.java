package schedules.basicconstraints;
import schedulestests.basicconstraints.PrecedenceConstraintTests;
import schedules.activities.Activity;

public class MeetTest{
    public static void main(String[] argc){
        boolean ok = true;
        PrecedenceConstraintTests precedenceTester = new PrecedenceConstraintTests();
        ok = ok && precedenceTester.testGetFirst();
        ok = ok && precedenceTester.testGetSecond();
        ok = ok && precedenceTester.testIsSatisfiedBy();
    }
}