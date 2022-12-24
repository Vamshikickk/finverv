package com.infin.leadbox;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class RepaymentPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(RepaymentPage.class.getName());

	@FindBy(id = "repayments")
	private WebElement btnrepaymenttab;

	@FindBy(id = "create_repayment")
	private WebElement btnCreateNewRepayment;

	@FindBy(id = "repayment_amount")
	private WebElement txtrepaymetAmount;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement txtPaymentDate;

	@FindBy(xpath = "//div[text()='Create RePayment']")
	private WebElement lblCreateRepayment;

	@FindBy(id = "repayment_payment_mode")
	private WebElement paymentModeDrpdwn;;

	@FindBy(xpath = "//div[text()='UPI']")
	private WebElement selectpaymentDrpdwn;

	@FindBy(id = "submit")
	private WebElement createRepaymentSubmitButton;
	
	@FindBy(xpath="//span[text()='amount-A Valid Number Is Required.']")
	private WebElement amountFieldValidationTxt;

	public RepaymentPage(WebDriver driver) {
		super(driver);

	}

	public void clickonRepaymentTab() {
		logger.info("Starting of clickonRepaymentTab method");

		this.btnrepaymenttab.click();

		logger.info("Ending of clickonRepaymentTab method");
	}

	public void clickOnCreateNewRepaymentButton() {
		logger.info("Starting of clickOnCreateNewRepaymentButton method");

		this.btnCreateNewRepayment.click();

		logger.info("Ending of clickOnCreateNewRepaymentButton method");
	}

	public void setAmount(String amount) {
		logger.info("Starting of setAmount method");

		this.txtrepaymetAmount.click();
		this.txtrepaymetAmount.clear();
		this.txtrepaymetAmount.sendKeys(amount);

		logger.info("Ending of setAmount method");

	}

	public void setPaymentDate(String paymentDate) {
		logger.info("Starting of setPaymentDate method");

		this.txtPaymentDate.click();
		this.txtPaymentDate.clear();
		this.txtPaymentDate.sendKeys(paymentDate);
		this.lblCreateRepayment.click();

		logger.info("Ending of setPaymentDate method");
	}
	public String getAmountValidationTxt() {
		logger.info("Starting of getInvalidValidationTxt method");
		
		logger.info("Ending of getInvalidValidationTxt method");
		return amountFieldValidationTxt.getText();
	}

	public void setPaymentMode() {
		logger.info("Starting of setPaymentMode method");

		this.paymentModeDrpdwn.click();
		this.selectpaymentDrpdwn.click();

		logger.info("Ending of setPaymentMode method");
	}

	public void clickOnCreateNewRepaymetSubmitButton() {
		logger.info("Starting of clickOnCreateNewRepaymetSubmitButton method");

		this.createRepaymentSubmitButton.click();

		logger.info("Ending of clickOnCreateNewRepaymetSubmitButton method");
	}
	

	public void setRepaymentDetails(String amount, String paymentDate) {
		logger.info("Starting of setRepaymentDetails method");

		this.clickonRepaymentTab();
		this.clickOnCreateNewRepaymentButton();
		this.setAmount(amount);
		this.setPaymentDate(paymentDate);
		this.setPaymentMode();
		this.clickOnCreateNewRepaymetSubmitButton();

		logger.info("Ending of setRepaymentDetails method");
	}
	

}
