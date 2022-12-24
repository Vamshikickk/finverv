package com.infin.leadbox;

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

public class BusinessDetailsTest extends BaseFinvervTest {

	WebDriver BUSINESS_DETAILS_DRIVER = null;

	private static final Logger logger = Logger.getLogger(BusinessDetailsTest.class.getName());

	private static final String mobileNumber = null;
	private BusinessDetailsTabPage businessdetailspage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "validuserName", "validPassword", "pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String validuserName, String validPassword,
			String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		BUSINESS_DETAILS_DRIVER = this.getWebDriver(browser, WEB_DRIVER.PERSONAL_DETAILS_DRIVER);
		this.goToSite(siteURL, BUSINESS_DETAILS_DRIVER);

		businessdetailspage = new BusinessDetailsTabPage(BUSINESS_DETAILS_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, BUSINESS_DETAILS_DRIVER);
		createApplicationWithValidData(BUSINESS_DETAILS_DRIVER, pinCode);
		searchApplication(mobileNumber);

		logger.info("Ending of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setBusinessDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setBusinessDetailsInInfin")
	public void setValidBusinessDetails(String businessName, String dateOfIncorpoRation, String product, String email,
			String noOfEmployees, String nameOfContactPerson, String landLineNumber, String mobileNumber,
			String panNumber, String proofDocNumber) {
		logger.info("Starting of setBusinessDetails method");

		this.businessdetailspage = new BusinessDetailsTabPage(BUSINESS_DETAILS_DRIVER);
		this.businessdetailspage.clickonBusinessDetailsButton();

		businessdetailspage.setBusinessDetails(businessName, dateOfIncorpoRation, product, email, noOfEmployees,
				nameOfContactPerson, landLineNumber, mobileNumber, panNumber, proofDocNumber);

	}

	@Test(priority = 2, dataProvider = "get_Business_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setBusinessDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setBusinessDetailsInInfin")
	public void setBusinessDetails(String businessName, String dateOfIncorpoRation, String product, String email,
			String noOfEmployees, String nameOfContactPerson, String landLineNumber, String mobileNumber,
			String panNumber, String proofDocNumber) {
		logger.info("Starting of setBusinessDetails method");

		this.businessdetailspage = new BusinessDetailsTabPage(BUSINESS_DETAILS_DRIVER);
		this.businessdetailspage.clickonBusinessDetailsButton();

		// passing Assertions for LblText
		String getBusinessDetailsText = this.businessdetailspage.getLblBusinessDetailsTxt();
		Assert.assertEquals(getBusinessDetailsText, expectedAssertionsProp.getProperty("businessdetailstext"));
		System.out.println("Lbl Text is :" + getBusinessDetailsText);

		businessdetailspage.setBusinessDetails(businessName, dateOfIncorpoRation, product, email, noOfEmployees,
				nameOfContactPerson, landLineNumber, mobileNumber, panNumber, proofDocNumber);

		try {
			// passing Assertions for Email Field
			String invalidBusinessemailtxt = this.businessdetailspage.getinvalidEmailValidationTxt();
			Assert.assertEquals(invalidBusinessemailtxt,
					expectedAssertionsProp.getProperty("businessdetailsvalidationemailtext"));
			System.out.println("Invalid Email text is :" + invalidBusinessemailtxt);

			// passing Assertions for MobileNo Field
			this.businessdetailspage.clickOnAddBusinessDetailsButton();
			String businessmobilevalidationtxt = this.businessdetailspage.getInvalidMobileValidationTxt();
			Assert.assertEquals(businessmobilevalidationtxt,
					expectedAssertionsProp.getProperty("invalidbusinessmobilenotext"));
			System.out.println("Invalid mobile text :" + businessmobilevalidationtxt);

			// passing Assertions for Pan Field
			this.businessdetailspage.clickOnAddBusinessDetailsButton();
			String getinvalidpantext = this.businessdetailspage.getInvalidPanTxt();
			Assert.assertEquals(getinvalidpantext, expectedAssertionsProp.getProperty("invalidpantext"));
			System.out.println("Invalid pan text : " + getinvalidpantext);
		} catch (Exception e) {

		} finally {

			this.businessdetailspage.clickOutside();
		}

		/*
		 * this.businessdetailstabpage.clickOnBusinessetailsDocumentIcon();
		 * this.businessdetailstabpage.clickOnBusinessDetailsSelectLbl();
		 * this.businessdetailstabpage.clickOnbBusinessDetailsChooseFile(testDataprop.
		 * getProperty(UPLOAD_BANK_DOCUMENTS));
		 * this.businessdetailstabpage.clickOnBusinessDetailsUploadButton();
		 * this.businessdetailstabpage.clickOutside();
		 */

		logger.info("Ending of setBusinessDetails method");

	}

