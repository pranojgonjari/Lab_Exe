package Lab2.probstate2;


//Create two objects and initialize them using no-argument and parameterized constructor respectively. Print the date.


public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public Date() {
		this.day=1;
		this.month=10;
		this.year=2001;
	}


	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
 
	

//	public int getDay() {
//		return day;
//	}
//
//
//	public int getMonth() {
//		return month;
//	}
//
//
//	public int getYear() {
//		return year;
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1=new Date();
		Date d2=new Date(7,9,2001);
		System.out.println("Date is "+d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("Date is "+d2.day+"/"+d2.month+"/"+d2.year);
		
	}

}
