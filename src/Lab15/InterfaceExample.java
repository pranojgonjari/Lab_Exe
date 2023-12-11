package Lab15;

//Interface definition
interface Printable {
 void print();
}

//Employee class implementing Printable
class Employee implements Printable {
 private String name;
 private int employeeId;

 public Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 // Implementation of the print method for Employee
 public void print() {
     System.out.println("Employee: " + name + ", ID: " + employeeId);
 }
}

//Date class implementing Printable
class Date implements Printable {
 private int day, month, year;

 public Date(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;
 }

 // Implementation of the print method for Date
 public void print() {
     System.out.println("Date: " + day + "/" + month + "/" + year);
 }
}

//Shape class implementing Printable
class Shape implements Printable {
 private String shapeName;

 public Shape(String shapeName) {
     this.shapeName = shapeName;
 }

 // Implementation of the print method for Shape
 public void print() {
     System.out.println("Shape: " + shapeName);
 }
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create instances of Employee, Date, and Shape
        Employee employee = new Employee("John Doe", 101);
        Date date = new Date(10, 12, 2023);
        Shape shape = new Shape("Circle");

        // Call the print method on instances
        employee.print();
        date.print();
        shape.print();
	}

}
