package java8homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Program 4: Employee.java
//Employee class.
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	enum SortMethod {
		BYNAME, BYSALARY
	};

	private static SortMethod method;

	// constructor
	public Employee(String firstName, String lastName, double salary, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	// set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get firstName
	public String getFirstName() {
		return firstName;
	}

	// set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get lastName
	public String getLastName() {
		return lastName;
	}

	// set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// get salary
	public double getSalary() {
		return salary;
	}

	// set department
	public void setDepartment(String department) {
		this.department = department;
	}

	// get department
	public String getDepartment() {
		return department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	// return a String containing the Employee's information
	@Override
	public String toString() {
		return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartment());
	} // end method toString

	// Comparator<Employee> empCopare = (Employee e1, Employee e2)->{if()}

	static Comparator<Employee> employeeCompare = (e1, e2) -> {
		if (method == SortMethod.BYNAME) {
			return e1.getFirstName().compareTo(e2.getFirstName());
		} else if (method == SortMethod.BYSALARY) {
			if (e1.getSalary() == e2.getSalary())
				return 0;
			else if (e1.getSalary() < e2.getSalary())
				return -1;
			else
				return 1;
		}
		return 0;
	};

	public static void sortEmployee(List<Employee> emps, SortMethod sorting) {
		
		Collections.sort(emps, employeeCompare);

	}

} // end class Employee