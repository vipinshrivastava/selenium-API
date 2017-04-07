package selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a")).click();
		
		WebElement menu= driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.linkText("Apple")).click();
		
		//geeting error 
//this is to test jenkins
// this is to test jenkins for second.
	}

}
