package lesson5;

import java.util.Calendar;
import java.util.Date;

public class Payroll {
	
	public static void main(String[] args){
		
		System.out.println("First Day " + DateRange.getFirstDayOfMonth(new Date()));
		System.out.println("Last Day " + DateRange.getLatDayOfMonth(new Date()));
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(2016, 1, 1);
		Calendar endDate = Calendar.getInstance();
		endDate.set(2016, 1, 31);
		//DateRange range = new DateRange(startDate, endDate);
		
		//Employee emp = new Hourly ("Kibrom", range, 10, 20);
		
	}

}
