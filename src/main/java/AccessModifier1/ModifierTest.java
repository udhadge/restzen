package AccessModifier1;
import AccessModifier.Student;
public class ModifierTest extends Student {

	ModifierTest m = new ModifierTest();
	
	public void accessMod() {
		System.out.println(m.name);
		
		System.out.println(m.batch); // Protected variable accessed after inheritance
		

	}
}
