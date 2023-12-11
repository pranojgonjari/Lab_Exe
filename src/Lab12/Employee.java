package Lab12;

public class Employee {

	private int empId;
    private String empName;
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    // Getter methods

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Methods to be overridden by derived classes

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        // Default implementation for net salary calculation
        return calculateGrossSalary();
    }
}

class Manager extends Employee {
    public Manager(int empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Petrol Allowance: " + (0.08 * getBasicSalary()));
        System.out.println("Food Allowance: " + (0.13 * getBasicSalary()));
        System.out.println("Other Allowance: " + (0.03 * getBasicSalary()));
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + (0.08 * getBasicSalary()) + (0.13 * getBasicSalary()) + (0.03 * getBasicSalary());
    }
}

class MarketingExecutive extends Employee {
    private int kilometersTravelled;

    public MarketingExecutive(int empId, String empName, double basicSalary, int kilometersTravelled) {
        super(empId, empName, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + (5 * kilometersTravelled));
        System.out.println("Telephone Allowance: 1500");
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + (5 * kilometersTravelled) + 1500;
    }
}

 class Test {
    public static void showDetails(Employee employee) {
        System.out.println("******** Employee Details ********");
        employee.displayDetails();
        System.out.println("Gross Salary: " + employee.calculateGrossSalary());
        System.out.println("Net Salary: " + employee.calculateNetSalary());
        System.out.println("**********************************\n");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Manager manager = new Manager(101, "John Manager", 50000);
	        MarketingExecutive marketingExecutive = new MarketingExecutive(102, "Alice Executive", 40000, 100);

	        // Show details using the base class reference
	        showDetails(manager);
	        showDetails(marketingExecutive);
	}

}
