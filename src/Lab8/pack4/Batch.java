package Lab8.pack4;

public class Batch {

	 // Public attribute
    public String publicAttribute = "Public Attribute in Batch";

    // Protected attribute
    protected String protectedAttribute = "Protected Attribute in Batch";

    // Default (package-private) attribute
    String defaultAttribute = "Default Attribute in Batch";

    // Private attribute
    private String privateAttribute = "Private Attribute in Batch";

    public void checkAccessibility() {
        System.out.println("Batch Class Checking Accessibility:");
        System.out.println("Public Attribute: " + publicAttribute);

        // Accessing protected attribute within the same class
        System.out.println("Protected Attribute: " + protectedAttribute);

        // Accessing default (package-private) attribute within the same class
        System.out.println("Default Attribute: " + defaultAttribute);

        // Accessing private attribute within the same class
        System.out.println("Private Attribute: " + privateAttribute);
    }
}
