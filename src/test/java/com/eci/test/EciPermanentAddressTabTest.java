package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciPermanentAddressTabPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciPermanentAddressTabTest extends BaseFinvervTest {

	WebDriver ECI_PERMANENT_DETAILS_DRIVER = null;
	private EciPermanentAddressTabPage permanentaddresspage = null;

	private static final Logger logger = Logger.getLogger(EciPermanentAddressTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.ECI_PERMANENT_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.ECI_PERMANENT_DETAILS_DRIVER);
		ECI_PERMANENT_DETAILS_DRIVER.get(siteURL);
		this.permanentaddresspage = new EciPermanentAddressTabPage(ECI_PERMANENT_DETAILS_DRIVER);
		this.EciloginFeature(ECI_PERMANENT_DETAILS_DRIVER, mobileNumber);

		logger.info("Ending of GoToSiteUrl method");

	}

	@Test(priority = 1, groups = { "Regression" })
	@Description("Test Description:Verify setPermanentAddressDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setPermanentAddressDetails")

	public void getPermanentAddressDetailsInEci() {
		logger.info("Starting of getPermanentAddressDetailsInEci method");

		this.permanentaddresspage.getPermanentAddressDetails();

		logger.info("Ending of getPermanentAddressDetailsInEci method");

	}

	@Test(priority = 2, dataProvider = "get_ECI_Permanent_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setPermanentAddressDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setPermanentAddressDetails")

	public void setPermanentAddressDetailsInEci(String addressLine1, String pincode, String residingYear) {
		logger.info("Starting of setPermanentAddressDetailsInEci method");

		this.permanentaddresspage.setPermanentAddressDetails(addressLine1, pincode, residingYear);

		logger.info("Ending of setPermanentAddressDetailsInEci method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		ECI_PERMANENT_DETAILS_DRIVER.close();
		ECI_PERMANENT_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}
}
