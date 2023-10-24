package phonebook;
import java.util.ArrayList;

public class PhoneBook{
	private ArrayList<Contact> contactList;
	Contact c;
	
	public PhoneBook(){
		this.contactList = new ArrayList<>();	
	}
	public void addContact(String nom, String telephone){
		c = new Contact(nom, telephone);
		this.contactList.add(c);
	}
	public ArrayList<String> getPhoneNumbers(String nom){
		ArrayList<String> result = new ArrayList<>();
		for(Contact i: this.contactList){
			if(nom == i.getName()){
				result.add(i.getPhoneNumber());
			}
		}
		return result;
	}
	
	public ArrayList<String> getNames(String num){
		ArrayList<String> result = new ArrayList<>();
		for(Contact i: this.contactList){
			if(num == i.getPhoneNumber()){
				result.add(i.getName());
			}
		}
		return result;
	}
}
