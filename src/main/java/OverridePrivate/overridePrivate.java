package OverridePrivate;

class overide1{
	private void method() {
		System.out.println("Private method in parent class");
	}
	
	public static void method1() {
		System.out.println("Static method in parent class");
	}
}

public class overridePrivate extends overide1{

	/*
	 * Private method cannot to be overriden,
	 * below method can be defined in child class but it is treated as child class method and NOT overriden method
	 */
	private void method() {
		System.out.println("Private method in child class");
	}
	
	public static void method1() {
		System.out.println("Static method in child class");
	}
	
	public static void main(String args[]) {
		overridePrivate op = new overridePrivate();
		op.method();
		overide1.method1();
		overridePrivate.method1();
	}
}
