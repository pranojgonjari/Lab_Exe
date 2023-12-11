package Lab11;

public class Test {
	
	 public enum Day {
	        SUNDAY(0),
	        MONDAY(1),
	        TUESDAY(2),
	        WEDNESDAY(3),
	        THURSDAY(4),
	        FRIDAY(5),
	        SATURDAY(6);

	        private final int dayNumber;

	        // Constructor to associate a number with each day
	        Day(int dayNumber) {
	            this.dayNumber = dayNumber;
	        }

	        // Getter method to retrieve the day number
	        public int getDayNumber() {
	            return dayNumber;
	        }
	 }	        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Printing the number with each day
        for (Day day : Day.values()) {
            System.out.println(day.getDayNumber() + " " + day);
        }

	}

}
