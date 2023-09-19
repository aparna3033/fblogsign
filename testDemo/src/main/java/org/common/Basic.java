package org.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
	
	public  WebDriver driver;
	
	public void launchChromeBrowser(String url) {
		
		      
		
		// launch browser
		
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
							
				driver.navigate().to(url);
	}
	
}
