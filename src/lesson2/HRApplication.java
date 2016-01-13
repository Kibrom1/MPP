package lesson2;

public class HRApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company comp = new Company("Kb");
		Department hrDept = new Department("HR","Mekelle",comp);
		comp.addDepartment(hrDept);
		
		Department itDept = new Department("IT","Mekelle",comp);
		comp.addDepartment(itDept);
		
		comp.print();

	}

}
