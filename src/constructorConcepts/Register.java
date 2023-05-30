package constructorConcepts;

public class Register {
	
	String firstName;
	String lastName;
	String phone;
	String emailId;
	String password;
	String city;
	
	

	public Register(String firstName, String lastName, String phone, String emailId, String password, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
		this.password = password;
		this.city = city;
	}

	public Register(String firstName, String lastName, String phone, String emailId, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
		this.password = password;
	}

	
	public Register(String firstName, String lastName, String phone, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
	}
	
	
	public Register(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}



	public Register(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Register(String firstName) {
		this.firstName = firstName;
	}



	public static void main(String[] args) {
		Register r1 = new Register("Pooja");
		
		System.out.println(r1.firstName);
		
		Register r2 = new Register("Vivek", "Bhat", "1234567895", "vbhat@gmail.com", "poo@123", "Bengalore");
		
		System.out.println(r2.firstName + " " + r2.lastName + r2.phone+" "+  " " +r2.emailId + " " + r2.password + " " + r2.city);

	}

}
