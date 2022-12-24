package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciBusinessDetailsPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciBusinessDetailsTest extends BaseFinvervTest {

	WebDriver BUSINESS_DETAILS_DRIVER = null;
	private EciBusinessDetailsPage eciBusinessDetails = null;

	private static final Logger logger = Logger.getLogger(EciResidentAddressTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.BUSINESS_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.BUSINESSDETAILS_DRIVER);
		BUSINESS_DETAILS_DRIVER.get(siteURL);

		this.EciloginFeature(BUSINESS_DETAILS_DRIVER, mobileNumber);

		eciBusinessDetails = new EciBusinessDetailsPage(BUSINESS_DETAILS_DRIVER);

		logger.info("Ending of GoToSiteUrl method");

	}

	@Test(priority = 1, groups = {"Regression"})
	@Description("Test Description:Verify getBusinessdetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify getBusinessdetails")
	public void getBusinessdetailsInEci() {

		logger.info("Starting of getBusinessdetailsInEci method");

		this.eciBusinessDetails.getBusinessdetails();

		logger.info("Starting of getBusinessdetailsInEci method");

	}

	@Test(priority = 2, dataProvider = "get_ECI_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setBusinessdetailsInEci")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setBusinessdetailsInEci")
	public void setBusinessdetailsInEci(String businessName, String dateOfIncorporation, String mobileNumber,
			String panNumber, String businessProofDocNumber) {

		logger.info("Starting of setBusinessdetailsInEci method");

		this.eciBusinessDetails.setBusinessdetails(businessName, dateOfIncorporation, mobileNumber, panNumber,
				businessProofDocNumber);

		logger.info("Starting of setBusinessdetailsInEci method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		BUSINESS_DETAILS_DRIVER.close();
		BUSINESS_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
