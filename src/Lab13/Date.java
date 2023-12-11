package Lab13;

import java.util.Objects;

public class Date {
	
	private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Date other = (Date) obj;
        return day == other.day && month == other.month && year == other.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date1 = new Date(10, 12, 2023);
        Date date2 = new Date(10, 12, 2023);

        // Check if the dates are the same using equals method
        boolean areDatesEqual = date1.equals(date2);
        System.out.println("Are the dates equal? " + areDatesEqual);

        // Print the hash codes of the dates
        System.out.println("HashCode of date1: " + date1.hashCode());
        System.out.println("HashCode of date2: " + date2.hashCode());

	}

}
