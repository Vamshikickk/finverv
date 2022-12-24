package com.infin.leadbox;

import static FinvervApplication.utils.Constants.APP_MOBNUMBER;
import static FinvervApplication.utils.Constants.INVALID_FILTER_MOBILENUMBER;
import static FinvervApplication.utils.Constants.INVALID_PINCODE;
import static FinvervApplication.utils.Constants.PIN_CODE;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.test.LogInTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class BureauDetailsTest extends BaseFinvervTest {

	WebDriver BUREAU_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private BureauDetailsPage bureauDetailsPage = null;

	@BeforeClass
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		BUREAU_DRIVER = this.getWebDriver(browser, WEB_DRIVER.BUREAU_DRIVER);
		this.goToSite(siteURL, BUREAU_DRIVER);

		this.bureauDetailsPage = new BureauDetailsPage(BUREAU_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, BUREAU_DRIVER);
		createApplicationWithValidData(BUREAU_DRIVER, pinCode);
		
		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1)
	@Description("Test Description:Verify getFetchBureauDetails")
	@Severity(SeverityLevel.MINOR)
	@Story("Verify getFetchBureauDetails")

	public void getFetchBureauDetails() {
		logger.info("Starting of getFetchBureauDetails method");

		this.bureauDetailsPage.clickOnBureauTab();
		this.bureauDetailsPage.clickOnFetchBureauButton();

		logger.info("Ending of getFetchBureauDetails method");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		BUREAU_DRIVER.close();
		BUREAU_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}