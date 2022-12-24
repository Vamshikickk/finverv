package com.infin.leadbox;

import static FinvervApplication.utils.Constants.GST_DETAILS_LBL_TEXT;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class GstDetailsTest extends BaseFinvervTest {

	WebDriver GST_DETAILS_DRIVER = null;

	private static final Logger logger = Logger.getLogger(GstDetailsTest.class.getName());
	private GstDetailsPage gstDetailspage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		GST_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.GST_DETAILS_DRIVER);
		this.goToSite(siteURL, GST_DETAILS_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, GST_DETAILS_DRIVER);
		createApplicationWithValidData(GST_DETAILS_DRIVER, pinCode);
		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_GST_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidGstDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidGstDetails")
	public void setValidGstDetails(String gstNumber, String gstTurnover) {

		logger.info("Starting of setValidGstDetails method");

		this.gstDetailspage = new GstDetailsPage(GST_DETAILS_DRIVER);
		this.gstDetailspage.clickOnGstDetailstab();
		gstDetailspage.setGstDetails(gstNumber, gstTurnover);
		
		logger.info("Ending of setValidGstDetails method");

	}

	@Test(priority = 2, dataProvider = "get_Valid_Pull_GST_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidPullGstData")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPullGstData")
	public void setValidPullGstData(String startGstDate, String endGstDate) {

		logger.info("Starting of setValidPullGstData method");

		this.gstDetailspage.setGstDetails(startGstDate, endGstDate);

		logger.info("Ending of setValidPullGstData method");

	}

	@Test(priority = 3, dataProvider = "get_GST_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setGstDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setGstDetailsInInfin")
	public void setGstDetails(String gstNumber, String gstTurnover) {

		logger.info("Starting of setGstDetails method");

		this.gstDetailspage = new GstDetailsPage(GST_DETAILS_DRIVER);
		this.gstDetailspage.clickOnGstDetailstab();

		// Passing the Assertions for LblGstText
		String lblgsttext = this.gstDetailspage.getLblGstaDetailsTxt();
		Assert.assertEquals(lblgsttext, expectedAssertionsProp.getProperty(GST_DETAILS_LBL_TEXT));
		System.out.println("lbl Text Is :" + lblgsttext);

		gstDetailspage.setGstDetails(gstNumber, gstTurnover);

		try {
			// Passing the Assertions for GSt Number Validation
			String invalidgstnumber = this.gstDetailspage.getLblinvalidGstNumberTxt();
			Assert.assertEquals(invalidgstnumber, expectedAssertionsProp.getProperty("invalidgstnumbervalidationtext"));
			System.out.println("Invalid Gst Number :" + invalidgstnumber);

			// Passing the Assertions for GSt TurnOver Validation
			String invalidgstturnover = this.gstDetailspage.getLblinvalidGstTurnoverTxt();
			Assert.assertEquals(invalidgstturnover,
					expectedAssertionsProp.getProperty("invalidgstturnovervalidationtext"));
			System.out.println("Invalid Turn OverGst :" + invalidgstturnover);
		} catch (Exception e) {

		} finally {
			this.gstDetailspage.clickOutside();
		}
		logger.info("Ending of setGstDetails method");
	}

	@Test(priority = 4, dataProvider = "get_Pull_GST_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setPullGstData")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPullGstData")

	public void setPullGstData(String startGstDate, String endGstDate) {

		logger.info("Starting of setPullGstData method");

		this.gstDetailspage.setGstDetails(startGstDate, endGstDate);

		logger.info("Ending of setPullGstData method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		GST_DETAILS_DRIVER.close();
		GST_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
