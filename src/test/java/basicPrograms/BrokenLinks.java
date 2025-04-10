package basicPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://tutorialsninja.com/demo/");
      List<WebElement> allurl = driver.findElements(By.tagName("a"));
      for(WebElement link:allurl) {
    	  @Nullable
		String url = link.getAttribute("href");
    	  System.out.println(".................");
    	  System.out.println(url);
    	  if(url==null &&url.isEmpty()) {
    		  System.out.println("links is empty.");
    		  continue;
    	  }
    	  try {
    		HttpURLConnection hub =(HttpURLConnection) new URL(url).openConnection();
    		hub.connect();
    		if(hub.getResponseCode()>=400) {
    			System.out.println(url+"is broken");
    		}
    		else {
    			System.out.println(url+"is valid");
    		}
    	  }catch(Exception e){
    		  
    		  
    	  }
    		  
    	  }
    		  driver.quit();
      }
    	  
	}


