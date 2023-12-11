package Lab3;

public class MathClass {

	// Overloaded method to add integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add floats
    public float add(float a, float b) {
        return a + b;
    }

    // Overloaded method to concatenate strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathClass math = new MathClass();

        // Test integer addition
        int sumInt = math.add(5, 7);
        System.out.println("Sum of integers: " + sumInt);

        // Test float addition
        float sumFloat = math.add(3.5f, 2.5f);
        System.out.println("Sum of floats: " + sumFloat);

        // Test string concatenation
        String concatStr = math.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + concatStr);

	}

}
