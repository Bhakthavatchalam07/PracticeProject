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

public class BrokenLinksAmazon {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

	WebDriver driver;
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1851919698067377&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062015&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement link:links) {
		@Nullable
		String url = link.getAttribute("href");
		System.out.println("--------------------------------------------");
		System.out.println(url);
		if(url==null ||url.isEmpty() ) {
			System.out.println("url is empty");
			continue;
		}
		try {
			 HttpURLConnection hub =( HttpURLConnection) new URL(url).openConnection();
			 hub.connect();
			 if(hub.getResponseCode()>400) {
				 System.out.println(url+"is broken");
			 }
			 else {
				 System.out.println(url+"is valid");
			 }
		}catch(Exception e) {
			
		}
	}
	driver.quit();
	}
	
}
