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

		System.out.println("Department Name: " + name + " location: "
				+ location /* + " Total Salary: $" + getSalary() */);
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

	public Company getCompany() {
		return company;
	}

	public void printReportingHeighrarchy() {
		Position head = getDepartmentHead();
		// System.out.println("Title:" + head.getTitle());
		head.printDownLine();

	}

	public Position getDepartmentHead() {
		if (!(positionList.isEmpty())) {
			Position head = positionList.get(0).getSuperior();
			for (Position pos : positionList) {
				if (!(pos.getSuperior().equals(head)))
					head = pos;
			}
			return head;
		} else
			return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
