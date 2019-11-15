package testing1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seventh {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		Thread.sleep(1000);
		List<WebElement> list= driver.findElements(By.xpath("//*[@type = 'radio']"));
		Thread.sleep(1000);
		System.out.println(list.size());
		for(WebElement w:list) {
			System.out.println(w.getAttribute("value") + "---");
			if(w.getAttribute("value").equals("Cheese")) {w.click();
			System.out.println("Success");
			Thread.sleep(2000);
			}
			
		}
		driver.close();
	}


}
