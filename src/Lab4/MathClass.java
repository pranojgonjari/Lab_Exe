package Lab4;

public class MathClass {

	// Method to find the sum of variable number of integers
    public void findSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MathClass math = new MathClass();

	        // Call the method with different numbers of integers
	        math.findSum(1, 2, 3);
	        math.findSum(5, 10, 15, 20);
	        math.findSum(2, 4, 6, 8, 10);
	}

}
