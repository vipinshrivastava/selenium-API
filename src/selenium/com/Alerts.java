package selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		//driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		
		//Alert alert= driver.switchTo().alert();
	
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(100);
		alert.accept();
		alert.sendKeys("vipin");
	}

}