package loginTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.common.Basic;
import org.inputs.loginInputs;
import org.inputs.signupInputs;
import org.lements.SignupPage_Elementpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class signupTest {

	SignupPage_Elementpath sgpath=new SignupPage_Elementpath();
	signupInputs sgInputs=new signupInputs();
	Basic bas=new Basic();
	
	@BeforeClass
	public void launchBrowser() {

		bas.launchChromeBrowser("https://www.facebook.com/signup");
		
		bas.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
   @Test(priority=1)
   public void verify_signup() {
	   //verify firstname
	   
	   WebElement firstname=bas.driver.findElement(By.name(sgpath.firstnamepath));
	   firstname.isEnabled();
	   firstname.isDisplayed();
	  firstname.sendKeys(sgInputs.firstname);
	  
	  WebElement lastname=bas.driver.findElement(By.name(sgpath.lastnamepath));
	  lastname.isEnabled();
	  lastname.isDisplayed();
	  lastname.sendKeys(sgInputs.lastname);
	   
      WebElement email=bas.driver.findElement(By.name(sgpath.emailpath));
      email.isEnabled();
      email.isDisplayed();
      email.sendKeys(sgInputs.email);
		
      WebElement password=bas.driver.findElement(By.name(sgpath.passwordpath));
      password.isEnabled();
      password.isDisplayed();
      password.sendKeys(sgInputs.password);
	
	  WebElement birth_day=	bas.driver.findElement(By.name(sgpath.birth_dayPath));
	  birth_day.isEnabled();
	  birth_day.isDisplayed();
	  birth_day.sendKeys(sgInputs.birthday_day);
		
	  WebElement birth_month=bas.driver.findElement(By.name(sgpath.birth_monthPath));
	  birth_month.isEnabled();
	  birth_month.isDisplayed();
	  birth_month.sendKeys(sgInputs.birthday_month);
		
	  WebElement birth_year=bas.driver.findElement(By.name(sgpath.birth_yearPath));
	  birth_year.isEnabled();
	  birth_year.isDisplayed();
	  birth_year.sendKeys(sgInputs.birthday_year);
	
	  WebElement gender=bas.driver.findElement(By.xpath(sgpath.gender));
	  gender.isEnabled();
	  gender.isDisplayed();
	  gender.click();
		
		bas.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		
		
		String actualResultPath="/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[1]/span/div/a";
		WebElement actR=bas.driver.findElement(By.xpath(actualResultPath));
		System.out.println(actR.getText());
		//SoftAssert sAssert= new SoftAssert();
		//sAssert.assertEquals(bas.driver.getCurrentUrl();

		//sAssert.assertAll();

   }
   
   
    @AfterClass
    public void closeBrowser() {

		bas.driver.close();
	}
  
   

}