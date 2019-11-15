package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Three {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwarecertifications.org/enroll-and-register/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Certifications']"))).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Certified Software")).click();
	driver.close();
	}

}
