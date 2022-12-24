package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciBusinessDetailsPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciBusinessDetailsPage.class.getName());

	@FindBy(xpath = "(//div[@class='col-md-12 col-lg-12']//child::nz-collapse//child::nz-collapse-panel)[4]")
	private WebElement btnBusinessDetailsTab;

	@FindBy(xpath = "//h2[text()='Business Details']")
	private WebElement lblBusinessDetailsTxt;

	@FindBy(xpath = "(//a[@class='ant-btn ant-btn-primary'])[4]")
	private WebElement btnBusinessEdit;

	@FindBy(xpath = "//input[@formcontrolname='business_name']")
	private WebElement businessNameTxt;

	@FindBy(xpath = "//label[text()='Type Of Entity *']//parent::nz-form-label/following-sibling::nz-input-group\r\n"
			+ "")
	private WebElement getEntityType;

	@FindBy(xpath = "//nz-select-arrow[@class='ant-select-arrow ng-tns-c80-0 ng-star-inserted']")
	private WebElement entityTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Pvt Ltd']")
	private WebElement selectEntitiyType;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement setDateOfIncrption;

	@FindBy(xpath = "//label[text()='Business type *']//parent::nz-form-label/following-sibling::nz-input-group")
	private WebElement getbusinessName;

	@FindBy(xpath = "(//i[@nztype='down'])[2]")
	private WebElement businessTypeDrpdwn;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[3]")
	private WebElement selectBusinessTypeDrpdwn;

	@FindBy(xpath = "//label[text()='Annual turnover *']//parent::nz-form-label/following-sibling::nz-input-group")
	private WebElement getAnnualTurnOver;

	@FindBy(xpath = "(//i[@nztype='down'])[3]")
	private WebElement anualTurnoverDrpdwn;

	@FindBy(xpath = "//div[text()='5-10 Lakhs']")
	private WebElement selectAnualTurnover;

	@FindBy(xpath = "//input[@formcontrolname='mobile_number']")
	private WebElement mobileNumberTxt;

	@FindBy(xpath = "//input[@formcontrolname='pan_number']")
	private WebElement panNumberTxt;

	@FindBy(xpath = "//label[text()='Business doc type *']//parent::nz-form-label/following-sibling::nz-input-group")
	private WebElement getBusinessDocType;

	@FindBy(xpath = "//nz-select-arrow[@class='ant-select-arrow ng-tns-c80-4 ng-star-inserted']")
	private WebElement businessDocTypeDrpdwn;

	@FindBy(xpath = "//div[text()='GST']")
	private WebElement selectBusinessDocType;

	@FindBy(css = "input[formcontrolname=\"business_proof_doc_number\"]")
	private WebElement businessProofNo;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement Businessdetailsbtn;

	@FindBy(xpath = "//nz-select-top-control[@class='ant-select-selector ng-tns-c80-15']//nz-select-item[1]")
	private WebElement businessDetailsDrpdwn;

	@FindBy(xpath = "//div[text()='Udyam Certificate']")
	private WebElement selectBusinessType;

	@FindBy(xpath = "//input[@class='hide_file ng-star-inserted']")
	private WebElement businessChooseFile;

	@FindBy(xpath = "//button[contains(@class,'ant-btn login-form-button')]")
	private WebElement btnBusinessDetailsUpload;

	public EciBusinessDetailsPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnBusinessDetailsTab() {
		logger.info("Starting of clickOnBusinessDetailsTab method");

		this.btnBusinessDetailsTab.click();

		logger.info("Ending of clickOnBusinessDetailsTab method");
	}

	public String getBusinessDetailsTxt() {
		logger.info("Starting of getBusinessDetailsTxt method");

		logger.info("Ending of getBusinessDetailsTxt method");
		return lblBusinessDetailsTxt.getText();

	}

	public void clickOnEditbtn() {
		logger.info("Starting of clickOnEditbtn method");

		this.btnBusinessEdit.click();

		logger.info("Ending of clickOnEditbtn method");
	}

	public void getBusinessName() {
		logger.info("Starting of enterBusinessName method");

		System.out.println(this.businessNameTxt.getAttribute("value"));

		logger.info("Ending of enterBusinessName method");
	}

	public void getEntityType() {
		logger.info("Starting of geteEntityType method");

		System.out.println(this.getEntityType.getText());
		
		logger.info("Ending of geteEntityType method");
	}

	public void getDateOfIncorporation() {
		logger.info("Starting of getDateOfIncorporation method");

		System.out.println(this.setDateOfIncrption.getAttribute("value"));

		logger.info("Ending of getDateOfIncorporation method");
	}

	public void getBusinessType() {
		logger.info("Starting of getBusinessType method");

		System.out.println(this.getbusinessName.getText());

		logger.info("Ending of getBusinessType method");
	}

	public void getAnnualTurnover() {
		logger.info("Starting of getAnnualTurnover method");

		System.out.println(this.getAnnualTurnOver.getText());

		logger.info("Ending of getAnnualTurnover method");
	}

	public void getMobileNumber() {
		logger.info("Starting of getMobileNumber method");

		System.out.println(this.mobileNumberTxt.getAttribute("value"));

		logger.info("Ending of getMobileNumber method");
	}

	public void getPanNumber() {
		logger.info("Starting of getPanNumber method");

		System.out.println(this.panNumberTxt.getAttribute("value"));

		logger.info("Ending of getPanNumber method");
	}

	public void getBusinessDocType() {
		logger.info("Starting of getBusinessDocType method");

		System.out.println(this.getBusinessDocType.getText());

		logger.info("Ending of getBusinessDocType method");
	}

	public void getBusinessProofDocNumber() {
		logger.info("Starting of getBusinessProofDocNumber method");

		System.out.println(this.businessProofNo.getAttribute("value"));

		logger.info("Ending of getBusinessProofDocNumber method");
	}

	public void getBusinessdetails() {

		logger.info("Starting of getBusinessdetailsTab method");

		this.clickOnBusinessDetailsTab();
		this.scrollDown(500);
		this.clickOnEditbtn();
		this.getBusinessName();
		this.getEntityType();
		this.getDateOfIncorporation();
		this.getBusinessType();
		this.getAnnualTurnover();
		this.getMobileNumber();
		this.getPanNumber();
		this.scrollDown(100);
		this.getBusinessDocType();		
		this.getBusinessProofDocNumber();

		logger.info("Ending of getBusinessdetailsTab method");
	}

	public void setBusinessName(String businessName) {
		logger.info("Starting of setBusinessName method");

		this.businessNameTxt.click();
		this.businessNameTxt.clear();
		this.businessNameTxt.sendKeys(businessName);

		logger.info("Ending of setBusinessName method");
	}

	public void setSelectEntityType() {
		logger.info("Starting of setSelectEntityType method");

		this.entityTypeDrpdwn.click();
		this.selectEntitiyType.click();

		logger.info("Ending of setSelectEntityType method");
	}

	public void setDateOfIncorporation(String dateOfIncorporation) {
		logger.info("Starting of setDateOfIncorporation method");

		this.setDateOfIncrption.click();
		this.setDateOfIncrption.clear();
		this.setDateOfIncrption.sendKeys(dateOfIncorporation);

		logger.info("Ending of setDateOfIncorporation method");
	}

	public void selectBusinessType() {
		logger.info("Starting of selectBusinessType method");

		this.businessTypeDrpdwn.click();
		this.selectBusinessTypeDrpdwn.click();

		logger.info("Ending of selectBusinessType method");
	}

	public void selectAnnualTurnover() {
		logger.info("Starting of selectAnnualTurnover method");

		this.anualTurnoverDrpdwn.click();
		this.selectAnualTurnover.click();

		logger.info("Ending of selectAnnualTurnover method");
	}

	public void setMobileNumber(String mobileNumber) {
		logger.info("Starting of setMobileNumber method");

		this.mobileNumberTxt.click();
		this.mobileNumberTxt.clear();
		this.mobileNumberTxt.sendKeys(mobileNumber);

		logger.info("Ending of setMobileNumber method");
	}

	public void setPanNumber(String panNumber) {
		logger.info("Starting of setPanNumber method");

		this.panNumberTxt.click();
		this.panNumberTxt.clear();
		this.panNumberTxt.sendKeys(panNumber);

		logger.info("Ending of setPanNumber method");
	}

	public void selectBusinessDocType() {
		logger.info("Starting of selectBusinessDocType method");

		this.businessDocTypeDrpdwn.click();
		this.selectBusinessDocType.click();

		logger.info("Ending of selectBusinessDocType method");
	}

	public void setBusinessProofDocNumber(String businessProofDocNumber) {
		logger.info("Starting of setBusinessProofDocNumber method");

		this.businessProofNo.click();
		this.businessProofNo.clear();
		this.businessProofNo.sendKeys(businessProofDocNumber);

		logger.info("Ending of setBusinessProofDocNumber method");
	}

	public void clickOnBusinessUpdateDetails() {
		logger.info("Starting of enterBusinessProofDocNumber method");

		this.Businessdetailsbtn.click();

		logger.info("Ending of enterBusinessProofDocNumber method");
	}

	public void clickOnBusinesstSelectDoumentDropDown() {
		logger.info("Starting of clickOnBusinesstSelectDoumentDropDown method");

		this.businessDetailsDrpdwn.click();

		logger.info("Ending of clickOnBusinesstSelectDoumentDropDown method");

	}

	public void BusinessSelectFileType() {
		logger.info("Starting of BusinessSelectFileType method");

		this.selectBusinessType.click();

		logger.info("Ending of BusinessSelectFileType method");

	}

	public void clickOnBusinessChooseClickToUploadFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnBusinessChooseClickToUploadFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			businessChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			businessChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			businessChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnBusinessChooseClickToUploadFile method");
	}

	public void clickOnBusinessDetailsUploadButton() {
		logger.info("Starting of clickOnBusinessDetailsUploadButton method");

		this.btnBusinessDetailsUpload.click();

		logger.info("Ending of clickOnBusinessDetailsUploadButton method");

	}

	public void setBusinessdetails(String businessName, String dateOfIncorporation, String mobileNumber,
			String panNumber, String businessProofDocNumber) {

		logger.info("Starting of setBusinessdetailsTab method");

		this.clickOnBusinessDetailsTab();
		this.scrollDown(500);
		this.clickOnEditbtn();
		this.setBusinessName(businessName);
		this.setSelectEntityType();
		this.setDateOfIncorporation(dateOfIncorporation);
		this.selectBusinessType();
		this.selectAnnualTurnover();
		this.setMobileNumber(mobileNumber);
		this.setPanNumber(panNumber);
		this.selectBusinessDocType();
		this.setBusinessProofDocNumber(businessProofDocNumber);
		this.clickOnBusinessUpdateDetails();
		this.clickOnBusinessDetailsTab();
		this.scrollDown(500);
		this.clickOnBusinesstSelectDoumentDropDown();
		this.BusinessSelectFileType();
		/*
		 * this.clickOnBusinessChooseClickToUploadFile(testDataprop.getProperty(
		 * UPLOAD_BANK_DOCUMENTS)); this.clickOnBusinessDetailsUploadButton();
		 */

		logger.info("Starting of setBusinessdetailsTab method");
	}

}
