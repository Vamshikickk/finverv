package com.verifyModules.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;
import com.infin.test.LogInTest;
import com.infinModules.pages.VerifyModulesPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VerifyModulesTest extends BaseFinvervTest {

	WebDriver VERIFY_MODULES_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private VerifyModulesPage verifymodulepage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "validuserName", "validPassword" })
	public void leadBoxDriver(String siteURL, String browser, String validuserName, String validPassword)
			throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		VERIFY_MODULES_DRIVER = this.getWebDriver(browser, WEB_DRIVER.VERIFY_MODULES_DRIVER);
		this.goToSite(siteURL, VERIFY_MODULES_DRIVER);

		verifymodulepage = new VerifyModulesPage(VERIFY_MODULES_DRIVER);
		loginFeatureWithValidCredentials(validuserName, validPassword, VERIFY_MODULES_DRIVER);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_valid_personal_details_data",dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify verifyModules")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPersonalDetails")

	public void verifyModules() throws IOException {
		
		logger.info("Starting of verifyModules method");
		this.verifymodulepage.implicitWait();
		verifymodulepage.sss();
		this.verifymodulepage.collection();

		logger.info("Ending of verifyModules method");

	}

	/*
	 * @Test(priority = 1)
	 * 
	 * @Description("Test Description:Verify verifyModules")
	 * 
	 * @Severity(SeverityLevel.CRITICAL)
	 * 
	 * @Story("Verify setValidPersonalDetails")
	 * 
	 * public void verifytheModules() {
	 * logger.info("Starting of verifyModules method");
	 * this.verifymodulepage.implicitWait();
	 * 
	 * this.verifymodulepage.verifytheModules();
	 * 
	 * logger.info("Ending of verifyModules method");
	 * 
	 * }
	 */

	/*
	 * @AfterClass public void tearDown() {
	 * logger.info("Starting of tearDown method");
	 * 
	 * VERIFY_MODULES_DRIVER.close(); VERIFY_MODULES_DRIVER.quit();
	 * 
	 * logger.info("Ending of tearDown method"); }
	 */
}
