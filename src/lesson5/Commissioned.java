package lesson5;

import java.util.ArrayList;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	private ArrayList<Order> orderList;

	public Commissioned(String id, PayCheck check, double comm, double salary) {
		super(id, check);
		// TODO Auto-generated constructor stub
		this.commission = comm;
		this.baseSalary = salary;
	}

	public void addOrder(Order order) {

		orderList.add(order);
	}

	private double calcCommission() {
		double totalCommission = 0;
		for (Order orders : orderList) {
			totalCommission += commission * orders.getOrderAmount();
		}

		return baseSalary + totalCommission;
	}

	@Override
	public double calcGrosspay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
