package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class VerifyTheTabsPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(VerifyTheTabsPage.class.getName());

	@FindBy(id = "personal-Details")
	private WebElement personalDetailTab;

	@FindBy(xpath = "//span[text()='Personal Details']")
	private WebElement getPersonalDetailsTxt;

	@FindBy(linkText = "Business Details")
	private WebElement businessDetailsTab;

	@FindBy(xpath = "//span[text()='Business Details']")
	private WebElement getBusinessDetailsTxt;

	@FindBy(id = "co-borrowers")
	private WebElement coBorrowerTab;

	@FindBy(id = "add_coborrower")
	private WebElement getAddCoBorrowerTxt;

	@FindBy(id = "gst-Details")
	private WebElement gstDetailsTab;

	@FindBy(xpath = "//span[text()='GST Details']")
	private WebElement getGstDetailsTxt;

	@FindBy(xpath = "//a[text()='Transactions']")
	private WebElement transactionsTab;

	@FindBy(xpath = "//span[text()='Add Transactions']")
	private WebElement getAddTransactionTxt;

	@FindBy(id = "reference-Details")
	private WebElement referenceDetailsTab;

	@FindBy(id = "add_references")
	private WebElement getAddReferenceTxt;

	@FindBy(xpath = "//a[text()='Bureau']")
	private WebElement bureauTab;

	@FindBy(xpath = "//span[text()='Bureau Details']")
	private WebElement getBureauTxt;

	@FindBy(xpath = "//a[text()='Line']")
	private WebElement creditlineTab;

	@FindBy(xpath = "//span[text()='Creditline']")
	private WebElement getCreditLineTxt;

	@FindBy(xpath = "//a[@id='loans']")
	private WebElement loansDetailsTab;

	@FindBy(xpath = "//tr[@class='ant-table-row ng-star-inserted']//th[1]")
	private WebElement getLoanDateTxt;

	@FindBy(xpath = "//a[@id='ledger']")
	private WebElement ledgerTab;

	@FindBy(xpath = "//th[text()='DATE']")
	private WebElement getLedgerDateTxt;

	@FindBy(xpath = "//a[text()='Repayments']")
	private WebElement repaymentsTab;

	@FindBy(xpath = "//span[text()='Repayment Account']")
	private WebElement getRepaymentAccountTxt;

	@FindBy(xpath = "//a[text()='Aggrement']")
	private WebElement aggrementTab;

	public VerifyTheTabsPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnKycTabs() {
		logger.info("Starting of clickOnKycTabs method");

		this.implicitWait();

		this.clickOnElement(personalDetailTab);
		System.out.println(this.getPersonalDetailsTxt.getText());

		this.clickOnElement(businessDetailsTab);
		System.out.println(this.getBusinessDetailsTxt.getText());

		this.clickOnElement(coBorrowerTab);
		System.out.println(this.getAddCoBorrowerTxt.getText());

		this.clickOnElement(gstDetailsTab);
		System.out.println(this.getGstDetailsTxt.getText());

		this.clickOnElement(transactionsTab);
		System.out.println(this.getAddTransactionTxt.getText());

		this.clickOnElement(referenceDetailsTab);
		System.out.println(this.getAddReferenceTxt.getText());
		this.scrollDown(100);

		this.clickOnElement(bureauTab);
		System.out.println(this.getBureauTxt.getText());

		this.clickOnElement(creditlineTab);
		//System.out.println(this.getCreditLineTxt.getText());
		this.scrollDown(100);

		this.clickOnElement(loansDetailsTab);
		System.out.println(this.getLoanDateTxt.getText());

		this.clickOnElement(ledgerTab);
		System.out.println(this.getLedgerDateTxt.getText());
		this.scrollDown(100);

		this.clickOnElement(repaymentsTab);
		this.scrollDown(-300);
		System.out.println(this.getRepaymentAccountTxt.getText());
        this.scrollDown(500);
		this.clickOnElement(aggrementTab);

		logger.info("ending of clickOnKycTabs method");

	}

}
