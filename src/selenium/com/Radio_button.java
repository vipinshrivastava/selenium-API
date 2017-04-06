package selenium.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_button {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]"));
        
        
        WebElement block= driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[1]/div/div[2]"));
        
        List<WebElement>checkboxs =block.findElements(By.name("sports"));
        
        System.out.println(checkboxs.size());
     
        for(int i=0;i<checkboxs.size();i++){
        checkboxs.get(i).click();
        
	}

}}
