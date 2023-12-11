package Lab7;

public class Employee {

	 private static int totalEmployees = 0;
	    private int employeeId;
	    private String name;
	    private double basicSalary;

	    // Constructor with auto-generation of employeeId
	    public Employee(String name, double basicSalary) {
	        this.employeeId = generateEmployeeId();
	        this.name = name;
	        this.basicSalary = basicSalary;
	        totalEmployees++;
	    }

	    // Static method to get the total number of employees
	    public static int getTotalEmployees() {
	        return totalEmployees;
	    }

	    // Auto-generation of employeeId
	    private static int generateEmployeeId() {
	        // You can implement your logic for generating unique employeeId here
	        // For simplicity, using a basic increment approach in this example
	        return totalEmployees + 1;
	    }

	    // Implementing toString() method
	    @Override
	    public String toString() {
	        // Creating the string representation of the employee object
	        return "Employee ID: " + employeeId + ", Name: " + name + ", Gross Salary: " + calculateGrossSalary();
	    }

	    // Method to calculate gross salary (example logic)
	    private double calculateGrossSalary() {
	        // You can implement your logic for calculating gross salary here
	        // For simplicity, using a basic formula in this example
	        return basicSalary + (0.1 * basicSalary); // Assuming 10% bonus for simplicity
	    }

	    // Other getter and setter methods

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBasicSalary() {
	        return basicSalary;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating employees
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Jane", 60000);

        // Displaying employee details using toString() method
        System.out.println("Employee 1: " + emp1.toString());
        System.out.println("Employee 2: " + emp2.toString());

	}

}
