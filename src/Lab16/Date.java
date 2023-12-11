package Lab16;

class Date implements Cloneable {
	
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
 // Override the clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Other methods and constructors...

    // Additional method to display the date
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}
 class CloneExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Create an instance of the Date class
            Date originalDate = new Date(10, 12, 2023);

            // Clone the object using the clone method
            Date clonedDate = (Date) originalDate.clone();

            // Display the original and cloned dates
            System.out.println("Original Date:");
            originalDate.displayDate();

            System.out.println("\nCloned Date:");
            clonedDate.displayDate();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
	}

}
