package schedules.basicconstraints;
import schedulestests.basicconstraints.PrecedenceConstraintWithGapTests;

public class ConstraintGapTest{
    public static void main(String[] argc){
        boolean ok = true;
        PrecedenceConstraintWithGapTests precedenceConstraintWithGapTester
        = new PrecedenceConstraintWithGapTests();
        ok = ok && precedenceConstraintWithGapTester.testExtends();
        ok = ok && precedenceConstraintWithGapTester.testGetFirst();
        ok = ok && precedenceConstraintWithGapTester.testGetSecond();
        ok = ok && precedenceConstraintWithGapTester.testIsSatisfiedBy();
    }
}