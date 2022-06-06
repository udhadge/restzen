package basePackage;

public class Employee {

	private int Id;
	private String Name;
	private int Salary;
	
	Employee(int Id,String Name,int Salary){
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
}
