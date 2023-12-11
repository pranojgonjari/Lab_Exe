package Lab18;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Original string
        String originalString = "Hello, World!";

        // Using StringBuffer to reverse the string
        StringBuffer reversedStringBuffer = new StringBuffer(originalString);
        reversedStringBuffer.reverse();

        // Printing the reversed string
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedStringBuffer.toString());
	}

}
