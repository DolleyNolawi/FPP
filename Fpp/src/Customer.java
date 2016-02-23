
public class Customer {
	private String firstName;
	private String lastName;
	private double socialSecurityNumber;
	private Address billingAddr;
	
	public Customer(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	//default constructor
	public Customer() {
		this("_Placeholder","Employee");
	}
	
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + " " + lastName + " "+ "ssn:" + socialSecurityNumber + "]";
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return firstName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getbillingAddr() {
		return billingAddr;
	}
	public void setbillingAddr(Address baddr) {
		this.billingAddr = baddr;
	}
		
	public static void main(String[] args) {
		Customer customer1A = new Customer();
		Customer customer2B = new Customer();
		
		Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");

	}

}
