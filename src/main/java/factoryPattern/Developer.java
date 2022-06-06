package factoryPattern;

public class Developer extends Employee {

	private int bonus;
	Developer(int id, String name, int salary,int bonus) {
		super(id, name, salary);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Developer [bonus=" + bonus +"," + super.toString() + "]";
	
	}
	
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
