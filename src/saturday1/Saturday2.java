package saturday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saturday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/mominmulla/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}

}
