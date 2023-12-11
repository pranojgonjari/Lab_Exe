package Lab9.com;

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

    public static void swapDates(Date date1, Date date2) {
        // Swap day, month, and year values between date1 and date2
        int tempDay = date1.day;
        int tempMonth = date1.month;
        int tempYear = date1.year;

        date1.day = date2.day;
        date1.month = date2.month;
        date1.year = date2.year;

        date2.day = tempDay;
        date2.month = tempMonth;
        date2.year = tempYear;
    }
}
