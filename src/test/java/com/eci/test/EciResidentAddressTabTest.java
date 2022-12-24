package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciResidentAddressTabPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciResidentAddressTabTest extends BaseFinvervTest {

	WebDriver ECI_RESIDENT_ADDRESS_DRIVER = null;
	private EciResidentAddressTabPage eciresidentaddresspage = null;

	private static final Logger logger = Logger.getLogger(EciResidentAddressTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.ECI_RESIDENT_ADDRESS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.ECI_RESIDENT_ADDRESS_DRIVER);
		ECI_RESIDENT_ADDRESS_DRIVER.get(siteURL);
		this.EciloginFeature(ECI_RESIDENT_ADDRESS_DRIVER, mobileNumber);
		eciresidentaddresspage = new EciResidentAddressTabPage(ECI_RESIDENT_ADDRESS_DRIVER);

		logger.info("Ending of GoToSiteUrl method");

	}

	@Test(priority = 1, groups = { "Regression" })
	@Description("Test Description:Verify getResidentAddressdetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify getResidentAddressdetails")

	public void getResidentAddressdetails() {
		logger.info("Starting of getResidentAddressdetails method");

		this.eciresidentaddresspage.getResidentDetails();

		logger.info("Ending of getResidentAddressdetails method");

	}

	@Test(priority = 2, dataProvider = "get_ECI_Resident_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setResidentAddressTab")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setResidentAddressTab")

	public void setResidentDetailsInEci(String addressLine1, String pincode, String residingYear) {
		logger.info("Starting of setResidentDetailsInEci method");

		this.eciresidentaddresspage.setResidentDetails(addressLine1, pincode, residingYear);

		logger.info("Ending of setResidentDetailsInEci method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		ECI_RESIDENT_ADDRESS_DRIVER.close();
		ECI_RESIDENT_ADDRESS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
