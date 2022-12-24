package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class BureauDetailsPage extends BaseFinvervPage{
	private static final Logger logger = Logger.getLogger(BureauDetailsPage.class.getName());

	
	@FindBy(id="bureau")
	private WebElement btnBureautab;
	
	@FindBy(id="fetch_bureau")
	private WebElement btnFetchBureau;
	
	public BureauDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickOnBureauTab() {
		logger.info("Starting of clickOnBureauTab method");
			
		this.btnBureautab.click();
		
		logger.info("Ending of clickOnBureauTab method");
			
	}

	public void clickOnFetchBureauButton() {
		logger.info("Starting of clickOnFetchBureauButton method");
		
		this.clickOnElement(btnFetchBureau);
		
		logger.info("Ending of clickOnFetchBureauButton method");
		
		
	}


}
