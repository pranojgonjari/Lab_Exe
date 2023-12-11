package Lab24.com.project.employees.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortUtil {

	 public static void sort(List<Employee> employeeList) {
	        Collections.sort(employeeList, Comparator.comparingLong(Employee::getEmpNo));
	    }

	    public static void sortBySalary(List<Employee> employeeList) {
	        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary));
	    }
}
