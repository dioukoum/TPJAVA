package phonebook;
import phonebooktests.PhoneBookTests;
public class Test{
    public static void main(String[] argc){
        boolean ok = true;
        PhoneBookTests phoneBookTester = new PhoneBookTests();
        ok = ok && phoneBookTester.testGetPhoneNumbers();
        ok = ok && phoneBookTester.testGetNames();
        System.out.println(ok ? "All tests OK" : "At least one test KO");
    }
}
