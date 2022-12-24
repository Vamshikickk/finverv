
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

public class RepaymentTest extends BaseFinvervTest {

	WebDriver REPAYMENT_DRIVER = null;
	private CreateApplicationPage createApplictionpage = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private RepaymentPage repaymentPage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		REPAYMENT_DRIVER = this.getWebDriver(browser, WEB_DRIVER.REPAYMENT_DRIVER);
		this.goToSite(siteURL, REPAYMENT_DRIVER);

		this.repaymentPage = new RepaymentPage(REPAYMENT_DRIVER);
		this.createApplictionpage = new CreateApplicationPage(REPAYMENT_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, REPAYMENT_DRIVER);
		createApplicationWithValidData(REPAYMENT_DRIVER, pinCode);
		this.createApplictionpage.scrollDown(100);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Repayment_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setRepaymentDetailss")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setRepaymentDetailss")

	public void setValidRepaymentDetails(String amount, String paymentDate) {
		logger.info("Starting of setRepaymentDetailss method");

		this.repaymentPage.setRepaymentDetails(amount, paymentDate);

		logger.info("Ending of setRepaymentDetailss method");
	}

	@Test(priority = 2, dataProvider = "get_Repayment_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setRepaymentDetailss")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setRepaymentDetailss")
	public void setRepaymentDetails(String amount, String paymentDate) {
		logger.info("Starting of setRepaymentDetailss method");

		this.repaymentPage.setRepaymentDetails(amount, paymentDate);

		try {
			String amountvalidationtext = this.repaymentPage.getAmountValidationTxt();
			Assert.assertEquals(amountvalidationtext, expectedAssertionsProp.getProperty("invalidrepaymentamounttext"));
			System.out.println("Amount field Validation Text :" + amountvalidationtext);
		} catch (Exception e) {

		} finally {
			this.repaymentPage.clickOutside();
		}

		logger.info("Ending of setRepaymentDetailss method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		REPAYMENT_DRIVER.close();
		REPAYMENT_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
