package com.infin.leadbox;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class LinePage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(LinePage.class.getName());

	@FindBy(id = "creditline")
	private WebElement btnLineTab;

	@FindBy(id = "open_line_create")
	private WebElement creditLineEditIcon;

	@FindBy(id = "line_amount")
	private WebElement txtAmount;

	@FindBy(id = "submit_create_line")
	private WebElement btnSubmit;

	@FindBy(id = "apply_loan")
	private WebElement btnApplyLoan;

	@FindBy(id = "line_otp")
	private WebElement txtOTP;

	@FindBy(id = "line_amount")
	private WebElement txtLineAMount;

	@FindBy(id = "line_transaction_id")
	private WebElement txtTransactionId;

	@FindBy(id = "line_tenure")
	private WebElement txtTenure;

	@FindBy(id = "line_file")
	private WebElement chooseLineFile;

	@FindBy(id = "submit_apply_loan")
	private WebElement btnApplyLoanSubmit;


	public LinePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnLinetab() {
		logger.info("Starting of clickOnLinetab method");

		this.btnLineTab.click();

		logger.info("Ending of clickOnLinetab mwthod");

	}

	public void clickOnCreditLineEditIcon() {
		logger.info("Starting of clickOnCreditLineEDitIcon method");

		this.clickOnElement(creditLineEditIcon);

		logger.info("Ending of clickOnCreditLineEDitIcon method");

	}

	public void setAmount(String Amount) {
		logger.info("Starting of setAmount method");

		this.txtAmount.click();
		this.txtAmount.clear();
		this.txtAmount.sendKeys(Amount);

		logger.info("Ending of setAmount method");

	}

	public void clickOnSubmitButton() {
		logger.info("Starting of clickOnSubmitButton method");

		this.btnSubmit.click();

		logger.info("Ending of clickOnSubmitButton method");

	}

	public void clickOnApplyLoanButton() {
		logger.info("Starting of clickOnApplyLoanBitton method");

		this.clickOnElement(btnApplyLoan);

		logger.info("Ending of clickOnApplyLoanBitton method");

	}

	public void setOTP(String otp) {
		logger.info("Starting of setOTP method");

		this.txtOTP.click();
		this.txtOTP.clear();
		this.txtOTP.sendKeys(otp);

		logger.info("Ending of setOTP method");

	}

	public void setLineAmount(String lineAmount) {
		logger.info("Starting of setLineAmount method");

		this.txtLineAMount.click();
		this.txtLineAMount.clear();
		this.txtLineAMount.sendKeys(lineAmount);

		logger.info("Ending of setLineAmount method");

	}

	public void setTransactionId(String transactionId) {
		logger.info("Starting of setTransactionId method");

		this.txtTransactionId.click();
		this.txtTransactionId.clear();
		this.txtTransactionId.sendKeys(transactionId);

		logger.info("Ending of setTransactionId method");

	}

	public void setTenure(String tenure) {
		logger.info("Starting of setTenure method");

		this.txtTenure.click();
		this.txtTenure.clear();
		this.txtTenure.sendKeys(tenure);

		logger.info("Ending of setTenure method");

	}

	public void clickOnChooseLineFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnChooseLineFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			chooseLineFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			chooseLineFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			chooseLineFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnChooseLineFile method");
	}

	public void clickOnApplySubmitButton() {
		logger.info("Starting of clickOnApplySubmitButton method");

		this.btnApplyLoanSubmit.click();

		logger.info("Ending of clickOnApplySubmitButton method");

	}

	public void setCreditLine(String amount) {
		logger.info("Starting of setCreditLine method");

		this.clickOnLinetab();
		this.clickOnCreditLineEditIcon();
		this.setAmount(amount);
		this.clickOnSubmitButton();
		this.clickOutside();

		logger.info("Ending of setCreditLine method");

	}

	public void setApplyLoanDetails(String otp,String lineAmount, String transactionId, String tenure) {
		logger.info("Starting of setApplyLoanDetails method");

		this.clickOnApplyLoanButton();
		this.setOTP(otp);
		this.setLineAmount(lineAmount);
		this.setTransactionId(transactionId);
		this.setTenure(tenure);
		//this.clickOnChooseLineFile(bankDocumentsUploadFile);
		//this.clickOnApplySubmitButton();

		logger.info("Ending of setApplyLoanDetails method");

	}

}
