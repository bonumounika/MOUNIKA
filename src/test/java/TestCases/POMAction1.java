package TestCases;

import org.testng.annotations.Test;

import TestUtils.AndroidBaseTest;

public class POMAction1 extends AndroidBaseTest{
		@Test
		public void Options() throws InterruptedException {
		FormPage ep= new FormPage(driver);
		Thread.sleep(3000);
		ep.ClickName().sendKeys("Mounika");
		Thread.sleep(3000);
		ep.ClickGender().click();
		Thread.sleep(3000);
		ep.OptionCountry().click();
		ep.OptionCountryScroll();
		ep.OptionCountrySelect().click();
		ep.ClickShopBtn().click();
		Thread.sleep(3000);
		
		}
}
