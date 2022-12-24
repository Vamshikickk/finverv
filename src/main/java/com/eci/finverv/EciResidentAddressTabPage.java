package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciResidentAddressTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciResidentAddressTabPage.class.getName());

	@FindBy(xpath = "(//div[@role='button'])[3]")
	private WebElement btnResidentAddressTab;

	@FindBy(xpath = "//app-document-buck[@class='ng-tns-c86-2']/preceding-sibling::div[@class='ng-star-inserted'] //a/span[@class='ng-star-inserted']")
	private WebElement btnResidentEdit;

	@FindBy(xpath = "//h2[text()='resident Address']")
	private WebElement lblResidentAddressTxt;

	@FindBy(xpath = "//input[@formcontrolname='address_line_1']")
	private WebElement Addressln1;

	@FindBy(xpath = "//input[@formcontrolname='pincode']")
	private WebElement pincode;

	@FindBy(xpath = "//input[@formcontrolname='vintage']")
	private WebElement residingyear;

	@FindBy(xpath = "//i[contains(@class,'anticon anticon-down')]")
	private WebElement ownershipTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Family']")
	private WebElement selectOwnershipType;

	@FindBy(xpath = "//button[contains(@class,'ant-btn login-form-button')]//span[1]")
	private WebElement btnUpdateAddress;

	@FindBy(xpath = "(//nz-select-item[@class='ant-select-selection-item ng-star-inserted'])[3]")
	private WebElement ResidentAdressDrpDwn;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[3]")
	private WebElement selectResidentAddressType;

	@FindBy(xpath = "//input[@class='hide_file ng-star-inserted']")
	private WebElement ResidentChooseFile;

	@FindBy(xpath = "//button[contains(@class,'ant-btn login-form-button')]")
	private WebElement btnResidentAddressUpload;

	public EciResidentAddressTabPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnBtnResidentAddressTab() {
		logger.info("Starting of clickOnBtnResidentAddressTab method");

		this.btnResidentAddressTab.click();

		logger.info("Ending of clickOnBtnResidentAddressTab method");
	}

	public void clickOnBtnResidentEdit() {
		logger.info("Starting of clickOnBtnResidentEdit method");

		this.btnResidentEdit.click();

		logger.info("Ending of clickOnBtnResidentEdit method");

	}

	public void getLblResidentTxt() {
		logger.info("Starting of getLblResidentTxt method");

		System.out.println(this.lblResidentAddressTxt.getText());

		logger.info("Ending of getLblResidentTxt method");
	}

	public void getTxtaddressln1() {
		logger.info("Starting of getTxtaddressln1 method");

		System.out.println(this.Addressln1.getAttribute("value"));

		logger.info("Ending of getTxtaddressln1 method");
	}

	public void getTxtpincode() {
		logger.info("Starting of getTxtpincode method");

		System.out.println(this.pincode.getAttribute("value"));

		logger.info("Ending of getTxtpincode method");
	}

	public void getResidingYearTxt() {
		logger.info("Starting of getResidingYearTxt method");

		System.out.println(this.residingyear.getAttribute("value"));

		logger.info("Ending of getResidingYearTxt method");
	}

	public void getGetTxtselectownershiptype() {
		logger.info("Starting of getGetTxtselectownershiptype method");

		System.out.println(this.selectOwnershipType.getText());

		logger.info("Starting of getGetTxtselectownershiptype method");
	}

	public void getResidentDetails() {
		logger.info("Starting of getResidentDetails method");

		this.clickOnBtnResidentAddressTab();
		this.clickOnBtnResidentEdit();
		this.getLblResidentTxt();
		this.getTxtaddressln1();
		this.getTxtpincode();
		this.getResidingYearTxt();
		this.getGetTxtselectownershiptype();

		logger.info("Ending of getResidentDetails method");

	}

	public void setaddressln1(String addressLine1) {
		logger.info("Starting of setaddressln1 method");

		this.Addressln1.click();
		this.Addressln1.clear();
		this.Addressln1.sendKeys(addressLine1);

		logger.info("Ending of setaddressln1 method");
	}

	public void setpincode(String pincode) {
		logger.info("Starting of setpincode method");

		this.pincode.click();
		this.pincode.clear();
		this.pincode.sendKeys(pincode);

		logger.info("Ending of setpincode method");
	}

	public void setResidingYear(String residingYear) {
		logger.info("Starting of setResidingYear method");

		this.residingyear.click();
		this.residingyear.clear();
		this.residingyear.sendKeys(residingYear);

		logger.info("Ending of setResidingYear method");
	}

	public void setselectownershiptype() {
		logger.info("Starting of setselectownershiptype method");

		this.ownershipTypeDrpdwn.click();
		this.selectOwnershipType.click();

		logger.info("Starting of setselectownershiptype method");
	}

	public void setResidentDetails(String addressLine1, String pincode, String residingYear) {
		logger.info("Starting of setResidentDetails method");

		this.clickOnBtnResidentAddressTab();
		this.clickOnBtnResidentEdit();
		this.getLblResidentTxt();
		this.setaddressln1(addressLine1);
		this.setpincode(pincode);
		this.setResidingYear(residingYear);
		this.setselectownershiptype();

		logger.info("Ending of setResidentDetails method");

	}
}
