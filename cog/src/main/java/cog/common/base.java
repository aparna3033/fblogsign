package cog.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public WebDriver driver;
	public void launchChromeBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
	}

}



	



