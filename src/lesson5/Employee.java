package lesson5;

import java.util.Calendar;
import java.util.Date;

public abstract class Employee {

	private String empId;

	private PayCheck payCheck;

	public Employee(String id, PayCheck check) {

		this.empId = id;
		this.payCheck = check;
	}

	public void print() {

		System.out.println("Id: " + empId);
	}

	public PayCheck calcCompensation(int month, int year) {

		double grossPay = calcGrosspay();
		double fica = (grossPay * 23) / 100;
		double state = (grossPay * 5) / 100;
		double local = (grossPay * 1) / 100;
		double mediCare = (grossPay * 3) / 100;
		double social = (grossPay * 7.5) / 100;

		//return new PayCheck(grossPay, fica, state, local, mediCare, social,
			//	new DateRange(DateRange.getFirstDayOfMonth(new Date()), DateRange.getLatDayOfMonth(new Date())));
		
		return null;
	}

	public abstract double calcGrosspay();

}
