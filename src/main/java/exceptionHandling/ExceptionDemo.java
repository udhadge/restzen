package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exceptionTest();
		
	}
	
	public static void exceptionTest() {
		int a = 10;	
		try {
		int b = a/0;
		}
	//	catch(ArithmeticException e) {
	//		System.out.println("Arithematic exceptin occured in code");
	//	}
		catch(Exception e) {
			System.out.println("General catch block");
		}
	}

}
