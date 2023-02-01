import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class Question2 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Debanjan", 50000));
		employeeList.add(new Employee(102, "Argha", 50000));
		employeeList.add(new Employee(103, "Gaurav", 25000));
		employeeList.add(new Employee(104, "Shivam", 10000));
		
		List<Employee> filteredEmployeeList = new ArrayList<Employee>();
		filteredEmployeeList = employeeList.stream().map(e->new Employee(e.id, e.name, e.salary+0.1*e.salary)).collect(Collectors.toList());
		// filteredEmployeeList = employeeList.stream().map(e->{e.salary+=0.1*e.salary;return e;}).collect(Collectors.toList());

		System.out.println("EmployeeList with salary of every employee incremented by 10%:");
		System.out.println(filteredEmployeeList);
	}

}
