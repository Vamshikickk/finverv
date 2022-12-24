 package com.infin.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.infin.Base.BaseFinvervPage;

public class DashBoardTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(DashBoardTabPage.class.getName());

	@FindBy(xpath = "//ul[@class='menuAnt mainMenu fl ant-menu ant-menu-root ant-menu-dark ant-menu-horizontal']")
	private WebElement lblHeaderMenu;

	@FindBy(xpath = "//span[text()='Welcome,  ']")
	private WebElement lblWelcome;

	@FindBy(tagName = "iframe")
	private WebElement frmSwitch;

	@FindBy(xpath = "//h2[@class='h2 mr1 text-wrap']")
	private WebElement lblSummaryDashBoard;

	public DashBoardTabPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of DashBoardTabPage method");

		PageFactory.initElements(driver, this);

		logger.info("Ending of DashBoardTabPage method");

	}

	public String getHeaderMenuLabel() {
		logger.info("Starting of getHeaderMenuLabel method");

		logger.info("Ending of getHeaderMenuLabel method");
		return lblHeaderMenu.getText();

	}

	public String getWelcoemeLabel() {
		logger.info("Starting of getWelcoemeLabel method");

		logger.info("Ending of getWelcoemeLabel method");
		return lblWelcome.getText();

	}

	public void switchToIframe() {
		logger.info("Starting method of switchToIFrame ");

		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

		logger.info("Ending method of switchToIFrame ");
	}

	public String getDashBoardLabel() {
		logger.info("Starting method of getDashBoardLabel");

		logger.info("Ending method of getDashBoardLabel");
		return lblSummaryDashBoard.getText();

	}

}
