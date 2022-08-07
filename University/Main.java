package Main;
import java.util.Arrays;



import University.Address;
import University.Group;
import University.Student;
import University.Teacher;

public class Main {

	public static void main(String[] args) {

				Address address = new Address("Minsk", "Auezova", 44, 509);
				System.out.println(address);
				Student[] students = {new Student ("Petr","Petrov",22, address),new Student ("Nikita","Sidorov",25, address), new Student ("Sidor","Nikitin",33, address)};
				students[1]=null;
			    System.out.println(Arrays.toString(students));
				Teacher teacher= new Teacher("Ivan","Ivanov",33,address, 14.5, 100, "July");
		        Group group = new Group ("41", 1,teacher, students);
		       
	   }
	
	}


