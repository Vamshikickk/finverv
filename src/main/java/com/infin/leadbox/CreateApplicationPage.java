package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class CreateApplicationPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(CreateApplicationPage.class.getName());

	@FindBy(linkText = "Lead Box")
	private WebElement btnLeadBox;

	@FindBy(id = "create_application")
	private WebElement btnCreateNewApplication;

	@FindBy(id = "mobile")
	private WebElement txtMobileno;

	@FindBy(id = "pincode")
	private WebElement txtPcode;

	@FindBy(id = "submit")
	private WebElement btnSubmit;

	@FindBy(xpath = "//span[text()='mobile-Invalid Mobile Number']")
	private WebElement InavlidMobileTxt;

	@FindBy(xpath = "//span[text()='pin_code-Invalid Pincode Shared']")
	private WebElement InavlidPincodeTxt;

	@FindBy(xpath = "//span[text()='Application Created.']")
	private WebElement ValidCredentialLblTxt;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='REFERENCE']")
	private WebElement lblReference;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='NAME']")
	private WebElement lblName;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='PHONE']")
	private WebElement lblPno;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='EMAIL']")
	private WebElement lblEmail;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='PINCODE']")
	private WebElement lblPincode;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']/child::th[text()='STATUS']")
	private WebElement lblStatus;

	@FindBy(id = "leadBox_filter_mobile")
	private WebElement mobilenoFltr;

	@FindBy(id = "leadBox_filter_status")
	private WebElement statusFlterBlock;

	@FindBy(xpath = "(//nz-option-item[@title='Application Added']//div)[1]")
	private WebElement selectStatusFltr;

	@FindBy(id = "leadBox_filter_submit")
	private WebElement searchicon;

	@FindBy(id = "lead_details_0a11d3fd-e999-43ed-b3e4-10405ff08f10")
	private WebElement reference;

	@FindBy(id = "leadBox_filter_reset")
	private WebElement Eraseicon;

	public CreateApplicationPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnLeadBox() {
		logger.info("Starting of clickOnLeadBox method");

		this.btnLeadBox.click();

		logger.info("Ending of clickOnLeadBox method");
	}

	public void clickOnCreateNewApplicationbtn() {
		logger.info("Starting of createNewApplication method ");

		this.clickOnElement(btnCreateNewApplication);

		logger.info("Ening of createNewApplication method");
	}

	public void enterMblNo() {
		logger.info("Starting of enterMblNo method");

		this.txtMobileno.click();
		this.txtMobileno.clear();
		this.txtMobileno.sendKeys("9989" + this.randomNumber(6));

		logger.info("Ending of enterMblNo method");
	}

	public void enterPincode(String pincode) {
		logger.info("Starting of enterPincode method");

		this.txtPcode.click();
		this.txtPcode.clear();
		this.txtPcode.sendKeys(pincode);

		logger.info("Ending of enterPincode method");
	}

	public void enterValidCredentials(String pincode) {
		logger.info("Strating of createNewApplication method");

		this.clickOnLeadBox();
		this.clickOnCreateNewApplicationbtn();
		this.enterMblNo();
		this.enterPincode(pincode);
		this.clickOnSubmitButton();

		logger.info("Ending of createNewApplication method");
	}

	public void createApplication(String mobileNumber, String pincode) {

		this.btnLeadBox.click();
		this.btnCreateNewApplication.click();
		this.txtMobileno.click();
		this.txtMobileno.clear();
		this.txtMobileno.sendKeys(mobileNumber);
		this.txtPcode.click();
		this.txtPcode.clear();
		this.txtPcode.sendKeys(pincode);
		this.btnSubmit.click();

	}

	public void clickOnSubmitButton() {
		logger.info("Starting of clickOnSubmitButton method");

		this.btnSubmit.click();

		logger.info("Ending of clickOnSubmitButton method");
	}

	public String getinvalidmobilenumbertext() {
		logger.info("Starting of getinvalidmobilenumbertext method");

		logger.info("Ending of getinvalidmobilenumbertext method");
		return InavlidMobileTxt.getText();

	}

	public String getlblInavlaidPincodeText() {
		logger.info("Starting of getlblInavlaidPincodeText method");

		logger.info("Ending of getlblInavlaidPincodeText method");
		return InavlidPincodeTxt.getText();
	}

	public String getRefText() {
		logger.info("Starting of getRefText method ");

		logger.info("Ending of getRefText method");
		return lblReference.getText();

	}

	public String getNameText() {
		logger.info("Starting of getNametab method");

		logger.info("Ending of getNametab method");
		return lblName.getText();
	}

	public String getPnoText() {
		logger.info("Starting of getPnotab method");

		logger.info("Ending of getPnotab method");
		return lblPno.getText();

	}

	public String getEmailText() {
		logger.info("Starting of getEmailText method");

		logger.info("Ending of getEmailText method");
		return lblEmail.getText();
	}

	public String getPcodeText() {
		logger.info("Starting of getPcodeText method");

		logger.info("Ending of getPcodeText method");
		return lblPincode.getText();
	}

	public String getStatusText() {
		logger.info("Starting of getStatusText method");

		logger.info("Ending of getStatusText method");
		return lblStatus.getText();
	}

	public String gettableColoumnNames() {
		logger.info("Starting of gettableColoumnNames method");

		this.getRefText();
		this.getNameText();
		this.getPnoText();
		this.getEmailText();
		this.getPcodeText();
		this.getStatusText();

		logger.info("Ending of gettableColoumnNames method");
		return null;

	}

	public void clickOnMblNumFltr(String mobileNo) {
		logger.info("Starting of clickOnMblNumFltr method");

		this.mobilenoFltr.click();
		this.mobilenoFltr.clear();
		this.mobilenoFltr.sendKeys(mobileNo);

		logger.info("Ending of clickOnMblNumFltr method");

	}

	public String getValidCredentialslblText() {
		logger.info("Starting of getValidCredentialslblText method");

		logger.info("Ending of getValidCredentialslblText method");
		return ValidCredentialLblTxt.getText();

	}

	public void clickOnSelectDropDown() {
		logger.info("Starting of clickOnSelectDropDown method");

		this.statusFlterBlock.click();
		this.selectStatusFltr.click();

		logger.info("Ending of clickOnSelectDropDown method");
	}

	public void clickOnSearchIcon() {
		logger.info("Starting of clickOnSearchBox method");

		this.searchicon.click();

		logger.info("Ending of clickOnSearchBox method ");
	}

	public void clickOnRefrencelink(int count) {
		logger.info("Starting of clickOnReference method");
		try {
			for (int i = 0; i < count; i++) {
				this.reference.click();
			}
		} catch (Exception e) {

		}

		logger.info("Ending of clickOnReference method");
	}

	public void openApplication(String mobileNo) {
		logger.info("Starting of openApplication method");

		this.clickOnMblNumFltr(mobileNo);
		this.clickOnElement(searchicon);
		this.clickOnRefrencelink(5);

		logger.info("Ending of openApplication method");

	}

	public void openApplicationWithInvalidAndValidData(String invalidMobileNo, String mobileNo) {
		logger.info("Starting of openApplication method");

		this.clickOnMblNumFltr(invalidMobileNo);
		this.clickOnElement(searchicon);
		this.clickOnMblNumFltr(mobileNo);
		this.clickOnElement(searchicon);
		this.clickOnRefrencelink(5);

		logger.info("Ending of openApplication method");

	}

}
