package sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

	private static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse_api_workspace\\rest\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
}
