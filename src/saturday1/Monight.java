package saturday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Monight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/mominmulla/Downloads/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.indeed.co.uk");
		driver.findElement(By.id("what")).sendKeys("Selenium");
		

	}

}
