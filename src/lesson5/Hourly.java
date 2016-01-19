package lesson5;

public class Hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(String id, PayCheck check, double hourlyWage, double hoursPerWeek) {
		super(id, check);
		// TODO Auto-generated constructor stub
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return this.hourlyWage * hoursPerWeek * 4;
	}

}
