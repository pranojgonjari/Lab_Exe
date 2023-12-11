package Lab21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        try {
	            // Accept file name from the user
	            System.out.print("Enter file name: ");
	            String fileName = scanner.nextLine();

	            // Attempt to open the file
	            File file = new File(fileName);
	            Scanner fileScanner = new Scanner(file);

	            // Process the contents of the file (this part is skipped for simplicity)
	            System.out.println("File contents:");

	            while (fileScanner.hasNextLine()) {
	                System.out.println(fileScanner.nextLine());
	            }

	            // Close the file
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block: Closing resources");
	            scanner.close();
	        }

	}

}
