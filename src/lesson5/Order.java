package lesson5;

import java.util.Calendar;

public class Order {

	private Commissioned commEmployee;
	private String orderNumber;
	private Calendar orderDate;
	private double orderAmount;

	public Order(String orderNumber, Calendar orderDate, double orderAmount) {

		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {

		return this.orderAmount;
	}

	public void setCommissionedEmployee(Commissioned comEmp) {

		this.commEmployee = comEmp;
	}

}
