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

public class TransactionsTest extends BaseFinvervTest {

	WebDriver TRANSACTION_DRIVER = null;

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private TransactionsPage transactionspage = null;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword",
			"pinCode", "filterMobileNumber" })
	public void leadBoxDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword, String pinCode) throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		TRANSACTION_DRIVER = this.getWebDriver(browser, WEB_DRIVER.TRANSACTION_DRIVER);
		this.goToSite(siteURL, TRANSACTION_DRIVER);

		loginFeatureWithValidCredentials(validuserName, validPassword, TRANSACTION_DRIVER);
		createApplicationWithValidData(TRANSACTION_DRIVER, pinCode);

		logger.info("Ending of CreateApplication in Infin");

	}

	@Test(priority = 1, dataProvider = "get_Valid_Transaction_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidTransactionDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidTransactionDetails")
	public void setValidTransactionDetails(String transactionCount, String transactionAmount,
			String dateOfTransaction) {
		logger.info("Starting of setValidTransactionDetails method");

		this.transactionspage = new TransactionsPage(TRANSACTION_DRIVER);
		this.transactionspage.clickOnTransactionButton();
		this.transactionspage.setTransactionDetails(transactionCount, transactionAmount, dateOfTransaction);

		logger.info("Starting of setValidTransactionDetails method");

	}

	@Test(priority = 2, dataProvider = "get_Valid_Edit_Transaction_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setValidEditTransactionDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setValidEditTransactionDetails")
	public void setValidEditTransactionDetails(String count, String amount, String dateOfTransaction) {
		logger.info("Starting of setValidEditTransactionDetails method");

		this.transactionspage = new TransactionsPage(TRANSACTION_DRIVER);
		this.transactionspage.editTransactionDetails(count, amount, dateOfTransaction);

		logger.info("Ending of setValidEditTransactionDetails method");

	}

	@Test(priority = 1, dataProvider = "get_Transaction_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setTransactionDetails")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setTransactionDetails")
	public void setTransactionDetails(String transactionCount, String transactionAmount, String dateOfTransaction) {
		logger.info("Starting of setTransactionDetails method");

		this.transactionspage = new TransactionsPage(TRANSACTION_DRIVER);

		// Passing the Assertions for Transactions tab Lbl Text
		String lbltabtext = this.transactionspage.getLblTransactionsTxt();
		Assert.assertEquals(lbltabtext, expectedAssertionsProp.getProperty("trnsactionlbltext"));
		System.out.println("Lbl Tab Text is :" + lbltabtext);

		this.transactionspage.clickOnTransactionButton();
		this.transactionspage.setTransactionDetails(transactionCount, transactionAmount, dateOfTransaction);

		try {
			// Passing the Assertions for Transaction Count Field
			String invalidcounttext = this.transactionspage.getLblInvalidTransactionsCountTxt();
			Assert.assertEquals(invalidcounttext, expectedAssertionsProp.getProperty("invalidtransactioncounttext"));
			System.out.println("Invalid Amount Text is :" + invalidcounttext);

			// Passing the Assertions for InvalidTransactionsAmountTxt Field
			String invalidtransactionamounttext = this.transactionspage.getLblInvalidTransactionsAmountTxt();
			Assert.assertEquals(invalidtransactionamounttext,
					expectedAssertionsProp.getProperty("invalidtransactionamounttext"));
			System.out.println("Invalid Transaction Text is :" + invalidtransactionamounttext);

			// Passing the Assertions for InvalidDateTxt Field
			String invalidatetext = this.transactionspage.getInvalidDateTxt();
			Assert.assertEquals(invalidatetext, expectedAssertionsProp.getProperty("invaliddateoftransaction"));
			System.out.println("Invalid Amount Text is :" + invalidatetext);

		} catch (Exception e) {

		} finally {
			this.transactionspage.clickOutside();
		}

		logger.info("Ending of setTransactionDetails method");

	}

	@Test(priority = 2, dataProvider = "get_Edit_Transaction_Details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify setEditTransactionDetailsInInfin")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify setEditTransactionDetailsInInfin")
	public void setEditTransactionDetails(String count, String amount, String dateOfTransaction) {
		logger.info("Starting of setEditTransactionDetails method");

		this.transactionspage = new TransactionsPage(TRANSACTION_DRIVER);
		this.transactionspage.editTransactionDetails(count, amount, dateOfTransaction);

		logger.info("Ending of setEditTransactionDetails method");

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		logger.info("Starting of tearDown method");

		TRANSACTION_DRIVER.close();
		TRANSACTION_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
