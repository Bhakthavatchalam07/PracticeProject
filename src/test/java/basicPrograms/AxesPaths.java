package basicPrograms;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AxesPaths {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
       driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[text()='Mobiles']/ancestor::a")).click();
        @Nullable
		String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Mobile Phones Online at Best Prices in India")){
        	Assert.assertTrue(true);
        }
       //Assert.assertEquals("Mobile Phones Online at Best Prices in India", driver.getTitle())	;
        else {
        	
       driver.close();
        }
        driver.findElement(By.xpath("//div[text()='SAMSUNG']/preceding::div[@class='XqNaEv'][1]")).click();
      /*  List<WebElement> allLinks = driver.findElements(By.id("container"));
        int count = allLinks.size();
        System.out.println(count);
        for(int i=0;i<=count;i++) {
        	//String titles = allLinks.get(i).;
        	//System.out.println(titles);
        	String text = allLinks.get(i).getText();
  
        	System.out.println(text);
        	driver.close();
        }
        */
       List<WebElement> alltext = driver.findElements(By.xpath("//*[contains(text(),'SAMSUNG')]"));
       Thread.sleep(3000);
       int count = alltext.size();
       System.out.println(count);
	for(int i=0;i<count;i++) {
    	  String  text=alltext.get(i).getText();
       
       System.out.println(text);
       }
	driver.close();
	}
	}


