package saturday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Solation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "/Users/mominmulla/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mulla");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.id("u_0_1")).sendKeys("test");
		driver.findElement(By.id("u_0_3")).sendKeys("test seliemum");
		

		
		
		driver.findElement(By.id("u_0_h")).click();
		driver.findElement(By.id("u_0_l")).click();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
