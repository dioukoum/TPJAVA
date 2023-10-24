package schedules.factoredconstraints;
import schedulestests.factoredconstraints.AbstractionTests;
import schedulestests.factoredconstraints.MeetConstraintTests;
import schedulestests.factoredconstraints.PrecedenceConstraintTests;
import schedulestests.factoredconstraints.PrecedenceConstraintWithGapTests;
import schedulestests.activities.ActivityTests;
public class Test{
    public static void main(String[] argc){
        boolean ok = true;
        // Activities
        ActivityTests activityTester = new ActivityTests();
        ok = ok && activityTester.testGetDescription();
        ok = ok && activityTester.testGetDuration();
        // Precedence constraints
        PrecedenceConstraintTests precedenceConstraintTester
        = new PrecedenceConstraintTests();
        ok = ok && precedenceConstraintTester.testGetFirst();
        ok = ok && precedenceConstraintTester.testGetSecond();
        ok = ok && precedenceConstraintTester.testExtends();
        ok = ok && precedenceConstraintTester.testIsSatisfiedBy();
        // Meet constraints
        MeetConstraintTests meetConstraintTester = new MeetConstraintTests();
        ok = ok && meetConstraintTester.testGetFirst();
        ok = ok && meetConstraintTester.testGetSecond();
        ok = ok && meetConstraintTester.testExtends();
        ok = ok && meetConstraintTester.testIsSatisfiedBy();
        // Precedence constraints with gap
        PrecedenceConstraintWithGapTests precedenceConstraintWithGapTester
        = new PrecedenceConstraintWithGapTests();
        ok = ok && precedenceConstraintWithGapTester.testExtends();
        ok = ok && precedenceConstraintWithGapTester.testGetFirst();
        ok = ok && precedenceConstraintWithGapTester.testGetSecond();
        ok = ok && precedenceConstraintWithGapTester.testIsSatisfiedBy();
        // Abstract class
        AbstractionTests abstracttionTester = new AbstractionTests();
        ok = ok && abstracttionTester.test();
    }
}
