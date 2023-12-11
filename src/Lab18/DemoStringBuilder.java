package Lab18;

public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append method
        stringBuilder.append(" World");
        System.out.println("Appended String: " + stringBuilder);

        // Insert method
        stringBuilder.insert(5, ", Java");
        System.out.println("Inserted String: " + stringBuilder);

        // Delete method
        stringBuilder.delete(5, 10);
        System.out.println("String after deletion: " + stringBuilder);

        // Update (setCharAt) method
        stringBuilder.setCharAt(5, 'X');
        System.out.println("String after updating: " + stringBuilder);

        // Reverse method
        stringBuilder.reverse();
        System.out.println("Reversed String: " + stringBuilder);

        // Length method
        int length = stringBuilder.length();
        System.out.println("Length of the String: " + length);

        // Capacity method
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity of the StringBuilder: " + capacity);

        // EnsureCapacity method
        stringBuilder.ensureCapacity(20);
        System.out.println("Updated Capacity after ensureCapacity: " + stringBuilder.capacity());

        // toString method
        String finalString = stringBuilder.toString();
        System.out.println("Final String: " + finalString);
	}

}
