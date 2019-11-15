package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String vBrowser="GC";
		if(vBrowser.equals("FF")) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium jar\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");


driver.close();
		}
else if(vBrowser.equals("GC")){
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium jar\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("sabrimalai verdict");
	Thread.sleep(5000);
	driver.findElement(By.className("gNO89b")).click();
	String st = driver.findElement(By.id("resultStats")).getText();
	//driver.findElement(By.cssSelector(".q.qs")).click();
	driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[1]/div[5]/div/div/div[1]/div/div/div[1]/div/div[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class = 'gb_ce gb_3 gb_rb']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@jsname = 'Cuz2Ue']")).click();
	System.out.println(st);
	Thread.sleep(5000);
	driver.close();
	



	}
}
}