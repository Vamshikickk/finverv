package com.infin.test;

import static FinvervApplication.utils.Constants.DASHBOARD_TEXT;
import static FinvervApplication.utils.Constants.DASH_HEADER_TEXT;
import static FinvervApplication.utils.Constants.FINSMART_TEXT;
import static FinvervApplication.utils.Constants.LEADBOX_TEXT;
import static FinvervApplication.utils.Constants.LENDERS_TEXT;
import static FinvervApplication.utils.Constants.PORTFOLIO_TEXT;
import static FinvervApplication.utils.Constants.USERS_TEXT;
import static FinvervApplication.utils.Constants.WELCOME_TEXT;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.finverv.Base.BaseFinvervTest;
import com.infin.pages.DashBoardTabPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class DashBoardTest extends BaseFinvervTest {

	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
	private WebDriver dashboarddriver = null;
	private DashBoardTabPage dashboardtabpage = null;

	@BeforeClass
	@Parameters({ "siteURL", "browser", "invaliduserName", "invalidPassword", "validuserName", "validPassword" })

	public void dashBoardDriver(String siteURL, String browser, String invaliduserName, String invalidPassword,
			String validuserName, String validPassword) throws Exception {
		logger.info("Starting of dashBoardDriver in finverv");

		this.dashboarddriver = this.getWebDriver(browser, WEB_DRIVER.DASHBOARD_DRIVER);
		this.goToSite(siteURL, dashboarddriver);

		this.dashboardtabpage = new DashBoardTabPage(dashboarddriver);
		this.loginFeature(invaliduserName, invalidPassword, dashboarddriver);

		logger.info("Ending of of dashBoardDriver in finverv");

	}

	@Test(priority = 1, description = "Verify HomePage")
	@Description("Test Description:User verify the Homepage tabs")
	@Severity(SeverityLevel.NORMAL)
	@Story("User verify the Homepage tabs")
	public void testVerifyTheHomePageTabs() {
		logger.info("Starting of testVerifyTheHomePageTabs method");

		String dashgettext = this.dashboardtabpage.getHeaderMenuLabel().split("Lead")[0].trim();
		expectedAssertionsProp.getProperty(DASHBOARD_TEXT);
		Assert.assertEquals(dashgettext, expectedAssertionsProp.getProperty(DASHBOARD_TEXT));
		System.out.println(dashgettext);

		String leadGetText = this.dashboardtabpage.getHeaderMenuLabel().split("Port")[0].trim().split("Dashboard")[1]
				.split(" ")[0].trim();
		expectedAssertionsProp.getProperty(LEADBOX_TEXT);
		Assert.assertEquals(leadGetText, expectedAssertionsProp.getProperty(LEADBOX_TEXT));
		System.out.println(leadGetText);

		String portgettext = this.dashboardtabpage.getHeaderMenuLabel().split("Box")[1].trim()
				.split("UsersLendersFinSmart")[0].trim();
		expectedAssertionsProp.getProperty(PORTFOLIO_TEXT);
		Assert.assertEquals(portgettext, expectedAssertionsProp.getProperty(PORTFOLIO_TEXT));
		System.out.println(portgettext);

		String usersgettetxt = this.dashboardtabpage.getHeaderMenuLabel().split("LendersFinSmart")[0].trim()
				.split("BoxPortfolio")[1].split("DashboardLead , ")[0].trim();
		expectedAssertionsProp.getProperty(USERS_TEXT);
		Assert.assertEquals(usersgettetxt, expectedAssertionsProp.getProperty(USERS_TEXT));
		System.out.println(usersgettetxt);

		String lendersgetetxt = this.dashboardtabpage.getHeaderMenuLabel().split("FinSmart")[0]
				.split("DashboardLead BoxPortfolioUsers")[1].trim();
		expectedAssertionsProp.getProperty(LENDERS_TEXT);
		Assert.assertEquals(lendersgetetxt, expectedAssertionsProp.getProperty(LENDERS_TEXT));
		System.out.println(lendersgetetxt);

		String fingettetxt = this.dashboardtabpage.getHeaderMenuLabel().split("Lenders")[1].trim();
		expectedAssertionsProp.getProperty(FINSMART_TEXT);
		Assert.assertEquals(fingettetxt, expectedAssertionsProp.getProperty(FINSMART_TEXT));
		System.out.println(fingettetxt);

		String welgettext = this.dashboardtabpage.getWelcoemeLabel();
		expectedAssertionsProp.getProperty(WELCOME_TEXT);
		Assert.assertEquals(welgettext, expectedAssertionsProp.getProperty(WELCOME_TEXT));
		System.out.println(welgettext);

		logger.info("Ending of Verify the HomePage tabs method");

	}

	@Test(priority = 2, description = "Verify DashBoardTest in finverv ")
	@Description("Test Description:Verify DashBoardTest in finverv")
	@Severity(SeverityLevel.MINOR)
	@Story("Verify DashBoardTest in finvervs")
	public void verifyDashBoardTest() throws InterruptedException {
		logger.info("starting of verifyDashBoardTest method");

		dashboardtabpage.switchToIframe();
		String headertext = dashboardtabpage.getDashBoardLabel();
		Assert.assertEquals(headertext, expectedAssertionsProp.getProperty(DASH_HEADER_TEXT));
		System.out.println(headertext);

		logger.info("Ending of testVerifyTheHomePageTabs method");

	}

	@AfterClass
	public void tearDown() {
		logger.info("Starting of tearDown method");

		dashboarddriver.close();
		dashboarddriver.quit();

		logger.info("Ending of tearDown  method ");

	}

}
