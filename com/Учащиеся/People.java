package Учащиеся;

public class People {
	private String name;
	private String surname;
	private int age;
	private Address address;
	public String getName() {
		return name;
	}
	public People (String name, String surname, int age, Address address){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress2(Address address) {this.address = address;
	}
}
