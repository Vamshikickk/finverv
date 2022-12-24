package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciFinancialDetailsPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciFinancialDetailsTest extends BaseFinvervTest {

	WebDriver ECI_FINANCIAL_DETAILS_DRIVER = null;
	private EciFinancialDetailsPage ecifinancialdetails = null;

	private static final Logger logger = Logger.getLogger(EciResidentAddressTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.ECI_FINANCIAL_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.ECI_FINANCIAL_DETAILS_DRIVER);
		ECI_FINANCIAL_DETAILS_DRIVER.get(siteURL);
		this.EciloginFeature(ECI_FINANCIAL_DETAILS_DRIVER, mobileNumber);
		this.ecifinancialdetails = new EciFinancialDetailsPage(ECI_FINANCIAL_DETAILS_DRIVER);

		logger.info("Ending of GoToSiteUrl method");

	}

	@Test(priority = 1)
	@Description("Test Description:Verify setFinancialDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setFinancialDetails")

	public void getFinancialDetails() {
		logger.info("Starting of getFinancialDetails method");

		this.ecifinancialdetails.getFinancialDetails();

		logger.info("Starting of getFinancialDetails method");

	}

	@Test(priority = 2, dataProvider = "get_ECI_Financial_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setFinancialDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setFinancialDetails")

	public void setFinancialDetails(String ifscCode, String accountNumber, String accountName) {
		logger.info("Starting of setFinancialDetails method");

		this.ecifinancialdetails.setFinancialDetails(ifscCode, accountNumber, accountName);

		logger.info("Starting of setFinancialDetails method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		ECI_FINANCIAL_DETAILS_DRIVER.close();
		ECI_FINANCIAL_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
