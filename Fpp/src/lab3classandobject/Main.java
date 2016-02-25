package lab3classandobject;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Hagose", "Gueush", 65000, 1998, 1, 1);
		
		Account acc1 = new Account(employee,AccountType.CHECKING,300);
		Account acc2 = new Account(employee,AccountType.SAVING,300);
		Account acc3 = new Account(employee,AccountType.RETIREMENT,300);
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
	}

}
