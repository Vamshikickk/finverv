
package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciPermanentAddressTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciPermanentAddressTabPage.class.getName());

	@FindBy(xpath = "(//div[@role='button'])[2]")
	private WebElement btnPermanentaddress;

	@FindBy(xpath = "(//div[@class='ant-collapse-content-box ng-tns-c86-1']//following::a)[1]")
	private WebElement btnPermanentAddressAdd;

	@FindBy(xpath = "//h2[text()='permanent Address']")
	private WebElement LblPermanentTxt;

	@FindBy(xpath = "//input[@formcontrolname='address_line_1']")
	private WebElement addressln1;

	@FindBy(xpath = "//input[@formcontrolname='pincode']")
	private WebElement pincode;

	@FindBy(xpath = "//input[@formcontrolname='vintage']")
	private WebElement residingyear;

	@FindBy(css = "nz-select-search[class=\"ant-select-selection-search ng-star-inserted\"]")
	private WebElement residingYearDrpdwn;

	@FindBy(xpath = "//div[text()='Family']")
	private WebElement selectownershiptype;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement btnUpdtaddress;

	/*
	 * @FindBy(xpath = "(//i[@nztype='down'])[2]") private WebElement
	 * permanentAddressDocumentDrpdwn;
	 * 
	 * @FindBy(xpath = "//div[text()='Utility Bill']") private WebElement
	 * PermanentAdreesselectDocumentType;
	 * 
	 * @FindBy(xpath = "//input[@type='file']") private WebElement
	 * choosePermanentFile;
	 * 
	 * @FindBy(xpath = "//button[contains(@class,'ant-btn login-form-button')]")
	 * private WebElement btnPermanentUpload;
	 */
	public EciPermanentAddressTabPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnBtnPermanentaddress() {
		logger.info("Strating of clickOnBtnPermanentaddress method");

		this.btnPermanentaddress.click();

		logger.info("Ending of clickOnBtnPermanentaddress method");
	}

	public void clickOnBtnPermanentAddressAdd() {
		logger.info("Strating of clickOnBtnPermanentAddressAdd method");

		this.btnPermanentAddressAdd.click();

		logger.info("Ending of clickOnBtnPermanentAddressAdd method");
	}

	public void getLblPermanentTxt() {
		logger.info("Strating of getLblPermanentTxt method");

		System.out.println(this.LblPermanentTxt.getText());

		logger.info("Ending of getLblPermanentTxt method");
	}

	public void getTxtaddressln1() {
		logger.info("Strating of getTxtaddressln1 method");

		System.out.println(this.addressln1.getAttribute("value"));

		logger.info("Ending of getTxtaddressln1 method");
	}

	public void getTxtpincode() {
		logger.info("Strating of getTxtpincode method");

		System.out.println(this.pincode.getAttribute("value"));

		logger.info("Ending of getTxtpincode method");
	}

	public void getResidingYearTxt() {
		logger.info("Strating of getResidingYearTxt method");

		System.out.println(this.residingyear.getAttribute("value"));

		logger.info("Ending of getResidingYearTxt method");
	}

	public void getGetTxtselectownershiptype() {
		logger.info("Strating of getGetTxtselectownershiptype method");

		System.out.println(this.selectownershiptype.getText());

		logger.info("Ending of getGetTxtselectownershiptype method");
	}

	public void getPermanentAddressDetails() {
		logger.info("Starting of getPermanentAddressDetails method");

		this.clickOnBtnPermanentaddress();
		this.clickOnBtnPermanentAddressAdd();
		this.getLblPermanentTxt();
		this.getTxtaddressln1();
		this.getTxtpincode();
		this.getResidingYearTxt();
		this.getGetTxtselectownershiptype();

		logger.info("Ending of getPermanentAddressDetails method");

	}

	public void getPermanentTxt() {
		logger.info("Starting of getPermanentTxt method");

		System.out.println(this.LblPermanentTxt.getText());

		logger.info("Ending of getPermanentTxt method");
	}

	public void setAddressln1(String addressLine1) {
		logger.info("Starting of setAddressln1 method");

		this.addressln1.click();
		this.addressln1.clear();
		this.addressln1.sendKeys(addressLine1);

		logger.info("Ending of setAddressln1 method");
	}

	public void setPincode(String pincode) {
		logger.info("Starting of setPincode method");

		this.pincode.click();
		this.pincode.clear();
		this.pincode.sendKeys(pincode);

		logger.info("Ending of setPincode method");
	}

	public void setResidingYear(String residingYear) {
		logger.info("Starting of setResidingYear method");

		this.residingyear.click();
		this.residingyear.clear();
		this.residingyear.sendKeys(residingYear);

		logger.info("Ending of setResidingYear method");
	}

	public void setGetselectownershiptype() {
		logger.info("Starting of setGetselectownershiptype method");

		this.residingYearDrpdwn.click();
		this.selectownershiptype.click();

		logger.info("Ending of setGetselectownershiptype method");
	}

	public void setPermanentAddressDetails(String addressLine1, String pincode, String residingYear) {
		logger.info("Starting of setPermanentAddressDetails method");

		this.clickOnBtnPermanentaddress();
		this.clickOnBtnPermanentAddressAdd();
		this.getPermanentTxt();
		this.setAddressln1(addressLine1);
		this.setPincode(pincode);
		this.setResidingYear(residingYear);
		this.setGetselectownershiptype();

		logger.info("Ending of setPermanentAddressDetails method");

	}

}
