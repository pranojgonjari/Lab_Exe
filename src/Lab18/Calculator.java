package Lab18;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter operation (Add/Subtract/Multiply/Divide): ");
        String operation = scanner.next();

        double result;

        // Performing operation using switch cases
        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "subtract":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "multiply":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
	}

}
