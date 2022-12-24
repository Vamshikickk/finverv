package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class TransactionsPage extends BaseFinvervPage {
	private static final Logger logger = Logger.getLogger(TransactionsPage.class.getName());

	@FindBy(xpath = "//a[text()='Transactions']")
	private WebElement lblTxtTransactions;

	@FindBy(id = "transactions")
	private WebElement btnTransactionTab;

	@FindBy(xpath = "//span[text()='Add Transactions']")
	private WebElement lblTxtAddTransaction;

	@FindBy(id = "add_transactions")
	private WebElement btnAddTransaction;

	@FindBy(id = "transactions_transaction_count")
	public WebElement txtTransactionCount;

	@FindBy(xpath = "//span[text()='transaction_count-A Valid Integer Is Required.']")
	private WebElement invalidTransactionCountValidationTxt;

	@FindBy(xpath = "//span[text()='This Field is required.']")
	private WebElement requiredValidationCountTxt;

	@FindBy(id = "transactions_total_amount")
	private WebElement txtTotalAmount;

	@FindBy(xpath = "//span[text()='total_amount-A Valid Integer Is Required.']")
	private WebElement invalidTotalAmountValidationTxt;

	@FindBy(xpath = "//span[text()='This Field is required.']")
	private WebElement requiredValidationAmountTxt;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement txtDateOfTransaction;

	@FindBy(xpath = "//span[text()='date_of_transaction-Future Date Not Allowed']")
	private WebElement invalidValidationDateOfTransactionTxt;

	@FindBy(xpath = "//span[text()='This Field is required.']")
	private WebElement requiredValidationDateOfTransactionDate;

	@FindBy(xpath = "//label[text()='Date of Transaction *']")
	private WebElement lblDateOfTransaction;

	@FindBy(xpath = "//div[contains(text(),'Edit Transactions')]")
	private WebElement lblTxtEditTransactions;

	@FindBy(id = "transactions_submit")
	private WebElement btnAddTransactionSubmit;

	@FindBy(id = "show_documents_transactions")
	private WebElement transactionsDocumentIcon;

	@FindBy(id = "select_show_documents_transactions")
	private WebElement transactionsSelectLblDrpdwn;;

	@FindBy(xpath = "(//nz-tag[@id='edit_transactions'])[1]")
	private WebElement btnEditTransaction;

	public TransactionsPage(WebDriver driver) {
		super(driver);

	}

	public String getLblTransactionsTxt() {
		logger.info("Starting of getLblTransactionsTxt method");

		logger.info("Ending of getLblTransactionsTxt method");
		return lblTxtTransactions.getText();
	}

	public void clickOnTransactionButton() {
		logger.info("Starting of clickOnTransactionButton method");

		this.btnTransactionTab.click();

		logger.info("Ending of clickOnTransactionButton method");

	}

	public String getLblTextAddTransction() {
		logger.info("Starting of getLblTextAddTransction method");

		logger.info("Ending of getLblTextAddTransction method");
		return lblTxtAddTransaction.getText();
	}

	public void clickOnAddTransactionButton() {
		logger.info("Starting of clickOnAddTransactionButton method");

		this.btnAddTransaction.click();

		logger.info("Ending of clickOnAddTransactionButton method");
	}

	public void setTransactionCount(String count) {
		logger.info("Starting of setTransactionCount method");

		this.txtTransactionCount.click();
		this.txtTransactionCount.clear();
		this.txtTransactionCount.sendKeys(count);

		logger.info("Ending of setTransactionCount method");

	}

	public String getLblInvalidTransactionsCountTxt() {
		logger.info("Starting of getLblInvalidTransactionsCountTxt method");

		logger.info("Ending of getLblInvalidTransactionsCountTxt method");
		return invalidTransactionCountValidationTxt.getText();
	}

	public String getRequiredCountTxt() {
		logger.info("Starting of getRequiredCountTxt method");

		logger.info("Ending of getRequiredCountTxt method");
		return requiredValidationCountTxt.getText();

	}

	public void setTotalAmount(String amount) {
		logger.info("Starting of setTotalAmount method");

		this.txtTotalAmount.click();
		this.txtTotalAmount.clear();
		this.txtTotalAmount.sendKeys(amount);

		logger.info("Ending of setTotalAmount method");

	}

	public String getLblInvalidTransactionsAmountTxt() {
		logger.info("Starting of getLblInvalidTransactionsAmountTxt method");

		logger.info("Ending of getLblInvalidTransactionsAmountTxt method");
		return invalidTotalAmountValidationTxt.getText();
	}

	public String getRequiredAmountTxt() {
		logger.info("Starting of getRequiredAmountTxt method");

		logger.info("Ending of getRequiredAmountTxt method");
		return requiredValidationAmountTxt.getText();
	}

	public void setDateOfTransaction(String dateOfTransaction) {
		logger.info("Starting of setDateOfTransaction method");

		this.txtDateOfTransaction.click();
		this.txtDateOfTransaction.clear();
		this.txtDateOfTransaction.sendKeys(dateOfTransaction);

		logger.info("Ending of setDateOfTransaction method");

	}

	public void clickOnlblDateOfTransaction() {
		logger.info("Starting of clickOnlblDateOfTransaction method");

		this.lblDateOfTransaction.click();

		logger.info("Ending of clickOnlblDateOfTransaction method");

	}

	public String getInvalidDateTxt() {
		logger.info("Starting of getRequiredDateTxt method");

		logger.info("Ending of getRequiredDateTxt method");
		return invalidValidationDateOfTransactionTxt.getText();
	}

	public String getRequiredDateTxt() {
		logger.info("Starting of getRequiredDateTxt method");

		logger.info("Ending of getRequiredDateTxt method");
		return requiredValidationDateOfTransactionDate.getText();
	}

	public void clickOnSubmitAddTransactionButton() {
		logger.info("Starting of clickOnSubmitAddTransactionButton method");

		this.btnAddTransactionSubmit.click();

		logger.info("Ending of clickOnSubmitAddTransactionButton method");
	}

	public void clickOnLblTxtEditTransaction() {
		logger.info("Starting of clickOnLblTxtEditTransaction method");

		this.lblTxtEditTransactions.click();

		logger.info("Ending of clickOnLblTxtEditTransaction method");
	}

	public void editButton() {
		logger.info("Starting of editButton method");

		this.clickOnElement(btnEditTransaction);

		logger.info("Ending of editButton method");
	}

	public void setTransactionDetails(String transactionCount, String transactionAmount, String dateOfTransaction) {
		logger.info("Starting of setTransactionDetails method");

		this.clickOnAddTransactionButton();
		this.setTransactionCount(transactionCount);
		this.setTotalAmount(transactionAmount);
		this.setDateOfTransaction(dateOfTransaction);
		this.clickOnlblDateOfTransaction();
		this.clickOnSubmitAddTransactionButton();

		logger.info("Ending of setTransactionDetails method");
	}

	public void editTransactionDetails(String count, String amount, String dateOfTransaction) {
		logger.info("Starting of editTransactionDetails method");

		this.editButton();
		this.setTransactionCount(count);
		this.setTotalAmount(amount);
		this.setDateOfTransaction(dateOfTransaction);
		this.clickOnLblTxtEditTransaction();
		this.clickOnSubmitAddTransactionButton();

		logger.info("Ending of editTransactionDetails method");
	}
}
