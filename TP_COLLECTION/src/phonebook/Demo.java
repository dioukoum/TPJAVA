package phonebook;

public class Demo{
	public static void main(String[] args){
		Contact c1 = new Contact("Martin","4321");
		Contact c2 = new Contact("Martin","1234");
		Contact c3 = new Contact("Jean","1234");
		System.out.println(c1.getName()+": "+c1.getPhoneNumber());
		System.out.println(c2.getName()+": "+c2.getPhoneNumber());
		System.out.println(c3.getName()+": "+c3.getPhoneNumber());
		PhoneBook pb1 = new PhoneBook();
		pb1.addContact(c1.getName(),c1.getPhoneNumber());
		pb1.addContact(c2.getName(),c2.getPhoneNumber());
		pb1.addContact(c3.getName(),c3.getPhoneNumber());
		System.out.println(pb1.getPhoneNumbers("Martin"));
		
		System.out.println(pb1.getNames("1234"));
	}
}
