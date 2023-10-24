package phonebook;

public class Contact{
	private String name, phoneNumber;
	
	public Contact(String nom, String telephone){
		this.name = nom;
		this.phoneNumber = telephone;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
}
