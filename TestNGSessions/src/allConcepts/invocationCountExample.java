package allConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationCountExample {
	
	
	
	int i=1;
	// To run same test case 'n' number of time.
	
	@Test(invocationCount=10)
	public void sampleInvocation() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C://chromedriver.exe");
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle() + "count is :"+ i);
		i++;
		driver.close();
	}
	
	
	
}
