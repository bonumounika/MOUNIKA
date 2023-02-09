package TestUtils;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import TestCases.FormPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidBaseTest extends AppiumUtils{

	public AndroidDriver driver;
	public FormPage formPage;
	
	@BeforeClass(alwaysRun=true)
	public void ConfigureAppium() throws IOException,MalformedURLException
	{
		
			
								
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("mounikabonu"); //emulator
			//options.setDeviceName("Android Device");// real device		
			
			options.setApp("C:\\Users\\user\\eclipse-workspace\\MounikaBonu46289797\\src\\test\\java\\org\\example\\resources\\General-Store.apk");
options.setPlatformName("AndroidName");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
        
		}
	public void scrollToText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
}


