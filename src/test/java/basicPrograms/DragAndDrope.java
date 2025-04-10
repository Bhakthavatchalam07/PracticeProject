package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrope {
static {
	System.setProperty("webdriver.chrome", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver;
		Actions a;
	driver=	new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
		//WebElement src = driver.findElement(By.xpath("//h3"));
		WebElement dest = driver.findElement(By.xpath("//h5[text()='Extras']"));
		WebElement src = driver.findElement(By.xpath("//h3"));
		a=new Actions(driver);
		a.dragAndDrop(dest,src).perform();
//driver.close();
	}

}
