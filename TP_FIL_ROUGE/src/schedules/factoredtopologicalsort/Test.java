package schedules.factoredtopologicalsort;
import schedulestests.factoredtopologicalsort.TopologicalSorterTests;

public class Test{
    public static void main(String[] argc){
        boolean ok = true;
        TopologicalSorterTests tester = new TopologicalSorterTests();
        ok = ok && tester.testBruteForceSort();
        ok = ok && tester.testSchedule();
        //ok = ok && tester.testLinearTimeSort();
        System.out.println(ok ? "All tests passed" : "At least one test failed");
        }
}