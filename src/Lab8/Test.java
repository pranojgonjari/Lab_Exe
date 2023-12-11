package Lab8;
import Lab8.pack1.*;
import Lab8.pack2.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating instances of Student and Batch classes
        Student student = new Student("John", 101);
        Batch batch = new Batch("Batch A", 101);

        // Displaying information using the displayInfo() method
        System.out.println("Student Information:");
        student.displayInfo();

        System.out.println("Batch Information:");
        batch.displayInfo();
	}

}
