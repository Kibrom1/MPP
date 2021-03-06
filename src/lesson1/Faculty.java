package lesson1;

import java.util.ArrayList;

public class Faculty extends Person {

	private double salary;
	private ArrayList<Course> courseList;
	
	public Faculty(String name, String phone, int age, double salary ){
		super(name,phone,age);
		this.salary = salary;
		courseList = new ArrayList<Course>();
	}
	
	public double getSalary(){
		return salary;
	}

	public int getTotalUnits() {

		int totalUnits = 0;
		for(Course courses : courseList){
			totalUnits += courses.getUnits();
		}
		return totalUnits;
	}

	public void addCourse(Course course){
		courseList.add(course);
	}
	public void displayFacultyStudents(){
		System.out.println("Name of faculty: " + getName());
	}
}
