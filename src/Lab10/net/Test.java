package Lab10.net;
import Lab10.com.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Date object for date of joining
        Date dateOfJoining = new Date(10, 12, 2023);

        // Create an Employee object with the Date object
        Employee employee = new Employee(101, "John Doe", dateOfJoining);

        // Display employee details
        employee.displayEmployeeDetails();
	}

}
