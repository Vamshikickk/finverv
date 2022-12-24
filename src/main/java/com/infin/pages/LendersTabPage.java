package com.infin.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class LendersTabPage extends BaseFinvervPage {
	
	private static final Logger logger = Logger.getLogger(LendersTabPage.class.getName());
	
	@FindBy(linkText="Lenders")
	private WebElement btnLenders;

	public LendersTabPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnLenders() {
		this.btnLenders.click();
	}

}
