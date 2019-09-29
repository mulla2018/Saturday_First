package saturday1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/mominmulla/Downloads/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id(".//*[@id='email']'")).sendKeys("mu");
		Thread.sleep(2000);
		
		
		driver.quit();
		
		

	}

}
