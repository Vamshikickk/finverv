package com.finverv.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import com.eci.finverv.EciLogInPage;
import com.infin.leadbox.CreateApplicationPage;
import com.infin.pages.LogInTabPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class BaseFinvervTest {

	protected static String browserDriverPath = null;
	protected static Map<String, String> chromeDriverMap = new HashMap<String, String>();
	private static final Logger logger = Logger.getLogger(BaseFinvervTest.class);
	protected static Properties expectedAssertionsProp = null;
	protected static Properties testDataprop = null;
	private LogInTabPage logInPage = null;
	private CreateApplicationPage createApplictionpage = null;
	private EciLogInPage eciloginpage = null;

	public static String OTP1;

	public String ecigetotp() {

		return "{\"anchor\":\"PRAI\",\"mobile\":\"9959561018\"}";

	}

	private static Map<WEB_DRIVER, WebDriver> webDriverPool = new Hashtable<WEB_DRIVER, WebDriver>();

	public enum WEB_DRIVER {

		LOGIN_DRIVER, DASHBOARD_DRIVER, CREATE_APPLICATION_DRIVER, PERSONAL_DETAILS_DRIVER, BUSINESS_DETAILS_DRIVER,
		CO_BORROWER_DRIVER, GST_DETAILS_DRIVER, TRANSACTION_DRIVER, REFERENCE_DRIVER, BUREAU_DRIVER, LINE_DRIVER,
		REPAYMENT_DRIVER, AGREEMENT_DRIVER, PORTFOLIO_DRIVER, USERS_DRIVER, LENDERS_DRIVER, FIN_SMART_DRIVER,
		BUSINESSDETAILS_DRIVER, PERSONALDEATILS_DRIVER, ECIPERSONAL_DETAILS_DRIVER, ECI_RESIDENT_ADDRESS_DRIVER,
		ECI_COMPANY_ADDRESS_DRIVER, ECI_FINANCIAL_DETAILS_DRIVER, VERIFY_TABS_DRIVER, VERIFY_MODULES_DRIVER,
		ECI_PERMANENT_DETAILS_DRIVER,
	}

	@BeforeSuite(alwaysRun = true)
	public void initTestData() {

		if (testDataprop == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;

			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertion.properties");
				testDataprop = new Properties();
				testDataprop.load(testDataReader);

				expectedAssertionsProp = new Properties();
				expectedAssertionsProp.load(assertionsReader);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {

					testDataReader.close();
					assertionsReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected synchronized void quitDriver(WEB_DRIVER webDriver) {
		logger.info("Starting of method quitDriver in BaseAutomationTest ");

		WebDriver driver = webDriverPool.get(webDriver);
		try {
			if (driver != null) {
				driver.quit();
				driver = null;
				webDriverPool.remove(webDriver);
				logger.debug(webDriver + " Web driver quit successfully in BaseAutomationTest ");
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			driver = null;
		}
		logger.info("Ending of method quitDriver in BaseAutomationTest");
	}

// @AfterSuite
	protected synchronized void quitAllDrivers() {
		logger.info("Starting of method quitAllDrivers in BaseAutomationTest ");

		WebDriver driver = null;

		synchronized (webDriverPool) {
			if (!webDriverPool.isEmpty()) {
				for (WEB_DRIVER driverKey : webDriverPool.keySet()) {
					logger.debug("Quitting driver key: " + driverKey);
					synchronized (webDriverPool) {
						driver = webDriverPool.get(driverKey);
						try {

							if (driver != null) {
								Thread.sleep(3000);
								driver.quit();
								driver = null;
								webDriverPool.remove(driverKey);
								Thread.sleep(3000);
								logger.debug("Driver quit successfully in BaseAutomationTest ");
							}
						} catch (Exception ex) {
							logger.error(ex.getMessage());
							driver = null;
						}
					}

				}

			}
		}
		logger.info("Ending of method quitAllDrivers in BaseAutomationTest");
	}

	protected synchronized WebDriver getWebDriver(String browser, WEB_DRIVER webDriver) {
		logger.info("Starting of method getWebDriver");

		WebDriver driver = webDriverPool.get(webDriver);

		String osPath = System.getProperty("os.name");

		// Use existing driver
		if (driver != null) {
			logger.debug("Using existing web driver " + webDriver);
			return driver;
		}

		if (osPath.contains("Linux")) {
			browserDriverPath = "/usr/bin/chromedriver";
			logger.debug("######### In linux condition Using existing web driver Linux ###### ");
			if (browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.setHeadless(true);
				options.addArguments("--no-sandbox");
				driver = new FirefoxDriver(options);
			} else {
				logger.debug("######### In Else Chrome browser condition Using existing web driver Linux ###### ");

				System.setProperty("webdriver.chrome.driver", browserDriverPath);
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
				options.addArguments("--no-sandbox");
				driver = new ChromeDriver(options);

				logger.debug("######### Driver is here  ###### " + driver);

			}
		} else if (osPath.contains("Mac OS X")) {
			browserDriverPath = "/usr/bin/safaridriver";

			if (browserDriverPath.contains("safaridriver")) {
				System.setProperty("webdriver.safari.driver", browserDriverPath);
				driver = new SafariDriver();

				logger.debug("Safari driver path " + browserDriverPath);
			}
		} else {

			if (browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("Chromium")) {
				WebDriverManager.chromiumdriver().setup();
				driver = new EdgeDriver();

			} else if (browser.equalsIgnoreCase("IEDriverServer")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();

			}
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		logger.info("*************** Driver Successfully Created ************** " + driver.getTitle());

		logger.info("End of method getWebDriver");

		webDriverPool.put(webDriver, driver);

		return driver;
	}

	public String getChromeDriverVersion(String driverInfo) {
		logger.info("Starting of getChromeDriverVersion method ");

		String tVersion = driverInfo.split("is")[2];
		tVersion = tVersion.split("with")[0];
		tVersion = (tVersion.split("\\.")[0]).trim();
		logger.debug("Chrome browser Version : " + tVersion);

		logger.info("Ending of getChromeDriverVersion method ");

		return tVersion;
	}

	protected void goToSite(String siteURL, WebDriver driver) throws Exception {

		driver.get(siteURL);

	}

	protected synchronized void quitDriver(WebDriver driver, WEB_DRIVER webDriver) {
		logger.info("Starting of method quitDriver in BaseFinvervAutomationTest ");

		try {
			if (driver != null) {
				driver.close();
				driver.quit();
				driver = null;
				webDriverPool.remove(webDriver);
				logger.debug(webDriver + " Web driver quit successfully in BaseClassplusAutomationTest ");
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			driver = null;
		}

		logger.info("Ending of method quitDriver in BaseFinvervAutomationTest");
	}

	public void loginFeatureWithValidCredentials(String validuserName, String validPassword, WebDriver driver) {
		logger.info("Starting of loginFeatureWithValidCredentials method");

		this.logInPage = new LogInTabPage(driver);
		logInPage.loginToFinverv(validuserName, validPassword);

		logger.info("Starting of loginFeatureWithValidCredentials method");
	}

	public void createApplicationWithValidData(WebDriver driver, String pinCode) {
		logger.info("Starting of createApplicationInInfin method");

		this.createApplictionpage = new CreateApplicationPage(driver);
		this.createApplictionpage.enterValidCredentials(pinCode);

		logger.info("Ending of createApplicationInInfin method");

	}

	public void searchApplication(String appMobileNumber) {
		logger.info("Starting of searchApplication method");

		this.createApplictionpage.openApplication(appMobileNumber);

		logger.info("Ending of searchApplication method");
	}

	public void searchApplicationWithInvalidData(String appMobileNumber) {
		logger.info("Starting of searchApplicationWithInvalidData method");

		this.createApplictionpage.openApplication(appMobileNumber);

		logger.info("Ending of searchApplicationWithInvalidData method");
	}

	public void loginFeature(String UserName, String Password, WebDriver driver) {
		logger.info("Starting of loginFeature method");

		this.logInPage = new LogInTabPage(driver);

		String textholder = logInPage.getSignInText();
		System.out.println(textholder);
		Assert.assertEquals(textholder, expectedAssertionsProp.getProperty("text"));
		logInPage.loginToFinverv(UserName, Password);

		try {
			String getpopuptext = logInPage.getInvalidcredLabel();
			Assert.assertEquals(getpopuptext, expectedAssertionsProp.getProperty("getpopuptext"));
			System.out.println(getpopuptext);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.logInPage.clickOutside();
		}
		logger.info("Starting of loginFeature method");
	}

	public void createApplicationWithInvalidData(WebDriver driver, String mobileNumber, String pincode)
			throws InterruptedException {
		logger.info("Starting of createApplicationWithInvalidData method");

		this.createApplictionpage = new CreateApplicationPage(driver);
		try {
			// enter invalid mobile number and Valid PinCode
			this.createApplictionpage.createApplication(mobileNumber, pincode);
			String getInvalidMobiletext = this.createApplictionpage.getinvalidmobilenumbertext();
			Assert.assertEquals(getInvalidMobiletext, expectedAssertionsProp.getProperty("invalidmobilenumbertext"));
			System.out.println("get invalid text: " + getInvalidMobiletext);

			// enter valid mobile number and invalid PinCode
			String getpincodetext = this.createApplictionpage.getlblInavlaidPincodeText();
			Assert.assertEquals(getpincodetext, expectedAssertionsProp.getProperty("invalidpincodetext1"));
			System.out.println("Invalid Pincode text : " + getpincodetext);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			this.createApplictionpage.clickOutside();
		}

		logger.info("Ending of createApplicationWithInvalidData method");
	}

	public String getOTP() {

		logger.info("Starting of getOTP method");

		RestAssured.baseURI = "https://dev.finverv.in";
		String responseBody = RestAssured.given().header("Content-Type", "application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNjk4NTYwOTY5LCJpYXQiOjE2Njc0NTY5NjksImp0aSI6Ijl"
						+ "lMDQwODU0NTI3ODQzZjU4MWE1ZTNjYjM4NDM4YjExIiwidXNlcl9pZCI6NDU4fQ.Ea_VJOsHlNdMG_fy7zirt0ZyFZguO3XK7nLUVo3JY54")
				.get("/finverv/internal/v1/applications/7faef859-db44-47ac-b78d-f2c80204f580/request-otp/").body()
				.asString();
		System.out.print("###############" + responseBody);
		JsonPath jsonPath = new JsonPath(responseBody);
		String OTP = jsonPath.getString("msg.otp");
		String expected = jsonPath.getString("msg.msg");
		Assert.assertEquals(expected, "otp shared successfully");
		logger.info("Ending of getOTP method");
		return OTP;
	}

	public String ecigetOTP() {
		RestAssured.baseURI = "https://dev.finverv.in";
		String responseBody = RestAssured.given().header("Content-Type", "application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNjk4NTYwOTY5LCJpYXQiOjE2Njc0NTY5NjksImp0aSI6IjllMDQwODU0NTI3ODQzZjU4MWE1ZTNjYjM4NDM4YjExIiwidXNlcl9pZCI6NDU4fQ.Ea_VJOsHlNdMG_fy7zirt0ZyFZguO3XK7nLUVo3JY54")
				.header("Origin", "https://infin-dev.finverv.in").header("Referer", "https://infin-dev.finverv.in/")
				.body(ecigetotp()).post("/eci/apis/v1/auth/request-otp/").body().asString();
		System.out.print("###############" + responseBody);
		JsonPath jsonPath = new JsonPath(responseBody);
		OTP1 = jsonPath.getString("msg.otp");
		String expected = jsonPath.getString("msg.msg");
		Assert.assertEquals(expected, "otp shared successfully");
		logger.info("OTP is :" + OTP1);
		return OTP1;

	}

	public void EciloginFeature(WebDriver driver, String mobileNumber) {
		logger.info("Starting of loginFeature method");

		this.eciloginpage = new EciLogInPage(driver);

		this.eciloginpage.setMobileNumber(mobileNumber);
		this.eciloginpage.clickOnSigninbtn();
		this.eciloginpage.setOtp(this.ecigetOTP());
		this.eciloginpage.clickOnSignIn2btnb();

		logger.info("Starting of loginFeature method");
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
