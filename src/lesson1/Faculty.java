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

		return 0;
	}

	public void addCourse(Course course){
		courseList.add(course);
	}
}
