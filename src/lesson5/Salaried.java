package lesson5;

public class Salaried extends Employee {

	double salary;

	public Salaried(String id, PayCheck check, double salary) {
		super(id, check);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return salary;
	}

}
