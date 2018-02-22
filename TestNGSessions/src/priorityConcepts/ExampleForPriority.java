package priorityConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleForPriority {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.drive", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().fullscreen();
	}
	
	@Test(priority=1)
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);		
		
	}
	
	@Test(priority=3)
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=2)
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	
	
	@Test(priority=4)
	public void  test1() {
		System.out.println("tet1");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
