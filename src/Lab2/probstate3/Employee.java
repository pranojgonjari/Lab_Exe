package Lab2.probstate3;

//Consider that payroll software needs to be developed for computerization of operations of an ABC organization. The organization has employees.
//a. Construct a class Employee with following members using private access specifies:
//i. Employee Id integer
//ii. Employee Name string
//iii. Basic Salary double
//iv. HRA double 
//v. Medical double
//vi. PF double
//vii. PT double
//viii. Net Salary double
//ix. Gross Salary double
//Please use following expressions for calculations:
//HRA = 50% of Basic Salary
//PF = 12% of Basic Salary
//PT = Rs. 200
public class Employee {

	private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;
    
    public Employee(int employeeId, String employeeName, double basicSalary) {
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
		// TODO Auto-generated method stub

		Employee employee = new Employee(1, "John Doe", 50000.0);

        // Display details
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("HRA: " + employee.getHra());
        System.out.println("Medical: " + employee.getMedical());
        System.out.println("PF: " + employee.getPf());
        System.out.println("PT: " + employee.getPt());
        System.out.println("Gross Salary: " + employee.getGrossSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
	}

}
