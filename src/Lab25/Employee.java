package Lab25;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Employee {

	 private String name;
	    private int age;

	    public Employee() {
	    }

	    public Employee(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
}

class ReflectDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get Class object using getClass()
        Class<?> employeeClass = Employee.class;

        // Alternatively, get Class object using Class.forName()
        try {
            Class<?> employeeClassUsingForName = Class.forName("Employee");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Create an instance using newInstance()
        try {
            Employee employeeInstance = (Employee) employeeClass.newInstance();
            // Note: newInstance() is deprecated since Java 9, and it's recommended to use Constructor.newInstance() instead.
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // Get Constructors, Fields, and Methods
        Constructor<?>[] constructors = employeeClass.getConstructors();
        Field[] fields = employeeClass.getDeclaredFields();
        Method[] methods = employeeClass.getDeclaredMethods();

        // Print information
        System.out.println("Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nFields:");
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("\nMethods:");
        for (Method method : methods) {
            System.out.println(method);
        }
	}

}
