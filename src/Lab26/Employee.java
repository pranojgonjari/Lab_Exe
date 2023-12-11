package Lab26;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Define the CityInfo annotation
@Retention(RetentionPolicy.RUNTIME)
@interface CityInfo {
 String ct_name();
 int zip();
}

public class Employee {
	
	private String name;
    private int age;

    public Employee() {
    }

    @CityInfo(ct_name = "New York", zip = 10001)
    public void getInfo() {
        System.out.println("Employee Information");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get the Class object for Employee
        Class<?> employeeClass = Employee.class;

        // Get the method for which annotation needs to be obtained
        Method getInfoMethod = null;
        try {
            getInfoMethod = employeeClass.getMethod("getInfo");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Check if the method is annotated with CityInfo
        if (getInfoMethod != null && getInfoMethod.isAnnotationPresent(CityInfo.class)) {
            // Get the CityInfo annotation
            CityInfo cityInfoAnnotation = getInfoMethod.getAnnotation(CityInfo.class);

            // Access annotation attributes
            String cityName = cityInfoAnnotation.ct_name();
            int zipCode = cityInfoAnnotation.zip();

            // Print information about the annotation
            System.out.println("Method 'getInfo' is annotated with CityInfo:");
            System.out.println("City Name: " + cityName);
            System.out.println("ZIP Code: " + zipCode);
        } else {
            System.out.println("Method 'getInfo' is not annotated with CityInfo");
        }
	}

}
