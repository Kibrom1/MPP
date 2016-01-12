package lesson1;

import java.util.ArrayList;

public class Student extends Person {

	double GPA;
	private ArrayList<Course> courseList;

	public Student(String name, String phone, int age, double GPA) {
		super(name, phone, age);
		this.GPA = GPA;
		courseList = new ArrayList<Course>();
	}

	public double getGPA() {
		return GPA;
	}

	public int getTotalUnits() {

		return 0;
	}
	
	public void addCourse(Course course){
		courseList.add(course);
	}
}
