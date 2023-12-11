package Lab24.com.project.employees.util;

import java.util.List;

public class UtilityList {

	public static void printList(List<Employee> employeeList) {
        System.out.println("Employee List:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
