package TestCases;


import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtils.AndroidBaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class Question1  extends AndroidBaseTest{

	@BeforeMethod
	public void preSetup()
	{
		//screen to home page
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		driver.startActivity(activity);	
	}
	@Test
	public void FillForm_PositiveFlow() throws InterruptedException

	
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mounika");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanisthan\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.widget.Toast)[1]")).size()<1);		
	}
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
        
		}
}
		
		
		