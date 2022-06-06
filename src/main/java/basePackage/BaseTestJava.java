package basePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BaseTestJava {

	public static void main(String[] args) {
		
		Employee e[] = new Employee[10];
		
		Employee e1 = new Employee(1,"utk",10000);
		Employee e2 = new Employee(2,"jai",20000);
		
		e[0] = e1;
		System.out.println(e[0]);
		
		/////////////// List //////////////////////////
		List<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		
		System.out.println(l);
		Iterator<Employee> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Element is:"+itr.next());
		}
		
		//////////// Map ////////////////////
		Map <Integer,Employee> m = new HashMap<Integer, Employee>();
		m.put(10, e1);
		m.put(20, e2);
		
		System.out.println("Map elements:"+m);
		
		Set<Integer> s = m.keySet();
		System.out.println("Key Set:" + s);
		System.out.println("Get value by Key :" + m.get(10));
				
		Iterator<Integer> itr1 = s.iterator();
		System.out.println("Map Print:");
		while(itr1.hasNext()) {
			System.out.println(m.get(itr1.next()));
		}
		
		System.out.println("Map print by entry set");
		for(Map.Entry<Integer,Employee> mapEntry : m.entrySet()){    
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());    
		}  
	}
}
