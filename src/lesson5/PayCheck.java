package lesson5;

import java.util.ArrayList;

public class PayCheck {

	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	private DateRange payPeriod;
	private Employee employee;

	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double ssn,
			DateRange range) {

		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ssn;
		this.payPeriod = range;
	}

	public void print() {

		System.out.println("GrossPay: " + grossPay);
		System.out.println("Fica: " + fica);
		System.out.println("State: " + state);
		System.out.println("Local: " + local);
		System.out.println("MediCare: " + medicare);
		System.out.println("Social Security: " + socialSecurity);
		System.out.println("PayPeriod range: " + payPeriod);
	}

	public void setEmployee(Employee emp) {
		this.employee = emp;
	}

	public double getNetpay() {

		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
}
