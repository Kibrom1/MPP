package lesson2;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Department> departmentList;

	public Company(String name) {

		this.name = name;
		departmentList = new ArrayList<Department>();
	}

	public void print() {
		System.out.println("Company Name: " + name /* + " Total Salary: $" + getSalary()*/);
		for (Department dept : departmentList)
			dept.print();

	}

	public void addDepartment(Department dept) {
		departmentList.add(dept);
	}

	public double getSalary() {
		double totalSalary = 0;
		for (Department dept : departmentList)
			totalSalary += dept.getSalary();
		return totalSalary;
	}
}
