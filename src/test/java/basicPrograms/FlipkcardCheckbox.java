package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkcardCheckbox {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;
    
driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(4000);
driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//*[contains(@title,'Google')]//child::div[@class='XqNaEv']")).click();
Thread.sleep(4000);

//driver.close();
		
	}
}
////div[@title='Google']
////div[@title='Google']/child::div/child::label/child::div[1]