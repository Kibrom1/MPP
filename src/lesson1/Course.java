package lesson1;

public class Course {

	private String number;
	private String title;
	private int units;
	Faculty facultyMember;

	public Course(String number, String title, int units, Faculty member) {

		this.number = number;
		this.title = title;
		this.units = units;
		this.facultyMember = member;
	}

	public String getNumber() {
		return number;
	}

	public String getTitle(){
		return title;
	}

	public int getUnits() {
		return units;
	}
}
