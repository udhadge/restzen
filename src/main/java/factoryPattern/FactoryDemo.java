package factoryPattern;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFactory ef = new EmployeeFactory();
		Employee e = ef.getEmployeeInstance("Developer", 10, "Utk", 10000, 20);
		Employee e1 = ef.getEmployeeInstance("SalesPerson", 11, "Jai", 22000, 20);
		
		System.out.println(e.toString());
		System.out.println(e instanceof Developer);
		
		System.out.println(e1.toString());
		System.out.println(e1 instanceof Developer);//e1 is of salesperson
	}

}
