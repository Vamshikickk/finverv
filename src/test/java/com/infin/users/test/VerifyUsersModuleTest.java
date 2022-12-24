package com.infin.users.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.CreateApplicationTest;
import com.infin.users.pages.VerifyUsersModulePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VerifyUsersModuleTest extends BaseFinvervTest {

	WebDriver USERS_DRIVER = null;
	private static final Logger logger = Logger.getLogger(CreateApplicationTest.class.getName());
	private VerifyUsersModulePage verifyusermodulepage = null;

	@BeforeClass

	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		USERS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.USERS_DRIVER);
		this.goToSite(siteURL, USERS_DRIVER);
		this.loginFeature(invaliduserName, invalidPassword, USERS_DRIVER);
		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1)
	@Description("Test Description:Verify createNewUser")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify createNewUser")

	public void createNewUser() {
		logger.info("Starting of createNewUser method");

		this.verifyusermodulepage.setCreateNewUserDetails();

		logger.info("Ending of createNewUser method");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		USERS_DRIVER.close();
		USERS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}
}
