package Lab8.pack1;

public class Student {

	 String name; // default access
	    int rollNumber; // default access

	    public Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	    public void displayInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	    }

}
