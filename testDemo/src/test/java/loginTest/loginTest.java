package loginTest;

import java.util.concurrent.TimeUnit;

import org.common.Basic;
import org.inputs.loginInputs;
import org.lements.LoginPage_ElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;



public class loginTest  {

	LoginPage_ElementPath lgPath=new LoginPage_ElementPath();
	loginInputs lgInputs=new loginInputs();
	Basic bas=new Basic();


	@BeforeClass

	public void launchBrowser() {

		bas.launchChromeBrowser("https://www.facebook.com/login/");
		
		bas.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	@Test
	public void verify_login() {

		bas.driver.findElement(By.id(lgPath.usernamePath)).sendKeys(lgInputs.username);
		bas.driver.findElement(By.id(lgPath.passwordPath)).sendKeys(lgInputs.password);
		bas.driver.findElement(By.xpath(lgPath.loginBtn)).click();

		String expectedResultt="https://www.facebook.com/";

		SoftAssert sAssert= new SoftAssert();
		sAssert.assertEquals(bas.driver.getCurrentUrl(), expectedResultt);

		sAssert.assertAll();

	}

	@AfterClass

	public void closeBrowser() {

		//bas.driver.close();
	}

}
