package com.infinModules.pages;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;
import com.infin.leadbox.PersonalDetailsTabPage;

public class VerifyModulesPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(VerifyModulesPage.class.getName());
	
	
	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='Dashboard']")
	private WebElement dashboardModule;

	@FindBy(tagName = "iframe")
	private WebElement switchToIframe;

	@FindBy(xpath = "//h2[text()='Summary Dashboard  Praman - DEV']")
	private WebElement getSummaryLblTxt;

	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='Lead Box']")
	private WebElement leadboxModule;

	@FindBy(id = "create_application")
	private WebElement btnCreateNewApplication;

	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='Portfolio']")
	private WebElement portfolioModule;

	@FindBy(xpath = "//h2[text()='Performance Overview Praman - DEV']")
	private WebElement getPerformanceTxt;

	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='Users']")
	private WebElement usersModule;

	@FindBy(id = "add_user")
	private WebElement getUserBtnTxt;

	@FindBy(xpath = "//li[@class='ant-menu-item']//child::a[text()='FinSmart']")
	private WebElement finsmartModule;

	@FindBy(id = "verify_pan_card")
	private WebElement getPancardTxt;

	@FindBy(xpath = "//i[@class='anticon anticon-setting']")
	private WebElement settingsIcon;

	@FindBy(xpath = "//li[@class='ant-menu-item' and text()='Logout']")
	private WebElement btnLogout;

	@FindBy(xpath = "//div//ul/li")
	private WebElement tabs;

	

	public VerifyModulesPage(WebDriver driver) {
		super(driver);

	}

	public void sss() {
		driver.findElement(By.xpath("//a[text()='Lead Box']")).click();
		driver.findElement(By.xpath("//a[text()='PRAI-oKyFfJ']")).click();
		driver.findElement(By.xpath("(//img[@class='editicon'])[1]")).click();
	}

	public Object[] collection() throws IOException {

		List<WebElement> element = driver.findElements(By.xpath("//input[@type='text']"));
		
		for (int i = 0 ; i<=element.size();i++) {
			for (int j = 0 ; j<=i;j++) {
				String [][]s= getDataFromExcel(TEST_FILE_PATH, TEST_FILE_PATH);
				element.get(i).sendKeys(s[i][j]);
			}
		}
		return null;
	}


	public void verifytheModules() {
		logger.info("starting of verifytheModules method");

		this.dashboardModule.click();
		driver.switchTo().frame(switchToIframe);
		this.clickOnElement(getSummaryLblTxt);
		System.out.println(this.getSummaryLblTxt.getText());
		driver.switchTo().defaultContent();

		this.clickOnElement(leadboxModule);
		System.out.println(this.btnCreateNewApplication.getText());

		this.clickOnElement(portfolioModule);
		driver.switchTo().frame(switchToIframe);
		this.clickOnElement(getPerformanceTxt);
		System.out.println(this.getPerformanceTxt.getText());
		driver.switchTo().defaultContent();

		this.clickOnElement(usersModule);
		System.out.println(this.getUserBtnTxt.getText());

		this.clickOnElement(finsmartModule);
		System.out.println(this.getPancardTxt.getText());

		Actions actions = new Actions(driver);
		actions.moveToElement(settingsIcon).build().perform();
		actions.moveToElement(btnLogout).click().perform();

		logger.info("ending of verifytheModules method");

	}

}
