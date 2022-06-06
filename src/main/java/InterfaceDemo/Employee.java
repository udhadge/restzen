package InterfaceDemo;

public class Employee implements Salary{

	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Calculate salary method");
	}

	public static void main(String args[]) {
		Employee e = new Employee();
		e.calculateSalary();
		//System.out.println(Salary.getOrganization());
	}
}
