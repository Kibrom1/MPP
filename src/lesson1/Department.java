package lesson1;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Person> members;

	public Department(String name) {
		this.name = name;
	}

	public double getTotalSalary() {

		double totalSalary = 0.0;
		for (Person list : members) {
			if (list instanceof Faculty){
				Faculty faculty = (Faculty)list;
				totalSalary += faculty.getSalary();
			}
			else if (list instanceof Staff){
				Staff st = (Staff)list;
				totalSalary += st.getSalary();
			}
		}
		return totalSalary;
	}

	public void showAllMembers() {

		for (Person list : members) {
			Class cls = list.getClass();
			System.out.println("Name: " + list.getName() + " Phone: " + list.getPhone() + " Age: " + list.getAge()
					+ " Type: " + cls.getName());
		}

	}

	public int unitsPerFaculty() {

		return 0;
	}

	public void addPerson() {

		members = new ArrayList<Person>();

	}

}
//Questions 
/*
 * how the add person or add course is managed
 * how the unitsperFaculty is calculated
 * */
 */