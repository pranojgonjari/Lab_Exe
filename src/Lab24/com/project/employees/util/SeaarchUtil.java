package Lab24.com.project.employees.util;

import java.util.List;

public class SeaarchUtil {

	 public static Employee searchEmpInfo(int empNo, List<Employee> employeeList) throws Exception {
	        for (Employee employee : employeeList) {
	            if (employee.getEmpNo() == empNo) {
	                return employee;
	            }
	        }
	        throw new Exception("Employee with empNo " + empNo + " not found.");
	    }
}
