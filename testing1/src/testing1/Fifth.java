package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Fifth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		List<WebElement> list= driver.findElements(By.tagName("a"));
		Thread.sleep(1000);
		for(WebElement we : list) {
		if(!we.getText().contentEquals(""))
			System.out.println(we.getText()+ "nnn" + we.getAttribute("href"));
		if(we.getText().contentEquals("Gmail")) {
			we.click();
			Thread.sleep(1000);
			driver.close();
	}
		}
driver.close();
}
}
