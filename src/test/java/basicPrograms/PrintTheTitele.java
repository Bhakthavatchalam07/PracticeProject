package basicPrograms;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheTitele {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver;
     driver=new ChromeDriver();
     driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
     driver.findElement(By.id("login-google-button")).click();
     driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
     
     Set<String> allwb = driver.getWindowHandles();
     for(String wb:allwb) {
    	 driver.switchTo().window(wb);
    	 @Nullable
		String title = driver.getTitle();
    	 System.out.println(title);
    	 driver.close();
     }
    
	}

}
