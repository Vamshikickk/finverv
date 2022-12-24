package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciCompanyAddressTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciCompanyAddressTabPage.class.getName());

	@FindBy(xpath = "//div[text()='Company Address']")
	private WebElement btncompanyaddress;

	@FindBy(xpath = "(//span[contains(text(),'Edit')])[5]")
	private WebElement btnedit;

	@FindBy(xpath = "//input[@formcontrolname='address_line_1']")
	private WebElement addressline1;

	@FindBy(xpath = "//input[@formcontrolname='pincode']")
	private WebElement pincode;

	@FindBy(xpath = "//input[@formcontrolname='vintage']")
	private WebElement operatingsince;

	@FindBy(xpath = "//label[text()='Ownership type *']//parent::nz-form-label/parent::nz-form-item/child::nz-input-group")
	private WebElement getOwnershiptype;

	@FindBy(xpath = "//nz-select-arrow[@class='ant-select-arrow ng-tns-c80-0 ng-star-inserted']")
	private WebElement ownershiptypedropdown;

	@FindBy(xpath = "//div[text()='Owned']")
	private WebElement selectownership;

	@FindBy(xpath = "//span[text()='Update Address']")
	private WebElement btnupdateaddress;

	public EciCompanyAddressTabPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnCompanyAddressTab() {
		logger.info("Starting of clickOnCompanyAddressTab method");

		this.btncompanyaddress.click();

		logger.info("Ending of clickOnCompanyAddressTab method");
	}

	public void clickOnEditbtn() {
		logger.info("Starting of clickOnEditbtn method");

		this.btnedit.click();

		logger.info("Ending of clickOnEditbtn method");
	}

	public void setAddressLine1(String addressLine1) {
		logger.info("Starting of setAddressLine1 method");

		this.addressline1.sendKeys(addressLine1);

		logger.info("Ending of setAddressLine1 method");
	}

	public void setPincode(String pincode) {
		logger.info("Starting of enterPincode method");

		this.pincode.sendKeys(pincode);

		logger.info("Ending of enterPincode method");
	}

	public void setOperatingSinceYear(String year) {
		logger.info("Starting of enterOperatingSinceYear method");

		this.operatingsince.sendKeys(year);

		logger.info("Ending of enterOperatingSinceYear method");
	}

	public void selectOwnerShipType() {
		logger.info("Starting of selectOwnerShipType method");

		this.ownershiptypedropdown.click();
		this.selectownership.click();

		logger.info("Ending of selectOwnerShipType method");
	}

	public void clickOnUpdateAddressBtn() {
		logger.info("Starting of clickOnUpdateAddressBtn method");

		this.btnupdateaddress.click();

		logger.info("Ending of clickOnUpdateAddressBtn method");
	}

	public void setCompanyDetails(String addressLine1, String pincode, String operatingSince) {

		this.clickOnCompanyAddressTab();
		this.clickOnEditbtn();
		this.setAddressLine1(addressLine1);
		this.setPincode(pincode);
		this.setOperatingSinceYear(operatingSince);
		this.selectOwnerShipType();
		this.clickOnUpdateAddressBtn();

	}

	public void getAddressLine1() {
		logger.info("Starting of getAddressLine1 method");

		System.out.println(this.addressline1.getAttribute("value"));

		logger.info("Ending of getAddressLine1 method");
	}

	public void getPincode() {
		logger.info("Starting of getPincode method");

		System.out.println(this.pincode.getAttribute("value"));

		logger.info("Ending of getPincode method");
	}

	public void getOperatingSinceYear() {
		logger.info("Starting of getOperatingSinceYear method");

		System.out.println(this.operatingsince.getAttribute("value"));

		logger.info("Ending of getOperatingSinceYear method");
	}

	public void getOwnerShipType() {
		logger.info("Starting of selectOwnerShipType method");

		System.out.println(this.getOwnershiptype.getText());

		logger.info("Ending of selectOwnerShipType method");

	}
	
	public void getCompanyDetails() {
		logger.info("Starting of getCompanyDetails method");

		this.clickOnCompanyAddressTab();
		this.clickOnEditbtn();
		this.getAddressLine1();
		this.getPincode();
		this.getOperatingSinceYear();
		this.getOwnerShipType();
		
		logger.info("Starting of getCompanyDetails method");

	}
}
