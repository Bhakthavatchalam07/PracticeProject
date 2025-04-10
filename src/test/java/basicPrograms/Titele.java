package basicPrograms;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titele {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	
	public static void main(String[] args) {
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
		@Nullable
		String tital = driver.getTitle();
		System.out.println(tital);
driver.close();
	}

}
