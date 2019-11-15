package testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Fourth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youcandealwithit.com");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Borrowers']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Calculators & Resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Calculators")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Budget Calculator")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("food")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		Thread.sleep(1000);
		
		
		System.out.println("Total Monthly Savings :" + driver.findElement(By.id("totalMonthlySavings")).getAttribute("value"));
		System.out.println("Total Monthly Expenses :" + driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value"));
		System.out.println("Under / Over Budget :" + driver.findElement(By.id("underOverBudget")).getAttribute("value"));

		
		driver.close();
	}

}
