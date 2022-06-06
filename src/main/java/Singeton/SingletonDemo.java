package Singeton;

public class SingletonDemo {

	public static void main(String args[]) {
		SingletonBase sb = SingletonBase.getInstance();
		
		System.out.println(sb.getValue());
		sb.setValue(20);
		System.out.println(sb.getValue());
	}
	
}
