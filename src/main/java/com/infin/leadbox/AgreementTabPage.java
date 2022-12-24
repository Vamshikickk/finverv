package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class AgreementTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(AgreementTabPage.class.getName());

	@FindBy(id = "aggrement")
	private WebElement btnAgreementTab;

	@FindBy(id = "aggrement_create")
	private WebElement btnLoanCreate;

	@FindBy(id = "agreement_add_description")
	private WebElement txtDescription;

	@FindBy(id = "agreement_add_submit")
	private WebElement btnAddAgreement;

	@FindBy(id = "anticon anticon-eye")
	private WebElement loanAggrementDocumentIcon;

	@FindBy(id = "select_")
	private WebElement loanAgreementSelectLblDropDown;

	@FindBy(xpath = "//div[text()='Loan Agreement']")
	private WebElement selectLoanAgreementType;

	@FindBy(id = "choose_")
	private WebElement loanAgreementChooseFile;

	@FindBy(id = "upload_")
	private WebElement btnLoanAgreementUpload;

	@FindBy(xpath = "(//button[@id='aggrement_create'])[1]")
	private WebElement sanctionLetterCreateButton;

	@FindBy(id = "agreement_add_description")
	private WebElement txtSanctionLetterDescription;

	@FindBy(id = "agreement_add_submit")
	private WebElement btnSanctionLetterAddAgreement;

	@FindBy(xpath = "(//i[@class='anticon anticon-eye'])[2]")
	private WebElement sanctionLetterDocumentIcon;

	@FindBy(xpath = "(//nz-select-item[@class='ant-select-selection-item ng-star-inserted'])[2]")
	private WebElement sanctionLetterSelectLblDrpDwn;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[2]")
	private WebElement sanctionLetterSelectType;

	@FindBy(id = "choose_")
	private WebElement sanctionLetterChooseFile;

	@FindBy(id = "upload_")
	private WebElement sanctionLetterUploadButton;

	@FindBy(id = "//button[@id='aggrement_create']/span[1]")
	private WebElement btnNachMandateCreate;

	@FindBy(id = "agreement_add_description")
	private WebElement txtNachDescription;

	@FindBy(xpath = "//button[@id='agreement_add_submit']/span[1]")
	private WebElement btnNachAgreement;

	@FindBy(xpath = "(//i[@class='anticon anticon-eye'])[3]")
	private WebElement nachMandateDocumentIcon;

	@FindBy(xpath = "(//nz-select-item[@class='ant-select-selection-item ng-star-inserted'])[2]")
	private WebElement nachMandateSelectLblDrpdwn;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[2]")
	private WebElement selectNachselectLblType;

	@FindBy(id = "choose_")
	private WebElement nachMandateChooseFile;

	@FindBy(id = "//button[@id='upload_']/span[1]")
	private WebElement btnNachMandateUpload;

	@FindBy(id = "submit-application")
	private WebElement btnSubmitApplication;

	public AgreementTabPage(WebDriver driver) {
		super(driver);

	}

	public void btnAgreementTab() {
		logger.info("Starting of btnAgreementTab method");

		this.btnAgreementTab.click();

		logger.info("Ending of btnAgreementTab method");

	}

	public void loanCreateButton() {
		logger.info("Starting of loanCreateButton method");

		this.clickOnElement(btnLoanCreate);

		logger.info("Ending of loanCreateButton method");

	}

	public void setDescription(String loanDescription) {
		logger.info("Starting of setDescription method");

		this.txtDescription.click();
		this.txtDescription.clear();
		this.txtDescription.sendKeys(loanDescription);

		logger.info("Ending of setDescription method");

	}

	public void clickOnbtnAddLoanAgreement() {
		logger.info("Starting of clickOnbtnAddLoanAgreement method");

		this.btnAddAgreement.click();

		logger.info("Ending of clickOnbtnAddLoanAgreement method");

	}

	public void clickOnloanAgreementIcon() {
		logger.info("Starting of clickOnloanAgreementIcon method");

		this.loanAggrementDocumentIcon.click();

		logger.info("Ending of clickOnloanAgreementIcon method");

	}

	public void setLoanDocuments() {
		logger.info("Starting of setLoanDocuments method");

		this.loanAgreementSelectLblDropDown.click();
		this.selectLoanAgreementType.click();

		logger.info("Ending of setLoanDocuments method");

	}

	public void loanAgreementChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of loanAgreementChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			loanAgreementChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			loanAgreementChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			loanAgreementChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of loanAgreementChooseFile method");
	}

	public void clickOnLoanAgreementUploadButton() {
		logger.info("Starting of clickOnLoanAgreementUploadButton method");

		this.btnLoanAgreementUpload.click();

		logger.info("Ending of clickOnLoanAgreementUploadButton method");

	}

	public void sanctionLetterCreateButton() {
		logger.info("Starting of sanctionLetterCreateButton method");

		this.sanctionLetterCreateButton.click();

		logger.info("Ending of sanctionLetterCreateButton method");

	}

	public void setSanctionLetterDescription(String sanctionDescription) {
		logger.info("Starting of setSanctionLetterDescription method");

		this.txtSanctionLetterDescription.click();
		this.txtSanctionLetterDescription.clear();
		this.txtSanctionLetterDescription.sendKeys(sanctionDescription);

		logger.info("Ending of setSanctionLetterDescription method");

	}

	public void clickloanSanctionLetterAgreementButton() {
		logger.info("Starting of clickloanSanctionLetterAgreement method");

		this.btnSanctionLetterAddAgreement.click();

		logger.info("Ending of clickloanSanctionLetterAgreement method");

	}

	public void clickloanSanctionLetterIcon() {
		logger.info("Starting of clickloanAgreementIcon method");

		this.sanctionLetterDocumentIcon.click();

		logger.info("Ending of clickloanAgreementIcon method");

	}

	public void setSanctionDocuments() {
		logger.info("Starting of setSanctionDocuments method");

		this.sanctionLetterSelectLblDrpDwn.click();
		this.sanctionLetterSelectType.click();

		logger.info("Ending of setSanctionDocuments method");

	}

	public void sanctionletterChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of sanctionletterChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			sanctionLetterChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			sanctionLetterChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			sanctionLetterChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of sanctionletterChooseFile method");
	}

	public void clickOnSanctionLetterUploadButton() {
		logger.info("Starting of clickOnSanctionLetterUploadButton method");

		this.sanctionLetterUploadButton.click();

		logger.info("Ending of clickOnSanctionLetterUploadButton method");

	}

	public void nachMandateCreateButton() {
		logger.info("Starting of nachMandateCreateButton method");

		this.btnNachMandateCreate.click();

		logger.info("Ending of nachMandateCreateButton method");

	}

	public void setNachMandateDescription(String nachDescription) {
		logger.info("Starting of setNachMandateDescription method");

		this.txtNachDescription.click();
		this.txtNachDescription.clear();
		this.txtNachDescription.sendKeys(nachDescription);

		logger.info("Ending of setNachMandateDescription method");

	}

	public void clickOnNachMandateAgreementButton() {
		logger.info("Starting of clickOnNachMandateButton method");

		this.btnNachAgreement.click();

		logger.info("Ending of clickOnNachMandateButton method");

	}

	public void clickOnNachDocumentIcon() {
		logger.info("Starting of clickOnNachDocumentIcon");

		this.nachMandateDocumentIcon.click();

		logger.info("Ending of clickOnNachDocumentIcon");
	}

	public void setNachDocuments() {
		logger.info("Starting of setNachDocuments method");

		this.nachMandateSelectLblDrpdwn.click();
		this.selectNachselectLblType.click();

		logger.info("Ending of setNachDocuments method");

	}

	public void nachMandateChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of nachMandateChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			nachMandateChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			nachMandateChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			nachMandateChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of nachMandateChooseFile method");
	}

	public void clickOnNachUploadButton() {
		logger.info("Starting of clickOnNachUploadButton method");

		this.btnNachMandateUpload.click();

		logger.info("Ending of clickOnNachUploadButton method");

	}

	public void clickOnSubmitApplicationButton() {
		logger.info("Starting of clickOnSubmitApplicationButton method");

		this.btnSubmitApplication.click();

		logger.info("Ending of clickOnSubmitApplicationButton method");
	}

	public void setAgreementDetails(String loanDescription, String bankDocumentsUploadFile,
			String sanctionDescription) {
		logger.info("Starting of setAgreementDetails method");

		this.btnAgreementTab();
		this.loanCreateButton();
		this.setDescription(loanDescription);
		this.clickOnbtnAddLoanAgreement();
		this.clickOnloanAgreementIcon();
		this.setLoanDocuments();
		this.loanAgreementChooseFile(bankDocumentsUploadFile);
		this.clickOnLoanAgreementUploadButton();
		this.sanctionLetterCreateButton();
		this.setSanctionLetterDescription(sanctionDescription);
		this.clickloanSanctionLetterAgreementButton();
		this.clickloanSanctionLetterIcon();
		this.setSanctionDocuments();
		/*
		 * this.sanctionletterChooseFile(bankDocumentsUploadFile);
		 * this.clickOnSanctionLetterUploadButton(); this.nachMandateCreateButton();
		 * this.setNachMandateDescription(nachDescription);
		 * this.clickOnNachMandateAgreementButton(); this.clickOnNachDocumentIcon();
		 * this.setNachDocuments(); this.nachMandateChooseFile(bankDocumentsUploadFile);
		 */
		logger.info("Ending of setAgreementDetails method");
	}

}
