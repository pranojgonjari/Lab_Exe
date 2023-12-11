package Lab10.com;

public class Employee {

	    private int employeeId;
	    private String employeeName;
	    private Date dateOfJoining;

	    public Employee(int employeeId, String employeeName, Date dateOfJoining) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.dateOfJoining = dateOfJoining;
	    }

	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Employee Name: " + employeeName);
	        System.out.print("Date of Joining: ");
	        dateOfJoining.displayDate();
	    }
}
