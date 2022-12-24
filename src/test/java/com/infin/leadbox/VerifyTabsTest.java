package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.test.LogInTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VerifyTabsTest extends BaseFinvervTest {

	WebDriver VERIFY_TABS_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private VerifyTheTabsPage verifytabpage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "validuserName", "validPassword","pinCode","filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String validuserName, String validPassword,
			String pinCode, String mobileNumber) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		VERIFY_TABS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.VERIFY_TABS_DRIVER);
		this.goToSite(siteURL, VERIFY_TABS_DRIVER);

		verifytabpage = new VerifyTheTabsPage(VERIFY_TABS_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, VERIFY_TABS_DRIVER);
		createApplicationWithValidData(VERIFY_TABS_DRIVER, pinCode);
		searchApplication(mobileNumber);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1)
	@Description("Test Description:Verify verifyTheTabs")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify verifyTheTabs")
	public void verifyTheTabs() {

		logger.info("Starting of verifyTheTabs method");

		this.verifytabpage.clickOnKycTabs();

		logger.info("Ending of verifyTheTabs method");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		VERIFY_TABS_DRIVER.close();
		VERIFY_TABS_DRIVER.quit();

		logger.info("Ending of tearDown  method ");

	}
}
