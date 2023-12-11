package Lab20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Problem Statement 2: Accept input from console and write to 'console.txt'

        try {
            // Create a FileWriter and BufferedWriter to write to the file
            FileWriter fileWriter = new FileWriter("console.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Create a Scanner to read input from the console
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter text to write to 'console.txt' (Enter 'exit' to stop):");

            // Read input from the console and write to the file
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }

            // Close resources
            scanner.close();
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Data written to 'console.txt' successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
