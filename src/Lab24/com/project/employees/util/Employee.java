package Lab24.com.project.employees.util;
import java.util.Set;

public class Employee {

	private int empNo;
    private String empName;
    private double salary;
    private Set<String> skillsets;

    // Constructor, getters, setters, and other methods as needed...

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", skillsets=" + skillsets +
                '}';
    }

	public String getEmpName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getEmpNo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
