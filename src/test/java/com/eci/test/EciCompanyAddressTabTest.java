package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciCompanyAddressTabPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciCompanyAddressTabTest extends BaseFinvervTest {

	WebDriver ECI_COMPANY_ADDRESS_DRIVER = null;
	private EciCompanyAddressTabPage ecicompanyaddresspage = null;

	private static final Logger logger = Logger.getLogger(EciResidentAddressTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.ECI_COMPANY_ADDRESS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.ECI_COMPANY_ADDRESS_DRIVER);
		ECI_COMPANY_ADDRESS_DRIVER.get(siteURL);
		this.EciloginFeature(ECI_COMPANY_ADDRESS_DRIVER, mobileNumber);
		this.ecicompanyaddresspage = new EciCompanyAddressTabPage(ECI_COMPANY_ADDRESS_DRIVER);

		logger.info("Ending of GoToSiteUrl method");

	}

	@Test(priority = 1, groups = { "Regression" })
	@Description("Test Description:Verify getCompanyDetailsInEci")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify getCompanyDetailsInEci")

	public void getCompanyDetailsInEci() {
		logger.info("Starting of getCompanyDetailsInEci method");

		this.ecicompanyaddresspage.getCompanyDetails();

		logger.info("Ending of getCompanyDetailsInEci method");
	}

	@Test(priority = 2, dataProvider = "get_ECI_Company_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify enterPermanentAddressDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify enterPermanentAddressDetails")

	public void setCompanyDetailsInEci(String addressLine1, String pincode, String operatingSince) {
		logger.info("Starting of setCompanyDetailsInEci method");

		this.ecicompanyaddresspage.setCompanyDetails(addressLine1, pincode, operatingSince);

		logger.info("Ending of setCompanyDetailsInEci method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		ECI_COMPANY_ADDRESS_DRIVER.close();
		ECI_COMPANY_ADDRESS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
