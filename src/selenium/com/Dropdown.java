package selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
		//WebElement dropdown=driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		//Select select = new Select (dropdown);
		//select.selectByValue("hi");
		        	
	List<WebElement> values =driver.findElements(By.tagName("option"));
	
	System.out.println(values.size());
	
	for (int i=0;i<values.size();i++){
	 System.out.println(values.get(i).getAttribute("lang"));
	}
		//Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']"))) ;
		//driver.quit();
	
	System.out.println("---- priniting all links - - - -");
	
	WebElement block =driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[1]/div/div[2]"));	
	
	List<WebElement> links =block.findElements(By.tagName("a"));
	
	
//List<WebElement> links =driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for (int i=0;i<links.size();i++)
	{
	 System.out.println(links.get(i).getAttribute("href"));
	 
	
	}
	
	}
}
// this is sample jenkins test 
