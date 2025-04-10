package basicPrograms;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlySpcificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		String title = "Sign in to Apple Account";
		 WebDriver driver;
	     driver=new ChromeDriver();
	    
	     driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	     driver.findElement(By.id("login-google-button")).click();
	    driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	    Thread.sleep(3000);
	        Set<String> allwb = driver.getWindowHandles(); 
	        for(String wb:allwb) {
	        	   Thread.sleep(3000);
	        	driver.switchTo().window(wb);
	        	
	        	@Nullable
				String atitle = driver.getTitle();
	        	if(!atitle.equals(title)) {
	        		driver.close();
	        	}
	        }
	    
	}

}
