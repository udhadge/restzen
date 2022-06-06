package smallPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class smallPrograms {

	@Test(enabled = true)
	public void revString() {
		String s = "utkarsh";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.equals(s));
	}
	
	@Test(enabled = true)
	public void palindrome() {
		String s = "nitin";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.equalsIgnoreCase(s));
	}
	
	@Test(enabled=false)
	public void duplicateElement() {
		String name = "madama";
		Set<Character> s = new HashSet<Character>();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<=name.length()-1;i++) {
			if(s.add(name.charAt(i)) == false){
				m.put(name.charAt(i), m.getOrDefault(name.charAt(i), 1)+1);
				System.out.println("Duplicate:"+ name.charAt(i));
			}
		}
		System.out.println(s);
		System.out.println(m);
	}
	
	@Test
	public void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	@Test
	public void subString() {
		Pattern pattern = Pattern.compile(".*" + "some" + ".*");

		Matcher matcher = pattern.matcher("Here is some pattern!");
		System.out.println(matcher.find());
	}
	
	@Test
	public void subString1() {
		Pattern pattern = Pattern.compile("[A-F]");
		Matcher matcher = pattern.matcher("EF8");
		System.out.println(matcher.find());
	}
	
	@Test
	public void dfg() {
		Pattern p = Pattern.compile("sub string");
		Matcher m = p.matcher("main string");
		m.find();
	}
}



