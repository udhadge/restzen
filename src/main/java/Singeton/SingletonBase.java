package Singeton;

public class SingletonBase {
	
	private static SingletonBase sb;
	private int value = 10;
	
	private SingletonBase() {
		
	}
		
	public static SingletonBase getInstance() {
		return new SingletonBase();
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
