package testing1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eleventh {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.id("uh-search-box")).sendKeys("IBM");
		driver.findElement(By.id("uh-search-button")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	}

}
