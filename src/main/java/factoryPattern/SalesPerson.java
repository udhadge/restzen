package factoryPattern;

public class SalesPerson extends Employee {

	private int incentive;
	
	SalesPerson(int id, String name, int salary,int incentive) {
		super(id, name, salary);
		this.incentive = incentive;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
