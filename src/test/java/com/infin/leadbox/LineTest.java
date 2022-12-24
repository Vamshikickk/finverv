package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
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

public class LineTest extends BaseFinvervTest {

	WebDriver LINE_DRIVER = null;
	private LinePage linepage = null;
	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private String OTP;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode, String filterMobileNumber) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		LINE_DRIVER = this.getWebDriver(browser, WEB_DRIVER.LINE_DRIVER);
		this.goToSite(siteURL, LINE_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, LINE_DRIVER);
		createApplicationWithValidData(LINE_DRIVER, pinCode);
		this.getOTP();
		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Apply_loan_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setLineDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setLineDetails")

	public void setValidCreditLineAmount(String amount) {

		logger.info("Starting of setValidCreditLineAmount method");

		this.linepage = new LinePage(LINE_DRIVER);
		this.linepage.setCreditLine(amount);

		logger.info("Ending of setValidCreditLineAmount method");
	}

	@Test(priority = 2, dataProvider = "get_Valid_Apply_loan_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidApplyLoanDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidApplyLoanDetails")

	public void setValidApplyLoanDetails(String lineAmount, String transactionId, String tenure) {

		logger.info("Starting of setApplyLoanDetails method");

		this.linepage.setApplyLoanDetails(getOTP(), lineAmount, transactionId, tenure);

		logger.info("Ending of setApplyLoanDetails method");
	}

	@Test(priority = 3, dataProvider = "get_Credit_line", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setLineDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setLineDetails")

	public void setCreditLineAmount(String amount) {

		logger.info("Starting of setCreditLineAmount method");

		this.linepage = new LinePage(LINE_DRIVER);
		this.linepage.setCreditLine(amount);

		logger.info("Ending of setCreditLineAmount method");

	}

	@Test(priority = 4, dataProvider = "get_Apply_loan_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setApplyLoanDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setApplyLoanDetails")

	public void setApplyLoanDetails(String lineAmount, String transactionId, String tenure) {

		logger.info("Starting of setApplyLoanDetails method");

		this.linepage.setApplyLoanDetails(getOTP(), lineAmount, transactionId, tenure);

		logger.info("Ending of setApplyLoanDetails method");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		LINE_DRIVER.close();
		LINE_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
