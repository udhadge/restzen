package InterfaceDemo;

public interface Salary {

	static String org = "Zensar";
	public void calculateSalary();
	
	/*
	 * Static method in interface allowed from java 8
	 *
	public static String getOrganization() {
		return org;
	}
	*/
}
