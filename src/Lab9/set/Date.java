package Lab9.set;

public class Date {

	 private int day;
	    private int month;
	    private int year;

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public void displayDate() {
	        System.out.println("Date: " + year + "-" + month + "-" + day);
	    }

	    public void swapDates(Date other) {
	        // Swap day, month, and year values between this and other
	        int tempDay = this.day;
	        int tempMonth = this.month;
	        int tempYear = this.year;

	        this.day = other.day;
	        this.month = other.month;
	        this.year = other.year;

	        other.day = tempDay;
	        other.month = tempMonth;
	        other.year = tempYear;
	    }
}
