
package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateApplicationTest extends BaseFinvervTest {

	WebDriver CREATE_APPLICATION_DRIVER = null;

	private static final Logger logger = Logger.getLogger(CreateApplicationTest.class.getName());

	@BeforeClass
	@Parameters({ "siteURL", "browser", "validuserName", "validPassword" })
	public void leadBoxDriver(String siteURL, String browser, String validuserName, String validPassword)
			throws Exception {
		logger.info("Starting of CreateApplication in Infin");

		CREATE_APPLICATION_DRIVER = this.getWebDriver(browser, WEB_DRIVER.CREATE_APPLICATION_DRIVER);
		this.goToSite(siteURL, CREATE_APPLICATION_DRIVER);
		loginFeatureWithValidCredentials(validuserName, validPassword, CREATE_APPLICATION_DRIVER);

		logger.info("Ending of of CreateApplication in Infin");

	}

	@Test(priority = 1)
	@Parameters({ "pinCode" })
	@Description("Test Description:Verify createNewApplication")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify createNewApplication")
	public void createApplication(String pinCode) throws InterruptedException {
		logger.info("Starting of createApplication in finverv");

		this.createApplicationWithValidData(CREATE_APPLICATION_DRIVER, pinCode);

		logger.info("Ending of createApplication in finverv");
	}

	@Test(priority = 2, dataProvider = "get_create_Application_details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify createNewApplication")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify createNewApplication with invalid data")
	public void createApplicationWithInvalidData(String appMobileNumber, String pinCode) throws InterruptedException {
		logger.info("Starting of createApplicationWithInvalidData in finverv");

		this.createApplicationWithInvalidData(CREATE_APPLICATION_DRIVER, appMobileNumber, pinCode);

		logger.info("Ending of createApplicationWithInvalidData in finverv");
	}
	
	@Test(priority = 3)
	@Parameters({ "filterMobileNumber" })
	@Description("Test Description:Verify createNewApplication")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify createNewApplication with invalid data")
	public void searchApplicationWithValidData(String mobileNumber) {
		logger.info("Starting of searchApplicationWithValidData method");

		this.searchApplicationWithInvalidData(mobileNumber);

		logger.info("Ending of searchApplicationWithValidData method");
	}
	
	@Test(priority = 4,dataProvider = "get_Search_Application_details", dataProviderClass = ReadingExcelData.class)
	@Description("Test Description:Verify createNewApplication")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Verify createNewApplication with invalid data")

	public void searchApplicationWithInvliCred(String mobileNumber) {
		logger.info("Starting of searchApplicationWithInvliCred method");

		this.searchApplicationWithInvalidData(mobileNumber);

		logger.info("Ending of searchApplicationWithInvliCred method");
	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		CREATE_APPLICATION_DRIVER.close();
		CREATE_APPLICATION_DRIVER.quit();

		logger.info("Ending of tearDown method");
	}

}
