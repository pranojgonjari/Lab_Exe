package Lab9.net;
import Lab9.com.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create two Date objects
        Date date1 = new Date(10, 12, 2023);
        Date date2 = new Date(25, 6, 2022);

        // Display original dates
        System.out.println("Original Dates:");
        date1.displayDate();
        date2.displayDate();

        // Swap dates using call by value method
        Date.swapDates(date1, date2);

        // Display swapped dates
        System.out.println("\nDates after swapping:");
        date1.displayDate();
        date2.displayDate();
	}

}
