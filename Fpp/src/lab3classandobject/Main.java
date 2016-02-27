package lab3classandobject;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Hagose", "Gueush", 65000, 1998, 1, 1);

		Account[] acc = new Account[3];

		acc[0] = new Account(employee, AccountType.CHECKING, 300);
		acc[1] = new Account(employee, AccountType.SAVING, 300);
		acc[2] = new Account(employee, AccountType.RETIREMENT, 300);

		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i].toString());
		}

	}

}
