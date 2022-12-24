package com.infin.leadbox;

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

public class AgreementTest extends BaseFinvervTest {

	WebDriver AGREEMENT_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private AgreementTabPage agreementtabpage = null;

	@BeforeClass
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		AGREEMENT_DRIVER = this.getWebDriver(browser, WEB_DRIVER.AGREEMENT_DRIVER);
		this.goToSite(siteURL, AGREEMENT_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, AGREEMENT_DRIVER);
		createApplicationWithValidData(AGREEMENT_DRIVER, pinCode);

		logger.info("Ending of CreateApplication in Infin");

	}

	@Test(priority = 1, description = "Verify setAgreementDetails")
	@Description("Test Description:Verify setAgreementDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setAgreementDetails")
	public void setAgreementDetails(String loanAgreementdescription, String sanctionagreementdescription, String nachmandateagreement) {
		logger.info("Starting of setAgreementDetails in finverv");

		this.agreementtabpage = new AgreementTabPage(AGREEMENT_DRIVER);
		this.agreementtabpage.scrollDown(500);
		this.agreementtabpage.setAgreementDetails(loanAgreementdescription,sanctionagreementdescription,nachmandateagreement);

		this.agreementtabpage.clickOnSubmitApplicationButton();

		logger.info("Ending of setAgreementDetails in finverv");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		AGREEMENT_DRIVER.close();
		AGREEMENT_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}
}
