package entities;



public class Member {

	private String readersName;
	private String registrationNumber;
	private String email;
	
	public  Member() {
		
	}

	public Member(String readersName, String registrationNumber, String email) {
		super();
		this.readersName = readersName;
		this.registrationNumber = registrationNumber;
		this.email = email;
	}

	public String getReadersName() {
		return readersName;
	}

	public void setReadersName(String readersName) {
		this.readersName = readersName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
	
	



}