	@Test(priority = 3, dataProvider = "get_Valid_company_Address", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setCompanyAddressInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setCompanyAddressInInfin")
	public void setValidCompanyAddress(String addressline1, String addressline2, String companyCode,
			String residingSince, String ownerName, String relationWithOwner) {
		logger.info("Starting of setValidCompanyAddress method");

		this.businessdetailspage = new BusinessDetailsTabPage(BUSINESS_DETAILS_DRIVER);
		businessdetailspage.setCompanyDetails(addressline1, addressline2, companyCode, residingSince, ownerName,
				relationWithOwner);

		logger.info("Ending of setValidCompanyAddress method");
	}

	@Test(priority = 4, dataProvider = "get_company_Address", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setCompanyAddressInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setCompanyAddressInInfin")
	public void setCompanyAddress(String addressline1, String addressline2, String companyCode, String residingSince,
			String ownerName, String relationWithOwner) {
		logger.info("Starting of setValidCompanyAddress method");

		this.businessdetailspage = new BusinessDetailsTabPage(BUSINESS_DETAILS_DRIVER);

		// passing Assertions for LblText
		String getbusinessstext = this.businessdetailspage.getLblCompanyAddressTxt();
		Assert.assertEquals(getbusinessstext, expectedAssertionsProp.getProperty("companyaddresstext"));
		System.out.println("Lbl Text is:" + getbusinessstext);

		businessdetailspage.setCompanyDetails(addressline1, addressline2, companyCode, residingSince, ownerName,
				relationWithOwner);

		// passing Assertions for Pincode Field
		try {
			String invalidpincodetext = this.businessdetailspage.getInvalidPincodeText();
			Assert.assertEquals(invalidpincodetext, expectedAssertionsProp.getProperty("invalidpincodetext"));
			System.out.println("Invalid pincode text " + invalidpincodetext);
		} catch (Exception e) {

		} finally {
			this.businessdetailspage.clickOutside();
		}

		logger.info("Ending of setValidCompanyAddress method");
	}

	@Test(priority = 5, dataProvider = "get_Valid_Company_Bank_Account", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setBankDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setBankDetails")
	public void setValidCompanyBankDetails(String ifscCode, String accountNumber, String accountName) {
		logger.info("Starting of setValidCompanyBankDetails method");

		// passing Assertions for LblText

		String companybankaccounttext = this.businessdetailspage.getLblCompanyBankAccountTxt();
		Assert.assertEquals(companybankaccounttext, expectedAssertionsProp.getProperty("companybankaccount"));
		System.out.println("Lbl Text is :" + companybankaccounttext);

		businessdetailspage.setBankDetails(ifscCode, accountNumber, accountName);

		logger.info("Ending of setValidCompanyBankDetails method");
	}

	@Test(priority = 6, dataProvider = "get_Company_Bank_Account", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setBankDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setBankDetails")
	public void setCompanyBankDetails(String ifscCode, String accountNumber, String accountName) {
		logger.info("Starting of setCompanyBankDetails method");

		// passing Assertions for LblText

		String companybankaccounttext = this.businessdetailspage.getLblCompanyBankAccountTxt();
		Assert.assertEquals(companybankaccounttext, expectedAssertionsProp.getProperty("companybankaccount"));
		System.out.println("Lbl Text is :" + companybankaccounttext);

		businessdetailspage.setBankDetails(ifscCode, accountNumber, accountName);

		try {
			// passing Assertions for IFSC field
			String inavlidifscText = this.businessdetailspage.getInvalidIfscCodeTxt();
			Assert.assertEquals(inavlidifscText, expectedAssertionsProp.getProperty("invalidifsctext"));
			System.out.println("Invalid IfscText " + inavlidifscText);
		} catch (Exception e) {

		} finally {

			this.businessdetailspage.clickOutside();
		}
		logger.info("Ending of setCompanyBankDetails method");
	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		BUSINESS_DETAILS_DRIVER.close();
		BUSINESS_DETAILS_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
