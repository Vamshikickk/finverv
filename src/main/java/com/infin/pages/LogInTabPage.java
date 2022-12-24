package com.infin.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.infin.Base.BaseFinvervPage;

public class LogInTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(LogInTabPage.class.getName());

	@FindBy(xpath = "//h3[@class='mrBottom40 ant-typography']")
	private WebElement lblSignIn;

	@FindBy(css = "input[placeholder='Username']")
	private WebElement txtUserName;

	@FindBy(css = "input[placeholder='Password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@class='ant-btn button ant-btn-primary']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='ant-menu-submenu-title']//child::span")
	private WebElement lblWelcomeTxt;

	@FindBy(xpath = "//span[text()='invalid username/password']")
	private WebElement lblInvalidDetails;

	@FindBy(xpath = "//i[@class='anticon anticon-setting']")
	private WebElement settingsIcon;

	@FindBy(xpath = "//li[@class='ant-menu-item' and text()='Logout']")
	private WebElement btnLogout;

	public LogInTabPage(WebDriver driver) {
		super(driver);

		logger.info("Starting of LogInTabPage method");

		PageFactory.initElements(driver, this);

		logger.info("Ending of LogInTabPage method");

	}

	public String getSignInText() {
		logger.info("Starting of getSignInText method");

		System.out.println(lblSignIn.getText());

		logger.info("Ending of getSignInText method");
		return lblSignIn.getText();

	}

	public void setUserName(String Uname) {
		logger.info("Starting of setUsername method");

		this.txtUserName.clear();
		this.txtUserName.sendKeys(Uname);

		logger.info("Ending of setUsername method");

	}

	public void setPassword(String Password) {
		logger.info("Starting of setPassword method");

		this.txtPassword.clear();
		this.txtPassword.sendKeys(Password);

		logger.info("Ending of setPassword method");
	}

	public void clickOnLoginButton() {
		logger.info("Starting of clickOnLoginButton method");

		this.btnLogin.click();

		logger.info("Ending of clickOnLoginButton method");
	}

	public void loginToFinverv(String username, String password) {
		logger.info("Starting of loginToFinverv method");

		this.setUserName(username);
		this.setPassword(password);
		this.clickOnLoginButton();

		logger.info("Ending of loginToFinverv method");
	}

	public void logOut() {
		logger.info("Starting of logOut method");

		this.settingsIcon.click();
		this.btnLogout.click();

		logger.info("Ending of logOut method");

	}

	public String getLblWelcomeTxt() {
		logger.info("Starting of getLblWelcomeTxt method");

		logger.info("Ending of getLblWelcomeTxt method");
		return lblWelcomeTxt.getText();

	}

	public String getInvalidcredLabel() {
		logger.info("Starting of getInvalidcredText method");

		logger.info("Ending of getInvalidcredText method");
		return lblInvalidDetails.getText();

	}
}
