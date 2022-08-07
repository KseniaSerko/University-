package Учащиеся;

public class Student extends People{
	public Student(String name, String surname, int age, Address address) {
		super(name, surname, age, address);
		
	}
	public String toString() {
	return super.getName() + super.getSurname() + super.getAge()+ super.getAddress();
	}
}
