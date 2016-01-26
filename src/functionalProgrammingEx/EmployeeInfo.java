package functionalProgrammingEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {

	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod sorting;

	public EmployeeInfo(SortMethod sorting) {
		this.sorting = sorting;
	}

	public void sort(List<Employee> emps) {

		if (sorting == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (sorting == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeComparatorSalary());
		}
	}

	public void sort(List<Employee> emps, final SortMethod sorting) {
		class EmployeeComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				if (sorting == SortMethod.BYNAME) {
					return emp1.getName().compareTo(emp2.getName());
				} else if (sorting == SortMethod.BYSALARY) {
					if (emp1.getSalary() == emp2.getSalary())
						return 0;
					else if (emp1.getSalary() < emp2.getSalary())
						return -1;
					else
						return 1;

				}
				return 0;

			}

		}
		Collections.sort(emps,new EmployeeComparator());

	}

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));

		EmployeeInfo empinfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);

		System.out.println("Employee ordered by Name:");
		empinfo.sort(emps);
		System.out.println(emps);

		System.out.println("Employee ordered by Salary:");
		empinfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		empinfo.sort(emps);
		System.out.println(emps);

	}
}
