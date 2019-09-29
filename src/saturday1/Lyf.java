package saturday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lyf {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new FirefoxDriver();	System.setProperty("webdriver.gecko.driver", "/Users/mominmulla/Downloads/geckodriver");
		driver.get("https://www.indeed.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='what']")).sendKeys("Fashion");
		driver.findElement(By.xpath(".//*[@id='where']")).clear();
		driver.findElement(By.xpath(".//*[@id='where']")).sendKeys("New York");
		driver.findElement(By.xpath(".//*[@id='fj']")).click();
		
		
	
	
	
	System.out.println(driver.getTitle());
	String numbers = driver.findElement(By.id("searchCount")).getText();
	System.out.println(numbers);
	//System.out.println(driver.findElement(By.xpath(".//*[@id='searchCount']")).getText());
	Thread.sleep(2000);
	
	driver.quit();
	
 
    	
   
    
		
		
		
		
		
		
		//Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
