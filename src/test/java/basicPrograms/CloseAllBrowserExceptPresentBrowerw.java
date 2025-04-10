package basicPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserExceptPresentBrowerw {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
     WebDriver driver;
     driver=new ChromeDriver();
     String pb = driver.getWindowHandle();
     driver.switchTo().window(pb);
     driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
     driver.findElement(By.id("login-google-button")).click();
    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
     Thread.sleep(3000);
        Set<String> allwb = driver.getWindowHandles();
        for(String wb:allwb) {
        	Thread.sleep(3000);
        driver.switchTo().window(wb);
        
		if(wb.equals(pb)) {
        	
        }
		else {
			driver.close();
		}
	}

}}
