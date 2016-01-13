package lesson1;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Person> members;

	public Department(String name) {
		this.name = name;
		members = new ArrayList<Person>();
	}

	public double getTotalSalary() {

		double totalSalary = 0.0;
		for (Person list : members) {
			if (list instanceof Faculty) {
				Faculty faculty = (Faculty) list;
				totalSalary += faculty.getSalary();
			} else if (list instanceof Staff) {
				Staff st = (Staff) list;
				totalSalary += st.getSalary();
			} /*
				 * else if(list instanceof StaffStudet){ StaffStudet stst =
				 * (StaffStudet)list; totalSalary += stst.getSalary(); }
				 */
		}
		return totalSalary;
	}

	public void showAllMembers() {

		for (Person list : members) {
			Class cls = list.getClass();
			System.out.println("Name: " + list.getName() + " Phone: " + list.getPhone() + " Age: " + list.getAge()
					+ " Type: " + cls.getSimpleName());
		}

	}

	public void unitsPerFaculty() {

		for (Person list : members) {
			if (list instanceof Faculty) {
				Faculty ff = (Faculty) list;
				System.out.println(ff.getName() + ": " + ff.getTotalUnits());
			}
		}
	}

	public void addPerson(Person per) {

		members.add(per);
	}

	public void displayStudentPerFaulty(Faculty fct) {
		System.out.println("Faculty Name: " + fct.getName());
		ArrayList<Course> courseList;
		Faculty faculty;
		for (Person per : members) {
			//System.out.println("Inside Person");
			if (per instanceof Student) {
				//System.out.println("Inside Student");
				Student std = (Student) per;
				courseList = std.getCourses();
				for (Course course : courseList) {
					//System.out.println("Inside Course");
					faculty = course.getFaculty();
					if(fct.getName().equals(faculty.getName())){
						System.out.println("Student Name: " + std.getName());
						
					}
				}
			}
		}

	}
}
