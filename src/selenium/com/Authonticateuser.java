package selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authonticateuser {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://user name:password@getproactiv-ca.stg01.grdev.com/");
		//grcdev:nearlythere
	}

}
