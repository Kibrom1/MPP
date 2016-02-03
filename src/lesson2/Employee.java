package lesson2;

import java.sql.Date;

public class Employee {

	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date dateOfBirth;
	private String SSN;
	private double salary;

	private Position positionHeld;

	public Employee(String empId, String firstName, String middleName, String lastName, String SSN, double salary,
			Position posHeld) {

		this.employeeId = empId;
		this.firstName = firstName;
		this.middleInitial = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.salary = salary;
		this.positionHeld = posHeld;
	}

	public Date setDateOfBirth() {
		return dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public Position getPostion() {
		return positionHeld;
	}

	public void print() {

		System.out.println("Employee Id: " + employeeId + " Name: " + firstName + " " + middleInitial + " " + lastName
				+ " SSN: " + SSN + " Date of birth: " + dateOfBirth + " Salary: " + salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
		result = prime * result + ((positionHeld == null) ? 0 : positionHeld.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (this.SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleInitial == null) {
			if (other.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(other.middleInitial))
			return false;
		if (positionHeld == null) {
			if (other.positionHeld != null)
				return false;
		} else if (!positionHeld.equals(other.positionHeld))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
