package lesson2;

import java.util.ArrayList;

public class Department {

	private String name;
	private String location;
	private Company company;
	private ArrayList<Position> positionList;

	public Department(String name, String location, Company company) {

		this.name = name;
		this.location = location;
		this.company = company;

		positionList = new ArrayList<Position>();
	}

	public void print() {

		System.out.println("Department Name: " + name + " location: " + location /* + " Total Salary: $" + getSalary()*/);
		for (Position pos : positionList)
			pos.print();
	}

	public void addPosition(Position pos) {
		positionList.add(pos);
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0;
		for (Position pos : positionList)
			totalSalary += pos.getSalary();
		return totalSalary;
	}

}
