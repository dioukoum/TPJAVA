package personstests;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import persons.Person;

/**
 * A class providing unit tests for class {@link Person}.
 *
 * @author Bruno Zanuttini, Université de Caen Normandie, France
 */
public class PersonTests {

	/**
	 * Builds a new instance.
	 */
	public PersonTests() {
	}

	/**
	 * Runs tests on method {@link Person#getAge(int, int, int)}.
	 * 
	 * @return <code>true</code> if all tests are passed, otherwise returns
	 *         <code>false</code> and prints information about the first test failed
	 *         to standard output
	 */
	public boolean testGetAge() {
		final String name = "John Doe";
		// Date when to evaluate the age
		int year = 2001;
		int month = 3;
		int day = 12;
		// Persons
		Map<int[], Integer> data = new HashMap<>();
		data.put(new int[] { 1990, 1, 1 }, 11);
		data.put(new int[] { 1990, 1, 31 }, 11);
		data.put(new int[] { 1990, 3, 6 }, 11);
		data.put(new int[] { 1990, 3, 12 }, 11);
		data.put(new int[] { 1990, 3, 20 }, 10);
		data.put(new int[] { 1990, 5, 7 }, 10);
		data.put(new int[] { 1990, 5, 30 }, 10);
		// Running tests
		for (Map.Entry<int[], Integer> entry : data.entrySet()) {
			int[] date = entry.getKey();
			int birthYear = date[0];
			int birthMonth = date[1];
			int birthDay = date[2];
			Person person = new Person(name, birthYear, birthMonth, birthDay);
			Integer expected = entry.getValue();
			Integer computed = person.getAge(year, month, day);
			if (computed != expected) {
				System.out.print("Test failed for person born on ");
				System.out.print(birthYear + "/" + birthMonth + "/" + birthDay);
				System.out.print(", expected " + expected + " years on ");
				System.out.print(year + "/" + month + "/" + day);
				System.out.println(", found " + computed + " using getAge");
				return false;
			}
		}
		return true;
	}

	/**
	 * Runs tests on method {@link Person#getCurrentAge()}.
	 * 
	 * @return <code>true</code> if all tests are passed, otherwise returns
	 *         <code>false</code> and prints information about the first test failed
	 *         to standard output
	 */
	public boolean testGetCurrentAge() {
		// Note: this may fail if executed precisely at midnight
		final String name = "John Doe";
		GregorianCalendar someDate = new GregorianCalendar();
		int year = someDate.get(Calendar.YEAR);
		int month = someDate.get(Calendar.MONTH) + 1;
		int day = someDate.get(Calendar.DAY_OF_MONTH);
		final int age = 55;
		someDate.add(Calendar.YEAR, -age);
		someDate.add(Calendar.DAY_OF_YEAR, 1);
		for (int i = 1; i <= 365; i++) {
			someDate.add(Calendar.DAY_OF_YEAR, -1);
			int birthYear = someDate.get(Calendar.YEAR);
			int birthMonth = someDate.get(Calendar.MONTH) + 1;
			int birthDay = someDate.get(Calendar.DAY_OF_MONTH);
			Person person = new Person(name, birthYear, birthMonth, birthDay);
			Integer computed = person.getCurrentAge();
			if (computed != age) {
				System.out.print("Test failed for person born on ");
				System.out.print(birthYear + "/" + birthMonth + "/" + birthDay);
				System.out.print(", expected " + age + " years on ");
				System.out.print(year + "/" + month + "/" + day);
				System.out.println(", found " + computed + " using getCurrentAge");
				return false;
			}
		}
		return true;
	}

}
