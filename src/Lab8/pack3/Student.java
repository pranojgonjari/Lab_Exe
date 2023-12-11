package Lab8.pack3;

public class Student {

	 // Public attribute
    public String publicAttribute = "Public Attribute";

    // Protected attribute
    protected String protectedAttribute = "Protected Attribute";

    // Default (package-private) attribute
    String defaultAttribute = "Default Attribute";

    // Private attribute
    private String privateAttribute = "Private Attribute";

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Public Attribute: " + publicAttribute);
        System.out.println("Protected Attribute: " + protectedAttribute);
        System.out.println("Default Attribute: " + defaultAttribute);
        System.out.println("Private Attribute: " + privateAttribute);
    }
}
