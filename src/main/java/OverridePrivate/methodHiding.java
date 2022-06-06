package OverridePrivate;

class methodHidingParent {

	public static void method() {
		System.out.println("Method in parent class");
	}
}


public class methodHiding extends methodHidingParent{

	/*
	 * this is method hiding and NOT overriding
	 * method hiding is only applicable to static methods
	 */
	public static void method() {
		System.out.println("Method in child class");
	}
	
	public static void main(String args[]) {
		methodHiding.method();
	}
}