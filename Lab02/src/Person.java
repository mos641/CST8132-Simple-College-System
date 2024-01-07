// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 2
// Description: Class for creating Person to use in Student class and return information


public class Person {
	//instance variables
	private String firstName;
	private String lastName;
	private String emailId;
	private long phoneNumber;
	
	//constructor to set properties
	public Person(String firstName, String lastName, String emailId, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	//getter method for name
	public String getName() {
		String Name = firstName + " " + lastName;
		return Name;
	}
	
	//getter method for email	
	public String getEmail() {
		return emailId;
	}
	
	//getter method for phone number
	public long getPhoneNumber() {
		return phoneNumber;
	}

}
