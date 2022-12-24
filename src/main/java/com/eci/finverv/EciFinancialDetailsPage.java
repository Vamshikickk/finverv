package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciFinancialDetailsPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciFinancialDetailsPage.class.getName());

	@FindBy(xpath = "(//div[@role='button'])[6]")
	private WebElement btnFinancialDetailsTab;

	@FindBy(xpath = "(//span[text()='Edit'])[6]")
	private WebElement btnFinancialDetailsEdit;

	@FindBy(xpath = "//h2[text()='Financial Details']")
	private WebElement lblFinancialDetailsTxt;

	@FindBy(xpath = "//label[text()='Account Type *']//parent::nz-form-label//parent::nz-form-item/child::nz-input-group")
	private WebElement getaccountType;

	@FindBy(xpath = "//nz-select-arrow[@class='ant-select-arrow ng-tns-c80-0 ng-star-inserted']")
	private WebElement accountTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Current']")
	private WebElement selectAccountType;

	@FindBy(xpath = "//input[@formcontrolname='ifsc_code']")
	private WebElement ifscCode;

	@FindBy(xpath = "//input[@formcontrolname='account_number']")
	private WebElement accountNumber;

	@FindBy(xpath = "//input[@formcontrolname='account_name']")
	private WebElement accountName;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement btnsave;

	@FindBy(xpath = "//nz-select-top-control[@class='ant-select-selector ng-tns-c80-12']//nz-select-item[1]")
	private WebElement financialDetailsDrpdwn;

	@FindBy(xpath = "//div[text()='Form 16']")
	private WebElement selectFinanceDocumentType;

	@FindBy(xpath = "//input[@class='hide_file ng-star-inserted']")
	private WebElement financeChooseFile;

	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement financeUploadButton;

	public EciFinancialDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnFinancialDetailsTab() {
		logger.info("Starting of clickOnFinancialDetailsTab method");

		this.btnFinancialDetailsTab.click();

		logger.info("Ending of clickOnFinancialDetailsTab method");
	}

	public void clickOnEditbtn() {
		logger.info("Starting of clickOnEditbtn method");

		this.btnFinancialDetailsEdit.click();

		logger.info("Ending of clickOnEditbtn method");
	}

	public String getFinancialDetailsTxt() {

		logger.info("Starting of getFinancialDetailsTxt method");
		logger.info("Ending of getFinancialDetailsTxt method");
		return lblFinancialDetailsTxt.getText();

	}

	public void selectAccountType() {
		logger.info("Starting of selectAccountType method");

		this.accountTypeDrpdwn.click();
		this.selectAccountType.click();

		logger.info("Ending of selectAccountType method");
	}

	public void setIfscCode(String ifscCode) {
		logger.info("Starting of setIfscCode method");

		this.ifscCode.click();
		this.ifscCode.clear();
		this.ifscCode.sendKeys(ifscCode);

		logger.info("Ending of setIfscCode method");
	}

	public void setAccountNumber(String accountNumber) {
		logger.info("Starting of setAccountNumber method");

		this.accountNumber.click();
		this.accountNumber.clear();
		this.accountNumber.sendKeys(accountNumber);

		logger.info("Ending of setAccountNumber method");
	}

	public void setAccountName(String accountName) {
		logger.info("Starting of setAccountName method");

		this.accountName.click();
		this.accountName.clear();
		this.accountName.sendKeys(accountName);

		logger.info("Ending of setAccountName method");
	}

	public void clickOnSaveBtn() {
		logger.info("Starting of clickOnSaveBtn method");

		this.btnsave.click();

		logger.info("Ending of clickOnSaveBtn method");
	}

	public void clickOnFinanceSelectDoumentDrpdwn() {
		logger.info("Starting of clickOnFinanceSelectDoumentDrpdwn method");

		this.financialDetailsDrpdwn.click();

		logger.info("Ending of clickOnFinanceSelectDoumentDrpdwn method");

	}

	public void financeSelectFileType() {
		logger.info("Starting of financeSelectFileType method");

		this.selectFinanceDocumentType.click();

		logger.info("Ending of financeSelectFileType method");

	}

	public void clickOnFinanceChooseClickToUploadFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnFinanceChooseClickToUploadFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			financeChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			financeChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			financeChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnFinanceChooseClickToUploadFile method");
	}

	public void clickOnFinanceUploadButton() {
		logger.info("Starting of clickOnFinanceUploadButton method");

		this.financeUploadButton.click();

		logger.info("Ending of clickOnFinanceUploadButton method");

	}

	public void setFinancialDetails(String ifscCode, String accountNumber, String accountName) {
		logger.info("Starting of setFinancialDetails method");

		this.clickOnFinancialDetailsTab();
		this.clickOnEditbtn();
		this.selectAccountType();
		this.setIfscCode(ifscCode);
		this.setAccountNumber(accountNumber);
		this.setAccountName(accountName);
		this.clickOnSaveBtn();
		this.clickOnFinancialDetailsTab();

	}

	public void getAccountType() {
		logger.info("Starting of getAccountType method");

		System.out.println(this.getaccountType.getText());

		logger.info("Ending of getAccountType method");
	}

	public void getIfscCode() {
		logger.info("Starting of getIfscCode method");

		System.out.println(this.ifscCode.getAttribute("value"));

		logger.info("Ending of getIfscCode method");
	}

	public void getAccountNumber() {
		logger.info("Starting of getAccountNumber method");

		System.out.println(this.accountNumber.getAttribute("value"));

		logger.info("Ending of getAccountNumber method");
	}

	public void getAccountName() {
		logger.info("Starting of getAccountName method");

		System.out.println(this.accountName.getAttribute("value"));

		logger.info("Ending of getAccountName method");
	}

	public void getFinancialDetails() {
		logger.info("Starting of getFinancialDetails method");

		this.clickOnFinancialDetailsTab();
		this.clickOnEditbtn();
		this.getAccountType();
		this.getIfscCode();
		this.getAccountNumber();
		this.getAccountName();

		logger.info("Ending of getFinancialDetails method");

	}
}
