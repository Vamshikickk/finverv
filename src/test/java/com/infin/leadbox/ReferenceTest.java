package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

public class ReferenceTest extends BaseFinvervTest {

	WebDriver REFERENCE_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private ReferencePage referencepage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		REFERENCE_DRIVER = this.getWebDriver(browser, WEB_DRIVER.REFERENCE_DRIVER);
		this.goToSite(siteURL, REFERENCE_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, REFERENCE_DRIVER);
		createApplicationWithValidData(REFERENCE_DRIVER, pinCode);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Ref_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setReferenceDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setReferenceDetailsInInfin")
	public void setValidReferenceDetailsInInfin(String referenceName, String referenceMobile, String businessName) {
		logger.info("Starting of setValidReferenceDetailsInInfin in finverv");

		this.referencepage = new ReferencePage(REFERENCE_DRIVER);
		this.referencepage.setReferenceDetails(referenceName, referenceMobile, businessName);

		logger.info("Ending of setValidReferenceDetailsInInfin in finverv");
	}

	@Test(priority = 2, dataProvider = "get_Valid_Ref_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setReferenceAddressDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidRefAddressDetails")
	public void setValidReferenceAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residingYear, String ownerName, String relation) {
		logger.info("starting of setValidReferenceAddressDetails method");

		this.referencepage.setReferenceAddressDetails(addressLine1, addressLine2, pincode, residingYear, ownerName,
				relation);

		logger.info("Ending of setValidReferenceAddressDetails method");

	}

	@Test(priority = 3, dataProvider = "get_Valid_Ref_Edit_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidReferenceEditBusinessDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidReferenceEditBusinessDetails")
	public void setValidReferenceEditBusinessDetails(String referenceName, String referenceMobile,
			String businessName) {
		logger.info("Starting of setValidReferenceEditBusinessDetails method");

		this.referencepage.setReferenceEditDetails(referenceName, referenceMobile, businessName);

		logger.info("Ending of setValidReferenceEditBusinessDetails method");

	}

	@Test(priority = 1, dataProvider = "get_Ref_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setReferenceDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setReferenceDetailsInInfin")
	public void setReferenceDetailsInInfin(String referenceName, String referenceMobile, String businessName) {
		logger.info("Starting of setReferenceDetailsInInfin in finverv");

		this.referencepage = new ReferencePage(REFERENCE_DRIVER);

		// passing the Assertions for label Text
		String referencelabletext = this.referencepage.getRefernceTabText();
		Assert.assertEquals(referencelabletext, expectedAssertionsProp.getProperty("referencetablbltext"));
		System.out.println("Lbl Text is :" + referencelabletext);

		this.referencepage.setReferenceDetails(referenceName, referenceMobile, businessName);

		try {
			// passing the Assertions for InvalidMobileTxt
			String invalidremobiletext = this.referencepage.getInvalidMobileTxt();
			Assert.assertEquals(invalidremobiletext, expectedAssertionsProp.getProperty("invalidrefmobile"));
			System.out.println("Invalid Mobile No Text is :" + invalidremobiletext);
		} catch (Exception e) {

		} finally {
			this.referencepage.clickOutside();
		}

		logger.info("Ending of setReferenceDetailsInInfin in finverv");

	}

	@Test(priority = 2, dataProvider = "get_Ref_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setReferenceAddressDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setRefAddressDetails")
	public void setReferenceAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residingYear, String ownerName, String relation) {
		logger.info("starting of setReferenceAddressDetails method");

		this.referencepage.setReferenceAddressDetails(addressLine1, addressLine2, pincode, residingYear, ownerName,
				relation);

		try {
			String invalidpincodetext = this.referencepage.getInvalidPincodeTxt();
			Assert.assertEquals(invalidpincodetext, expectedAssertionsProp.getProperty("invalidpincodetext"));
			System.out.println("Inavlid Pincode Validation Text " + invalidpincodetext);
		} catch (Exception e) {

		} finally {
			this.referencepage.clickOutside();
		}

		logger.info("Ending of setReferenceAddressDetails method");

	}

	@Test(priority = 3, dataProvider = "get_Ref_Edit_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setReferenceEditDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setReferenceEditDetails")
	public void setReferenceEditBusinessDetails(String referenceName, String referenceMobile, String businessName) {
		logger.info("Starting of setReferenceEditBusinessDetails method");

		this.referencepage.setReferenceEditDetails(referenceName, referenceMobile, businessName);

		logger.info("Ending of setReferenceEditBusinessDetails method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		REFERENCE_DRIVER.close();
		REFERENCE_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
