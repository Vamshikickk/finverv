package com.eci.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eci.finverv.EciPersonalDetailsTabPage;
import com.finverv.Base.BaseFinvervTest;
import com.infin.leadbox.ReadingExcelData;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EciPersonalDetailsTabTest extends BaseFinvervTest {

	WebDriver ECIPERSONAL_DETAILS_DRIVER = null;
	private EciPersonalDetailsTabPage ecipersonaldetailstabpage = null;

	private static final Logger logger = Logger.getLogger(EciPersonalDetailsTabTest.class.getName());

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser", "siteURL", "mobileNumber" })
	public void GoToSiteUrl(String browser, String siteURL, String mobileNumber) {
		logger.info("Starting of GoToSiteUrl method");

		this.ECIPERSONAL_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.ECIPERSONAL_DETAILS_DRIVER);
		ECIPERSONAL_DETAILS_DRIVER.get(siteURL);
		this.ecipersonaldetailstabpage = new EciPersonalDetailsTabPage(ECIPERSONAL_DETAILS_DRIVER);
		this.EciloginFeature(ECIPERSONAL_DETAILS_DRIVER, mobileNumber);

		logger.info("Ending of GoToSiteUrl method");
	}

	@Test(priority = 1, groups = { "Regression" })
	@Description("Test Description:Verify setEciPersonalDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidEciPersonalDetails")
	public void getValidEciPersonalDetails() throws Exception {

		logger.info("Starting of getValidEciPersonalDetails method");

		this.ecipersonaldetailstabpage.getPersonalDetails();

		logger.info("Ending of of getValidEciPersonalDetails method");
	}

	@Test(priority = 2, dataProvider = "get_ECI_Personal_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setEciPersonalDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidEciPersonalDetails")
	public void setEciPersonalDetails(String firstName, String lastName, String email, String dateOfBirth,
			String fatherName, String panNumber, String aadharNumber) throws Exception {

		logger.info("Starting of setEciPersonalDetails method");

		this.ecipersonaldetailstabpage.setEciPersonalDetails(firstName, lastName, email, dateOfBirth, fatherName,
				panNumber, aadharNumber);

		logger.info("Ending of of setEciPersonalDetails method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		ECIPERSONAL_DETAILS_DRIVER.close();
		ECIPERSONAL_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
