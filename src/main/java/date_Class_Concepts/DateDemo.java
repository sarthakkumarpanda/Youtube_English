package date_Class_Concepts;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());

		// MM//dd/yyyy - let's say you want date in this fashion
		// mm/dd/yyyy HH:MM:SS - let's say you want date in this fashion

		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		// sdf.format(date);
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf1 = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");

		System.out.println(sdf1.format(date));

	}
	
	public static String customizedEmailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@rediffmail.com";
	}

}
