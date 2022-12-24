package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class GstDetailsPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(GstDetailsPage.class.getName());

	@FindBy(xpath = "//a[text()='GST Details']")
	private WebElement btnGstDetails;

	@FindBy(xpath = "//span[text()='GST Details']")
	private WebElement lbltxtGstDetails;

	@FindBy(id = "open_gst_details")
	private WebElement gstDetailsEditIcon;

	@FindBy(id = "gst_number")
	private WebElement txtGstNumber;

	@FindBy(xpath = "//span[text()='GST not valid.']")
	private WebElement invalidGstNumberValidationTxt;

	@FindBy(id = "gst_turnover")
	private WebElement txtGstTurnOver;

	@FindBy(xpath = "//span[text()='gst_turnover-A Valid Number Is Required.']")
	private WebElement invalidGstTurnOverValidationTxt;

	@FindBy(id = "submit_gst_details")
	private WebElement btnUpdateGstDetails;

	@FindBy(id = "gst_username")
	private WebElement txtGstUserName;

	@FindBy(id = "gst_password")
	private WebElement txtGstPassword;

	@FindBy(xpath = "//nz-date-picker[@id='gst_start_at']//div/input")
	private WebElement txtGstStartAt;

	@FindBy(xpath = "//span[text()='Pull GST Data']")
	private WebElement lblPullGstData;

	@FindBy(xpath = "//nz-date-picker[@id='gst_end_at']//div/input")
	private WebElement txtGstEndAt;

	@FindBy(id = "pullGSTData")
	private WebElement btnGstDetailsSubmit;

	public GstDetailsPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnGstDetailstab() {
		logger.info("Starting of clickOnGstDetailstab method");

		this.btnGstDetails.click();

		logger.info("Ending of clickOnGstDetailstab method");
	}

	public String getLblGstaDetailsTxt() {
		logger.info("Starting of getLblGstaDetailsTxt method");

		logger.info("Ending of getLblGstaDetailsTxt method");
		return lbltxtGstDetails.getText();
	}

	public void clickOnGstDetaisEditIcon() {

		logger.info("Strting of clickonGstDetailsEditIcon method");

		this.clickOnElement(gstDetailsEditIcon);

		logger.info("Ending of clickonGstDetailsEditIcon method");
	}

	public void setGstNumber(String gstNumber) {

		logger.info("Strting of setGstNumber method");

		this.txtGstNumber.click();
		this.txtGstNumber.clear();
		this.txtGstNumber.sendKeys(gstNumber);

		logger.info("Ending of setGstNumber method");
	}

	public String getLblinvalidGstNumberTxt() {
		logger.info("Starting of getLblinvalidGstNumberTxt method");

		logger.info("Ending of getLblinvalidGstNumberTxt method");
		return invalidGstNumberValidationTxt.getText();
	}

	public void setGstTurnOver(String gstTurnover) {

		logger.info("Strting of setGstTurnOver method");

		this.txtGstTurnOver.click();
		this.txtGstTurnOver.clear();
		this.txtGstTurnOver.sendKeys(gstTurnover);

		logger.info("Ending of setGstTurnOver method");
	}

	public String getLblinvalidGstTurnoverTxt() {
		logger.info("Starting of getLblinvalidGstTurnoverTxt method");

		logger.info("Ending of getLblinvalidGstTurnoverTxt method");
		return invalidGstTurnOverValidationTxt.getText();
	}

	public void clickOnUpdateGstDetailsButton() {

		logger.info("Strting of clickOnUpdateGstDetailsButton method");

		this.btnUpdateGstDetails.click();

		logger.info("Ending of clickOnUpdateGstDetailsButton method");
	}

	public void setGstCredentials(String gstUsername, String gstPassword) {
		logger.info("Starting of setGstCredentials method");

		this.clickOnElement(txtGstUserName);
		this.txtGstUserName.clear();
		this.txtGstUserName.sendKeys(gstUsername);
		this.txtGstPassword.click();
		this.txtGstPassword.clear();
		this.txtGstPassword.sendKeys(gstPassword);

		logger.info("Ending of setGstCredentials method");
	}

	public void setGstStartDate(String startDate) {
		logger.info("Starting of setGstStartDate method");

		this.clickOnElement(txtGstStartAt);
		this.txtGstStartAt.clear();
		this.txtGstStartAt.sendKeys(startDate);
		this.clickOutside();

		logger.info("Ending of setGstStartDate method");
	}

	public void setGstEndDate(String endDate) {
		logger.info("Starting of setGstEndDate method");

		this.clickOnElement(txtGstEndAt);
		this.txtGstEndAt.clear();
		this.txtGstEndAt.sendKeys(endDate);

		logger.info("Ending of setGstEndDate method");

	}
	public void clickOnSubmitButton() {
		logger.info("Starting of clickOnSubmitButton method");

		this.btnGstDetailsSubmit.click();
		logger.info("Ending of clickOnSubmitButton method");
	}
	
	public void setGstDetails(String gstNumber, String gstTurnover) {
		logger.info("Starting of setGstDetails method");
	
		this.clickOnGstDetaisEditIcon();
		this.setGstNumber(gstNumber);
		this.setGstTurnOver(gstTurnover);
		this.clickOnUpdateGstDetailsButton();
		
		logger.info("Ending of setGstDetails method");
	}
	public void setPullGstData(String startGstDate, String endGstDate) {
		logger.info("Starting of setPullGstData method");
		
		this.setGstStartDate(startGstDate);
		this.setGstEndDate(endGstDate);
		this.clickOnSubmitButton();
		
		logger.info("Ending of setPullGstData method");
	}

	

	
}
