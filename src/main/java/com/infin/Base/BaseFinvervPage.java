package com.infin.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFinvervPage {

	protected WebDriver driver = null;

	private static final Logger logger = Logger.getLogger(BaseFinvervPage.class);
	public static String TEST_FILE_PATH = null;

	public BaseFinvervPage(WebDriver driver) {
		this.driver = driver;
		if (TEST_FILE_PATH == null) {
			TEST_FILE_PATH = getTestFilePath();
			logger.debug("In Constructor " + TEST_FILE_PATH);
		}
		PageFactory.initElements(driver, this);
	}

	public String getTestFilePath() {
		logger.info("Starting of selectDropdown method");

		String path = "src/test/resources";
		File file = new File(path);

		logger.info("Ending of selectDropdown method");
		return file.getAbsolutePath();
	}

	protected void selectDropdown(WebElement xpath, String value) {
		logger.info("Starting of selectDropdown method");

		Select conditions = new Select(xpath);
		conditions.selectByVisibleText(value);

		logger.info("Ending of selectDropdown method");
	}

	public void scrollDown(int scroll) {
		logger.info("Starting of scrollDown method");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + scroll + ")");

		logger.info("Ending of scrollDown method");
	}

	public void explicitWait(WebElement webElement) {
		logger.info("Staritng of explicitWait method");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(webElement));

		logger.info("Ending of explicitWait method");
	}

	public void implicitWait() {
		logger.info("Starting of implicitWait Method");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		logger.info("Ending of implicitWait Method");
	}

	public void clickOnWebElement(WebElement webelement) {
		logger.info("Starting of clickOnWebElement method");

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", webelement);

		logger.info("Ending of clickOnWebElement method");
	}

	public void switchToNewWindow() {
		logger.info("Starting of switchToNewWindow method");

		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));

		logger.info("Ending of switchToNewWindow method");
	}

	public void closeWindow() {
		logger.info("Starting of closeWindow method");

		driver.close();
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));

		logger.info("Ending of closeWindow method");
	}

	public void waitUntilElementVisiblebyId(WebDriver driver, String id) {
		logger.info("Starting of waitUntilElementVisible method");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

		logger.info("Ending of waitUntilElementVisible method");
	}

	public void waitUntilElementVisiblebyXpath(WebDriver driver, String xpath) {
		logger.info("Starting of waitUntilElementVisible method");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		logger.info("Ending of waitUntilElementVisible method");
	}

	public void refresh() {
		logger.info("Starting of refresh method");

		driver.navigate().refresh();

		logger.info("Ending of refresh method");
	}

	public void mouseHoverAction(WebElement webElement) {
		logger.info("Starting of mouseHoverActions method");

		Actions action = new Actions(driver);
		action.moveToElement(webElement).build().perform();

		logger.info("Ending of mouseHoverActions method");
	}

	public void mouseHoverAndClick(WebElement webElement) {
		logger.info("Starting of mouseHoverAndClick method");

		Actions action = new Actions(driver);
		action.moveToElement(webElement).click().build().perform();

		logger.info("Ending of mouseHoverAndClick method");
	}

	public void sleep(int sec) {
		logger.info("Starting of sleep Method");
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			logger.error("Error occurred while using sleep method ", e);
		}

		logger.info("Ending of sleep Method");
	}

	public void scrollIntoView(WebElement element) {
		logger.info("Starting of scrollIntoView method");

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].scrollIntoView(true);", element);

		logger.info("Ending of scrollIntoView method");
	}

	public void explicitWait(List<WebElement> categoryOptions) {
		logger.info("Starting of explicitWait method");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(categoryOptions));

		logger.info("Ending of explicitWait method");
	}

	public void clickOutside() {
		logger.info("Starting of clickOutside method");

		Actions action = new Actions(driver);
		action.moveByOffset(0, 0).click().build().perform();

		logger.info("Ending of clickOutside method");
	}

	public static String randomNumber(int digits) {
		logger.info("Starting of randomNumber method");

		logger.info("Ending of randomNumber method");

		return String.valueOf(RandomStringUtils.randomNumeric(digits));
	}

	public enum MOBILE_ACTIONS {
		CLICK, VISIBILE
	}

	protected WebElement findElement(WebElement webelement, MOBILE_ACTIONS mobileActions) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		switch (mobileActions) {
		case CLICK:
			wait.until(ExpectedConditions.elementToBeClickable(webelement));
			break;
		case VISIBILE:
			wait.until(ExpectedConditions.visibilityOf(webelement));
			break;
		default:
			wait.until(ExpectedConditions.visibilityOf(webelement));
		}
		return webelement;
	}

	protected void clickOnElement(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.CLICK).click();
	}

	protected String getText(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).getText();
	}

	protected void sendKeys(WebElement webelement, String keys) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE).sendKeys(keys);
	}

	protected void clear(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE).clear();
	}

	protected boolean isDisplayed(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).isDisplayed();
	}

	protected void waitForElementToBeVisible(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE);
	}
	public String[][] getDataFromExcel(String filepath, String sheetName) throws IOException {

		File excelFilePath = new File(filepath);
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColoumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows - 1][noOfColoumns];
		for (int i = 0; i < noOfRows - 1; i++) {
			for (int j = 0; j < noOfColoumns; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		workbook.close();
		inputstream.close();
		int i = 0;
		for (String[] dataArr : data) {
			System.out.println((dataArr[i]));
			i++;
		}
		return data;
	}

	

}
