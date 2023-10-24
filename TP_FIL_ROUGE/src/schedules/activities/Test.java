package schedules.activities;
import schedulestests.activities.ActivityTests;

public class Test{
        public static void main(String[] argc){
                boolean ok = true;
                ActivityTests activityTester = new ActivityTests();
                ok = ok && activityTester.testGetDescription();
                ok = ok && activityTester.testGetDuration();
                System.out.println(ok ? "All tests passed" : "At least one test failed");
        }
}
