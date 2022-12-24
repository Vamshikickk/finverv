package com.infin.leadbox;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class PersonalDetailsTest extends ReadingExcelData {

	WebDriver PERSONAL_DETAILS_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private PersonalDetailsTabPage personaldetailstabpage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "validuserName", "validPassword", "pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String validuserName, String validPassword,
			String pinCode, String mobileNumebr) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		PERSONAL_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.PERSONAL_DETAILS_DRIVER);
		this.goToSite(siteURL, PERSONAL_DETAILS_DRIVER);

		personaldetailstabpage = new PersonalDetailsTabPage(PERSONAL_DETAILS_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, PERSONAL_DETAILS_DRIVER);
		//createApplicationWithValidData(PERSONAL_DETAILS_DRIVER, pinCode);
		//searchApplication(mobileNumebr);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_valid_personal_details_data", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidPersonalDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPersonalDetails")

	public void setValidPersonalDetails(String firstName, String middleName, String lastName, String email,
			String alternateMobile, String dateOfBirth, String fathersName, String mothersName, String spouseName,
			String NoOfDependent, String nationality, String grossAnnualIncome, String panNumber, String aadharNumber) throws IOException {

		logger.info("Starting of setValidPersonalDetails method");
		
		personaldetailstabpage.setPersonalDetails(firstName, middleName, lastName, email, alternateMobile, dateOfBirth,
				fathersName, mothersName, spouseName, NoOfDependent, nationality, grossAnnualIncome, panNumber,
				aadharNumber);

		System.out.println(firstName);
		
		logger.info("Ending of setValidPersonalDetails method");

	}

	@Test(priority = 2, dataProvider = "get_Valid_permanent_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidPermanentAddress")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPermanentAddress")

	public void setValidPermanentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) throws IOException {
		logger.info("Starting of setValidPermanentAddress method");

		personaldetailstabpage.setPermanentAddress(addressLine1, addressLine2, pinCode, residingSince, ownerName,
				relationOwner);

		logger.info("Starting of setValidPermanentAddress method");

	}

	@Test(priority = 3, dataProvider = "get_Valid_Resident_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidResidentAddress")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidPermanentAddress")

	public void setValidResidentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) {
		logger.info("Starting of setValidResidentAddress method");

		this.personaldetailstabpage.setResidentAddress(addressLine1, addressLine2, pinCode, residingSince, ownerName,
				relationOwner);

		logger.info("Starting of setValidResidentAddress method");
	}

	@Test(priority = 4, dataProvider = "get_Valid_Bank_Account_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidBankAccount")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidBankAccount")
	public void setValidBankAccount(String ifsc, String accountNumber, String accountName) {
		logger.info("Starting of setValidBankAccount method");

		personaldetailstabpage.setBankAccount(ifsc, accountNumber, accountName);

		logger.info("Ending of setValidBankAccount method");
	}

	@Test(priority = 5, dataProvider = "get_personal_details_data", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify enterDetails")
	@Severity(SeverityLevel.CRITICAL)

	@Story("Verify enterDetails")
	public void setPersonalDetailsInInfin(String firstName, String middleName, String lastName, String email,
			String alternateMobile, String dateOfBirth, String fathersName, String mothersName, String spouseName,
			String NoOfDependent, String nationality, String grossAnnualIncome, String panNumber, String aadharNumber) {
		logger.info("Starting of setPersonalDetailsInInfin method");

		// passing the Assertions for LblText for personal Details Tab text

		String personaltext = personaldetailstabpage.getLblPerosalDetailsTxt();
		Assert.assertEquals(personaltext, expectedAssertionsProp.getProperty("personaldetailstext"));
		System.out.println("lbl Text is :" + personaltext);

		personaldetailstabpage.setPersonalDetails(firstName, middleName, lastName, email, alternateMobile, dateOfBirth,
				fathersName, mothersName, spouseName, NoOfDependent, nationality, grossAnnualIncome, panNumber,
				aadharNumber);

		try {
			// passing the Assertions for Email field validation
			String invalidEmailtext = this.personaldetailstabpage.getInvalidEmailValidationTxt();
			Assert.assertEquals(invalidEmailtext, expectedAssertionsProp.getProperty("invalidemailvalidationtext"));
			System.out.println("Invalid Email Validation Message :" + invalidEmailtext);

			// passing the Assertions for Pan field validation

			String invalidpantext = this.personaldetailstabpage.getInvalidPanValidationTxt();
			Assert.assertEquals(invalidpantext, expectedAssertionsProp.getProperty("invalidpantext"));
			System.out.println("Invalid Pan Validation Text :" + invalidpantext);

		} catch (Exception e) {

		} finally {
			this.personaldetailstabpage.clickOutside();
		}

		logger.info("Ending of setPersonalDetailsInInfin method");
	}

	@Test(priority = 6)
	@Description("Test Description:Verify browsefile")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify browsefile")
	public void personalDetailsBrowsefile() {
		logger.info("Starting of personalDetailsBrowsefile method");

		personaldetailstabpage.uploadDocument();
		personaldetailstabpage.clickOnbrowseChooseFile(testDataprop.getProperty("uploadDoucment"));
		personaldetailstabpage.uploadButton();

		logger.info("Starting of personalDetailsBrowsefile method");

	}

	@Test(priority = 7, dataProvider = "get_permanent_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify enterPermanentAddressDetails")
	@Severity(SeverityLevel.MINOR)
	@Story("Verify enterPermanentAddressDetails")
	public void setPermanentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) {
		logger.info("Starting of setPermanentAddress method");

		// passing the Assertions for permanent label Text
		String permanentdetailstext = personaldetailstabpage.getLblPermanentAddressText();
		Assert.assertEquals(permanentdetailstext, expectedAssertionsProp.getProperty("permanentAddresstext"));
		System.out.println("lbl Text is :" + permanentdetailstext);

		personaldetailstabpage.setPermanentAddress(addressLine1, addressLine2, pinCode, residingSince, ownerName,
				relationOwner);

		// Passing the Assertions to Pincode field in Permanent Address

		try {
			String invalidpermanentPicodetext = this.personaldetailstabpage.getInvalidPincodeValidationtxt();
			Assert.assertEquals(invalidpermanentPicodetext, expectedAssertionsProp.getProperty("invalidpincodetext"));
			System.out.println("Invalid Pincode Text is :" + invalidpermanentPicodetext);
		} catch (Exception e) {

		} finally {
			this.personaldetailstabpage.clickOutside();
		}

		/*
		 * this.personaldetailstabpage.permanentDetailsUploadDocument();
		 * this.personaldetailstabpage.clickOnPermanentAddressChoosefile(
		 * UPLOADING_DOCUMENT);
		 * this.personaldetailstabpage.clickOnPermanentUploadButton();
		 * this.personaldetailstabpage.clickOutside();
		 */

		logger.info("Starting of setPermanentAddress method");

	}

	@Test(priority = 8, dataProvider = "get_Resident_Address_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify enterResidentAddressDetails")
	@Severity(SeverityLevel.MINOR)
	@Story("Verify enterResidentAddressDetails")
	public void setResidentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) {
		logger.info("Starting of setResidentAddress method");

		// passing the Assertions for label Text
		String residnetdetailstext = personaldetailstabpage.getLblResidentAddresstxt();
		Assert.assertEquals(residnetdetailstext, expectedAssertionsProp.getProperty("residentAddresstext"));
		System.out.println("Lbl Text :" + residnetdetailstext);

		this.personaldetailstabpage.setResidentAddress(addressLine1, addressLine2, pinCode, residingSince, ownerName,
				relationOwner);

		// passing the Assertions for PinCode field in Resident Address
		try {
			String invalidResidentPicodetext = this.personaldetailstabpage.getInvalidResidentPincodeValidationTxt();
			Assert.assertEquals(invalidResidentPicodetext, expectedAssertionsProp.getProperty("invalidpincodetext"));
			System.out.println("Invalid Pincode Text is :" + invalidResidentPicodetext);
		} catch (Exception e) {

		} finally {
			this.personaldetailstabpage.clickOutside();

		}
		/*
		 * this.personaldetailstabpage.residentAdddressUploadButton();
		 * this.personaldetailstabpage.clickOnResidentChooseFiles(testDataprop.
		 * getProperty(UPLOADING_DOCUMENT));
		 * this.personaldetailstabpage.clickOnResidentDetailsUploadButton();
		 * this.personaldetailstabpage.clickOutside();
		 */
		logger.info("Ending of setResidentAddress method");

	}

	@Test(priority = 9, dataProvider = "get_Bank_Account_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify enterBankAccountDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify enterBankAccountDetails")
	public void setBankAccount(String ifsc, String accountNumber, String accountName) {
		logger.info("Starting of setBankAccount method");

		// passing the Assertions for LblText

		String getBanksaddresstext = personaldetailstabpage.getLblBankAccounttxt();
		Assert.assertEquals(getBanksaddresstext, expectedAssertionsProp.getProperty("bankaccount"));
		System.out.println("lbl Text is :" + getBanksaddresstext);

		personaldetailstabpage.setBankAccount(ifsc, accountNumber, accountName);

		// passing the Assertions for IfscCode field in Resident Address

		try {
			String getInvalidifscText = personaldetailstabpage.getInvalidifsclbltxt();
			Assert.assertEquals(getInvalidifscText, expectedAssertionsProp.getProperty("invalidifsctext"));
			System.out.println(getInvalidifscText);
		} catch (Exception e) {

		} finally {
			this.personaldetailstabpage.clickOutside();
		}

		logger.info("Ending of setBankAccount method");

	}

	@Test(priority = 10)
	@Description("Test Description:Verify browseBankFiles")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify browseBankFiles")

	public void browseBankFiles() {
		logger.info("Starting of browseBankFiles method ");

		personaldetailstabpage.clickonBankDocumentIcon();
		personaldetailstabpage.clickOnbrowseChooseFile2(testDataprop.getProperty("uploadDocument"));
		personaldetailstabpage.clickOnUploadBankDocumentsButton();

		logger.info("Ending of browseBankFiles method");
	}

	public void loginWithInvalidCred(String invalidUserName, String invalidPassword, String validuserName,
			String validPassword, WebDriver driver) {
		logger.info("Starting of loginWithInvalidCred method");

		this.loginFeature(validuserName, invalidPassword, PERSONAL_DETAILS_DRIVER);

		logger.info("Ending of loginWithInvalidCred method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		PERSONAL_DETAILS_DRIVER.close();
		PERSONAL_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}