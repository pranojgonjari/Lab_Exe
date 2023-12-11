package Lab2.probstate3;

public class Employee2 {

	private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;
    
    public Employee2() {
        // Default values, you can set them as needed
        this.employeeId = 0;
        this.employeeName = "Unknown";
        this.basicSalary = 0.0;
        calculateHRA();
        calculatePF();
        calculatePT();
        calculateGrossSalary();
        calculateNetSalary();
    }
    
    public Employee2(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        calculateHRA();
        calculatePF();
        calculatePT();
        calculateGrossSalary();
        calculateNetSalary();
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getMedical() {
        return medical;
    }

    public double getPf() {
        return pf;
    }

    public double getPt() {
        return pt;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    // Helper methods for calculations
    private void calculateHRA() {
        hra = 0.5 * basicSalary;
    }

    private void calculatePF() {
        pf = 0.12 * basicSalary;
    }

    private void calculatePT() {
        pt = 200; // Fixed PT amount
    }

    private void calculateGrossSalary() {
        grossSalary = basicSalary + hra + medical;
    }

    private void calculateNetSalary() {
        netSalary = grossSalary - (pf + pt);
    }

    
	public static void main(String[] args) {
		

        Employee2 employee1 = new Employee2();
        
        // Example usage with parameterized constructor
        Employee2 employee2 = new Employee2(2, "Jane Doe", 60000.0);

        // Display details
        System.out.println("Employee 1 details:");
        displayEmployeeDetails(employee1);

        System.out.println("\nEmployee 2 details:");
        displayEmployeeDetails(employee2);
 }
	 private static void displayEmployeeDetails(Employee2 employee2) {
	        System.out.println("Employee ID: " + employee2.getEmployeeId());
	        System.out.println("Employee Name: " + employee2.getEmployeeName());
	        System.out.println("Basic Salary: " + employee2.getBasicSalary());
	        System.out.println("HRA: " + employee2.getHra());
	        System.out.println("Medical: " + employee2.getMedical());
	        System.out.println("PF: " + employee2.getPf());
	        System.out.println("PT: " + employee2.getPt());
	        System.out.println("Gross Salary: " + employee2.getGrossSalary());
	        System.out.println("Net Salary: " + employee2.getNetSalary());
	    }
}