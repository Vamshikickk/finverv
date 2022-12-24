package com.infin.users.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class VerifyUsersModulePage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(VerifyUsersModulePage.class.getName());

	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='Users']")
	private WebElement usersModule;

	@FindBy(id = "add_user")
	private WebElement btnCreateNewUser;

	@FindBy(id = "user_first_name")
	private WebElement txtFirstName;

	@FindBy(id = "user_last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_username")
	private WebElement txtUserName;

	@FindBy(id = "user_email")
	private WebElement txtEmail;

	@FindBy(id = "user_mobile")
	private WebElement txtMobileNo;

	@FindBy(id = "user_submit")
	private WebElement btnsubmit;

	public VerifyUsersModulePage(WebDriver driver) {
		super(driver);

	}

	public void setCreateNewUserDetails() {
		logger.info("Strating of setCreateNewUserDetails method");

		this.clickOnElement(usersModule);
		this.clickOnElement(btnCreateNewUser);

		this.clickOnElement(txtFirstName);
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys("vamshi");

		this.txtLastName.click();
		this.txtLastName.clear();
		this.txtLastName.sendKeys("krishna");

		this.txtUserName.click();
		this.txtUserName.clear();
		this.txtUserName.sendKeys("vamshikrishna");

		this.txtEmail.click();
		this.txtEmail.clear();
		this.txtEmail.sendKeys("vamshi.varimadla123@gmail.com");

		this.txtMobileNo.click();
		this.txtMobileNo.clear();
		this.txtMobileNo.sendKeys("9703842998");

		this.clickOnElement(btnsubmit);

		logger.info("ending of setCreateNewUserDetails method");

	}

}
