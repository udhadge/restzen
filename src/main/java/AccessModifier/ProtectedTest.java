package AccessModifier;

public class ProtectedTest {

	Student s = new Student();
	
	public void proTest() {
		System.out.println(s.batch); //Protected variable accessed within the package
	}
	
}

//private
//default
//protected
//public