package TestngReRunFailed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunTest {

	@Test
	public void test1() {
		System.out.println("a");
	}
	
	@Test
	public void test2() {
		System.out.println("a");
	}
	
	@Test
	public void test3() {
		System.out.println("a");
	}
	
	@Test
	public void test4() {
		System.out.println("a");
		Assert.assertEquals("a", "b");
	}
}
