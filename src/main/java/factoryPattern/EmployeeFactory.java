package factoryPattern;

public class EmployeeFactory {

	public Employee getEmployeeInstance(String type,int id,String name,int salary,int bonus) {
		Employee e = null;
		
		if(type.equals("Developer")) {
			return new Developer(id,name,salary,bonus);
		}else {
			return new SalesPerson(id,name,salary,bonus);
		}
	}
}
