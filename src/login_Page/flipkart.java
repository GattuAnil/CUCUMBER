package login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String args[])
	{
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Hybrid_Framework\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
