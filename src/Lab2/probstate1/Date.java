package Lab2.probstate1;


//Create an object and initialize it using mutator methods and accesses it using accessor methods.
//Print the date
public class Date {
	
	int date;
	int month;
	int year;
	
	public int getDate() {
		return date;
	}



	public void setDate(int date) {
		this.date = date;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Date d=new Date();
	   d.setDate(7);
	   d.setMonth(9);
	   d.setYear(2001);
	   
	   int date=d.getDate();
	   int month=d.getMonth();
	   int year=d.getYear();
	   System.out.println("Date is:"+date+"/"+month+"/"+year);
	}

}
