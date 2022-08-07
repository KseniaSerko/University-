package University;

public class Teacher extends People{
	private double hourSalary;
	private int hours;
	private String month;
	public Teacher(String name, String surname, int age, Address address, double hourSalary,int hours, String month) {
		super(name, surname, age, address);
		this.hourSalary=hourSalary;
		this.hours=hours;
		this.month=month;
		
		
	}
	public double getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month=month;
	}
	public String toString() {
		return super.getName() + super.getSurname() + super.getAge()+ super.getAddress();
		}
	}

