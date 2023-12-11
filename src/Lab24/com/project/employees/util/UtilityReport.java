package Lab24.com.project.employees.util;

import java.util.Map;

public class UtilityReport {

	  public static void showReport(Map<Integer, Employee> employeeMap) {
	        System.out.println("Employee Report:");
	        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
	            System.out.println(entry.getValue().getEmpName() + " → " + entry.getValue().getSalary());
	        }
	    }

}
