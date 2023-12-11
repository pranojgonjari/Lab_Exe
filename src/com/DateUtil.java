package com;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static void showDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date and Time: " + dateFormat.format(new Date()));
    }
	
}
