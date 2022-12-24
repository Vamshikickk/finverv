package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciLogInPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciLogInPage.class.getName());

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtMobile;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement btnsignin;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtOtp;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement btnsigninotp;

	public EciLogInPage(WebDriver driver) {
		super(driver);

	}

	public void setMobileNumber(String mobileNumber) {
		logger.info("Starting of setMobileNumber method");

		this.txtMobile.sendKeys(mobileNumber);

		logger.info("Ending of setMobileNumber method");

	}

	public void clickOnSigninbtn() {
		logger.info("Starting of clickOnSigninbtn method");

		this.btnsignin.click();

		logger.info("Ending of clickOnSigninbtn method");

	}

	public void setOtp(String otp) {
		logger.info("Starting of setMobileNumber method");

		this.txtOtp.sendKeys(otp);

		logger.info("Ending of setMobileNumber method");

	}

	public void clickOnSignIn2btnb() {
		logger.info("Starting of clickOnSignIn2btnb method");

		this.btnsigninotp.click();

		logger.info("Ending of clickOnSignIn2btnb method");

	}

}