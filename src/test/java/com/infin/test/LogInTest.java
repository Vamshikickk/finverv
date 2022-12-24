package com.infin.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LogInTest extends BaseFinvervTest {

	WebDriver loginDriver = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser" })
	public void finvervLogin(String siteURL, String browser) throws Exception {
		logger.info("Starting of LoginTest in finverv");

		loginDriver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.goToSite(siteURL, loginDriver);

		logger.info("Ending of of LoginTest in finverv");

	}

	@Test(priority = 1)
	@Parameters({ "validuserName", "validPassword"})
	@Description("Test Description:verify Login")
	@Severity(SeverityLevel.BLOCKER)
	@Story("verify Login")
	public void logInWithValidCredentials(String validuserName, String validPassword) throws InterruptedException {
		logger.info("Starting of logInWithValidCredentials method");

		this.loginFeatureWithValidCredentials(validuserName, validPassword, loginDriver);

		logger.info("Ending of logInWithValidCredentials method");
	}

	@Test(priority = 2, dataProvider = "get_Login_Credentials", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:verify Login")
	@Severity(SeverityLevel.BLOCKER)
	@Story("verify Login")
	public void verifyLogIn(String userName, String Password) throws InterruptedException {
		logger.info("Starting of verifyLogIn method");

		this.loginFeature(userName, Password, loginDriver);

		logger.info("Ending of verifyLogIn method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		loginDriver.close();
		loginDriver.quit();

		logger.info("Ending of tearDown method");
	}

}
