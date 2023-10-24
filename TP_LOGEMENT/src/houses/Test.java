package houses;
import housestests.HouseTests;
import housestests.SimulatorTests;
import housestests.VillaTests;

public class Test{
    public static void main(String[] argc){
        boolean ok = true;
        HouseTests houseTester = new HouseTests();
        ok = ok && houseTester.testGetAddress();
        ok = ok && houseTester.testPrice();
        VillaTests villaTester = new VillaTests();
        ok = ok && villaTester.testGetAddress();
        ok = ok && villaTester.testPrice();
        SimulatorTests simulatorTester = new SimulatorTests();
        ok = ok && simulatorTester.testPriceOneHouse();
        ok = ok && simulatorTester.testPriceSet();
        System.out.println(ok ? "All tests OK" : "At least one test KO");
    }
}