package com.infin.leadbox;

import static FinvervApplication.utils.Constants.CO_BORROWER_EMAIL_VALIDATION;
import static FinvervApplication.utils.Constants.CO_BORROWER_PAN_VALIDATION;
import static FinvervApplication.utils.Constants.CO_BORROWER_TEXT;
import static FinvervApplication.utils.Constants.INVALID_PINCODE_TEXT;
import static FinvervApplication.utils.Constants.UPLOAD_BANK_DOCUMENTS;

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

public class CoBorrowerTest extends BaseFinvervTest {

	WebDriver CO_BORROWER_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private CoBorrowerTabPage coborrowertabpage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		CO_BORROWER_DRIVER = this.getWebDriver(browser, WEB_DRIVER.CO_BORROWER_DRIVER);
		this.goToSite(siteURL, CO_BORROWER_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, CO_BORROWER_DRIVER);
		createApplicationWithValidData(CO_BORROWER_DRIVER, pinCode);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Co_Borrowers_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidCoBorrowerDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setValidCoBorrowerDetails")
	public void setValidCoBorrowerDetails(String coborrowerFirstName, String coborrowerMiddleName,
			String coborrowerLastName, String coborrowerEmail, String coborrowerMobileNumber,
			String coborrowerAltMobileNumber, String coborrowerDateOfBirth, String coborrowerFatherName,
			String coborrowerMotherName, String coborrowerSpouseName, String coborrowerNoOfDependent,
			String coborrowerNationality, String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {

		logger.info("Starting of setValidCoBorrowerDetails method");

		coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setCoBorrowerDetails(coborrowerFirstName, coborrowerMiddleName, coborrowerLastName,
				coborrowerEmail, coborrowerMobileNumber, coborrowerAltMobileNumber, coborrowerDateOfBirth,
				coborrowerFatherName, coborrowerMotherName, coborrowerSpouseName, coborrowerNoOfDependent,
				coborrowerNationality, coborrowerGrass, coborrowerPan, coborrowerAadhar);

		logger.info("Ending of setValidCoBorrowerAddressDetails method");

	}

	@Test(priority = 2, dataProvider = "get_Valid_Co_Borrowers_Address", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidCoBorrowerAddressDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setValidCoBorrowerAddressDetails")
	public void setValidCoBorrowerAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residngYear, String ownerName, String relationshipOwner) {
		logger.info("Starting of setValidCoBorrowerAddressDetails method");

		this.coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setCoBorrowerAddressDetails(addressLine1, addressLine2, pincode, residngYear, ownerName,
				relationshipOwner);

		logger.info("Ending of setValidCoBorrowerAddressDetails method");

	}

	@Test(priority = 3, dataProvider = "get_Valid_Edit_Co_Borrowers_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidEditCoBorrowerEditDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setValidEditCoBorrowerEditDetails")
	public void setValidEditCoBorrowerEditDetails(String coborrowerFirstName, String coborrowerMiddleName,
			String coborrowerLastName, String coborrowerEmail, String coborrowerMobileNumber,
			String coborrowerAltMobileNumber, String coborrowerDateOfBirth, String coborrowerFatherName,
			String coborrowerMotherName, String coborrowerSpouseName, String coborrowerNoOfDependent,
			String coborrowerNationality, String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {

		logger.info("Starting of setValidEditCoBorrowerEditDetails method");

		this.coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setCoBorrowerDetails(coborrowerFirstName, coborrowerMiddleName, coborrowerLastName,
				coborrowerEmail, coborrowerMobileNumber, coborrowerAltMobileNumber, coborrowerDateOfBirth,
				coborrowerFatherName, coborrowerMotherName, coborrowerSpouseName, coborrowerNoOfDependent,
				coborrowerNationality, coborrowerGrass, coborrowerPan, coborrowerAadhar);

		logger.info("Ending of setValidEditCoBorrowerEditDetails method");
	}

	@Test(priority = 4, dataProvider = "get_Co_Borrowers_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidCoBorrowerDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setCoBorrowerDetails")
	public void setCoBorrowerDetails(String coborrowerFirstName, String coborrowerMiddleName, String coborrowerLastName,
			String coborrowerEmail, String coborrowerMobileNumber, String coborrowerAltMobileNumber,
			String coborrowerDateOfBirth, String coborrowerFatherName, String coborrowerMotherName,
			String coborrowerSpouseName, String coborrowerNoOfDependent, String coborrowerNationality,
			String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {

		logger.info("Starting of setCoBorrowerDetails method");

		coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);

		// Passing the Assertion for Co_Borrower Tab text
		String coborrowertext = this.coborrowertabpage.getCoBorrowerText();
		Assert.assertEquals(coborrowertext, expectedAssertionsProp.getProperty(CO_BORROWER_TEXT));
		System.out.println("tab text is :" + coborrowertext);

		this.coborrowertabpage.setCoBorrowerDetails(coborrowerFirstName, coborrowerMiddleName, coborrowerLastName,
				coborrowerEmail, coborrowerMobileNumber, coborrowerAltMobileNumber, coborrowerDateOfBirth,
				coborrowerFatherName, coborrowerMotherName, coborrowerSpouseName, coborrowerNoOfDependent,
				coborrowerNationality, coborrowerGrass, coborrowerPan, coborrowerAadhar);

		// Passing the Assertion for Email validation text
		try {
			String coborrowerinvalidemailtext = this.coborrowertabpage.getInvalidEmailText();
			Assert.assertEquals(coborrowerinvalidemailtext,
					expectedAssertionsProp.getProperty(CO_BORROWER_EMAIL_VALIDATION));
			System.out.println("Invalid Email Text is :" + coborrowerinvalidemailtext);

			// Passing the Assertion for Pan validation text
			String coborrowerinvalidpantext = this.coborrowertabpage.getInvalidPanNumberText();
			Assert.assertEquals(coborrowerinvalidpantext,
					expectedAssertionsProp.getProperty(CO_BORROWER_PAN_VALIDATION));
			System.out.println("Invalid Pan Text is :" + coborrowerinvalidpantext);
		} catch (Exception e) {

		} finally {
			this.coborrowertabpage.clickOutside();
		}
		logger.info("Ending of setCoBorrowerDetails method");
	}

	@Test(priority = 5, dataProvider = "get_Co_Borrowers_Address", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setCoBorrowerAddressDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setCoBorrowerAddressDetails")
	public void setCoBorrowerAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residngYear, String ownerName, String relationshipOwner) {
		logger.info("Starting of setValidCoBorrowerAddressDetails method");

		this.coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setCoBorrowerAddressDetails(addressLine1, addressLine2, pincode, residngYear, ownerName,
				relationshipOwner);

		// Passing the Assertion for Invalid PinCode validation text
		try {
			String coborrowerAddresspincodetext = this.coborrowertabpage.getInvalidPincodeText();
			Assert.assertEquals(coborrowerAddresspincodetext, expectedAssertionsProp.getProperty(INVALID_PINCODE_TEXT));
			System.out.println("Invalid Pincode Text is :" + coborrowerAddresspincodetext);
		} catch (Exception e) {

		} finally {

			this.coborrowertabpage.clickOutside();
		}

		logger.info("Ending of setValidCoBorrowerAddressDetails method");
	}

	@Test(priority = 6)
	@Description("Test Description:Verify setCoBorrowerDocumentDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setCoBorrowerDocumentDetails")
	public void setCoBorrowerDocumentDetails() {
		logger.info("Starting of setCoBorrowerDocumentDetails in finverv");

		this.coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setDocumentDetails(testDataprop.getProperty(UPLOAD_BANK_DOCUMENTS));

		logger.info("Ending of setCoBorrowerDocumentDetails in finverv");
	}

	@Test(priority = 7, dataProvider = "get_Edit_Co_Borrowers_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setCoBorrowerEditDetails")
	@Severity(SeverityLevel.NORMAL)
	@Story("Verify setCoBorrowerEditDetails")
	public void setEditCoBorrowerEditDetails(String coborrowerFirstName, String coborrowerMiddleName,
			String coborrowerLastName, String coborrowerEmail, String coborrowerMobileNumber,
			String coborrowerAltMobileNumber, String coborrowerDateOfBirth, String coborrowerFatherName,
			String coborrowerMotherName, String coborrowerSpouseName, String coborrowerNoOfDependent,
			String coborrowerNationality, String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {

		logger.info("Starting of setCoBorrowerEditDetails method");

		this.coborrowertabpage = new CoBorrowerTabPage(CO_BORROWER_DRIVER);
		this.coborrowertabpage.setCoBorrowerDetails(coborrowerFirstName, coborrowerMiddleName, coborrowerLastName,
				coborrowerEmail, coborrowerMobileNumber, coborrowerAltMobileNumber, coborrowerDateOfBirth,
				coborrowerFatherName, coborrowerMotherName, coborrowerSpouseName, coborrowerNoOfDependent,
				coborrowerNationality, coborrowerGrass, coborrowerPan, coborrowerAadhar);

		logger.info("Ending of setCoBorrowerEditDetails method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		CO_BORROWER_DRIVER.close();
		CO_BORROWER_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
