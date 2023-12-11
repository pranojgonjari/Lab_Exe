package Lab6;

public class Employee {

	private static int totalEmployees;
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
		
		 // Creating employees
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Jane", 60000);

        // Displaying total number of employees
        System.out.println("Total Employees: " + Employee.getTotalEmployees());

        // Displaying employee details
        System.out.println("Employee 1: ID=" + emp1.getEmployeeId() + ", Name=" + emp1.getName() + ", Salary=" + emp1.getBasicSalary());
        System.out.println("Employee 2: ID=" + emp2.getEmployeeId() + ", Name=" + emp2.getName() + ", Salary=" + emp2.getBasicSalary());
	}

}
