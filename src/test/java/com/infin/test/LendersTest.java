package com.infin.test;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.pages.LendersTabPage;
import com.infin.pages.LogInTabPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LendersTest extends BaseFinvervTest {

	private static final Logger logger = Logger.getLogger(LendersTest.class.getName());

	protected WebDriver lendersdriver = null;
	private LogInTabPage logInPage = null;
	private LendersTabPage lenderstabPage = null;

	@BeforeClass
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword"})

	public void lendersDriver(String siteURL, String browser, String invaliduserName, String invalidPassword, 
			String validuserName, String validPassword) throws Exception {

		logger.info("Starting of lendersDriver in finverv");
		this.lendersdriver = this.getWebDriver(browser, WEB_DRIVER.LENDERS_DRIVER);
		this.goToSite(siteURL, lendersdriver);
		
		this.lenderstabPage = new LendersTabPage(this.lendersdriver);
		this.loginFeature(invaliduserName, invalidPassword, lendersdriver);
		logger.info("Ending of of lendersDriver in finverv");

	}
	@Test(priority = 1, description = "Verify verifyLendersTabTest in finverv ")
	@Description("Test Description:Verify verifyLendersTabTest in finverv")
	@Severity(SeverityLevel.MINOR)
	@Story("Verify verifyLendersTabTest in finvervs")

	public void verifyLendersTabTest() throws InterruptedException {

		logger.info("starting of verifyLendersTabTest method");
		this.lenderstabPage.clickOnLenders();
		logger.info("Ending of verifyLendersTabTest method");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");
		lendersdriver.close();
		lendersdriver.quit();
		logger.info("Ending of tearDown  method ");

	}

}
