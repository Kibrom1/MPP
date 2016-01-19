package lesson5;

import java.util.Date;

public class Payroll {
	
	public static void main(String[] args){
		
		System.out.println("First Day " + DateRange.getFirstDayOfMonth(new Date()));
		System.out.println("Last Day " + DateRange.getLatDayOfMonth(new Date()));
	}

}
