package Lab20;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem Statement 1: Checking file 'file1.txt' availability and retrieving information

        // Specify the file path
        String filePath = "file1.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File 'file1.txt' is available.");

            // Get file information
            System.out.println("File Information:");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File 'file1.txt' is not available.");
        }
	}

}
