package Lab5;

public class Date {

	private int day;
    private int month;
    private int year;

    // Constructor with parameters
    public Date(int day, int month, int year) {
        // Call another constructor using 'this'
        this(day, month);
        this.year = year;
    }

    // Constructor with day and month (constructor chaining)
    public Date(int day, int month) {
        // Call another constructor using 'this'
        this();
        this.day = day;
        this.month = month;
    }

    // Default constructor
    public Date() {
        // Default values
        this.day = 1;
        this.month = 1;
        this.year = 2023; // Default year, you can set it as needed
    }

    // Method to print the date
    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an instance of Date using the constructor with parameters
        Date myDate = new Date(15, 7, 2023);
      //  Date myDate1=new Date();
        myDate.printDate();
        // Call the printDate method to display the date
        //myDate.printDate();
	}

}
