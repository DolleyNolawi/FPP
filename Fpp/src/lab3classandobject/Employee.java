package lab3classandobject;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;
	//public static LocalDate hireDay;

	// constructor
	Employee(String name, String aNickName, double aSalary, int aYear,int aMonth, int aDay) {
		this.name = name;
		nickName = aNickName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);		
		hireDay = cal.getTime();
	}
	
/*	public static LocalDate LocalDateFromGregCalendar(GregorianCalendar cal) {
		return LocalDate.of(cal.get(Calendar.YEAR), 1 + cal.get(Calendar.MONTH),
		cal.get(Calendar.DATE));
	}*/
	
	// instance methods
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}
	// needs to be improved
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}
