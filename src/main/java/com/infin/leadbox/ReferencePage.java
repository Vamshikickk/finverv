package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class ReferencePage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(ReferencePage.class.getName());

	@FindBy(id = "reference-Details")
	private WebElement btnReference;

	@FindBy(id = "add_references")
	private WebElement btnAddReference;

	@FindBy(id = "references_name")
	private WebElement txtName;

	@FindBy(id = "references_mobile")
	private WebElement txtMobile;

	@FindBy(xpath = "//span[text()='Mobile not valid.']")
	private WebElement invalidMobileValidationText;

	@FindBy(id = "references_reference_type")
	private WebElement referenceTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Business']")
	private WebElement selectReferenceType;

	@FindBy(id = "references_business_name")
	private WebElement txtBusinessName;

	@FindBy(id = "references_submit")
	private WebElement btnAddReferenceSubmit;

	@FindBy(id = "open_references_address")
	private WebElement referenceAddressIcon;

	@FindBy(id = "coborrower_address_line_1")
	private WebElement txtAddressline1;

	@FindBy(id = "coborrower_address_line_2")
	private WebElement txtAddressline2;

	@FindBy(id = "coborrower_pincode")
	private WebElement txtRefPincode;

	@FindBy(xpath = "//span[text()='pincode-Invalid Pincode Shared']")
	private WebElement invalidPincodeValidationText;

	@FindBy(id = "coborrower_vintage")
	private WebElement txtRefResiding;

	@FindBy(id = "coborrower_ownership_type")
	private WebElement ownerShipTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Owned']")
	private WebElement selectOwnerShipType;

	@FindBy(id = "coborrower_owner_name")
	private WebElement txtOwnername;

	@FindBy(id = "coborrower_relation_with_owner")
	private WebElement txtRefRelation;

	@FindBy(id = "submit_address_coborrower")
	private WebElement btnAddReference2;

	@FindBy(id = "add_references")
	private WebElement btnEditReference;

	public ReferencePage(WebDriver driver) {
		super(driver);

	}

	public String getRefernceTabText() {
		logger.info("Starting of getRefernceTabText method");

		logger.info("Ending of getRefernceTabText method");
		return btnReference.getText();

	}

	public void clickOnReferenceButton() {
		logger.info("Starting of clickOnReferenceButton method");

		this.btnReference.click();

		logger.info("Ending of clickOnReferenceButton method");

	}

	public String getAddReferncebtnText() {
		logger.info("Starting of getAddReferncebtnText method");

		logger.info("Ending of getAddReferncebtnText method");
		return btnAddReference.getText();
	}

	public void clickOnAddReferenceButton() {
		logger.info("Starting of clickOnAddReferenceButton method");

		this.clickOnElement(btnAddReference);

		logger.info("Ending of clickOnAddReferenceButton method");

	}

	public void setReferenceName(String referenceName) {
		logger.info("Starting of setReferenceName method");

		this.txtName.click();
		this.txtName.clear();
		this.txtName.sendKeys(referenceName);

		logger.info("Ending of setReferenceName method");

	}

	public void setReferenceMobile(String referenceMobileNumber) {
		logger.info("Starting of setReferenceMobile method");

		this.txtMobile.click();
		this.txtMobile.clear();
		this.txtMobile.sendKeys(referenceMobileNumber);

		logger.info("Ending of setReferenceMobile method");

	}

	public String getInvalidMobileTxt() {
		logger.info("Starting of getInvalidMobileText method");

		logger.info("Ending of getInvalidMobileText method");
		return invalidMobileValidationText.getText();
	}

	public void clickOnSelectReferenceType() {
		logger.info("Starting of clickOnSelectReferenceType method");

		this.referenceTypeDrpdwn.click();
		this.selectReferenceType.click();

		logger.info("Ending of clickOnSelectReferenceType method");

	}

	public void setBusinessName(String referenceBusinessName) {
		logger.info("Starting of setBusinessName method");

		this.txtBusinessName.click();
		this.txtBusinessName.clear();
		this.txtBusinessName.sendKeys(referenceBusinessName);

		logger.info("Ending of setBusinessName method");

	}

	public void clickOnAddReferenceSubmitButton() {

		logger.info("Starting of clickOnAddReferenceSubmitButton method");

		this.btnAddReferenceSubmit.click();

		logger.info("Ending of clickOnAddReferenceSubmitButton method");

	}

	public void clickOnRefAddressIcon() {

		logger.info("Starting of clickOnRefAddressIcon method");

		this.clickOnElement(referenceAddressIcon);

		logger.info("Ending of clickOnRefAddressIcon method");

	}

	public void setAddressLine1(String referenceAddress1) {

		logger.info("Starting of setAddressLine1 method");

		this.txtAddressline1.click();
		this.txtAddressline1.clear();
		this.txtAddressline1.sendKeys(referenceAddress1);

		logger.info("Ending of setAddressLine1 method");

	}

	public void setAddressLine2(String referencAddress2) {

		logger.info("Starting of setAddressLine2 method");

		this.txtAddressline2.click();
		this.txtAddressline2.clear();
		this.txtAddressline2.sendKeys(referencAddress2);

		logger.info("Ending of setAddressLine2 method");

	}

	public void setRefPincode(String referencPincode) {

		logger.info("Starting of setRefPincode method");

		this.txtRefPincode.click();
		this.txtRefPincode.clear();
		this.txtRefPincode.sendKeys(referencPincode);

		logger.info("Ending of setRefPincode method");

	}

	public String getInvalidPincodeTxt() {
		logger.info("Starting of getInvalidPincodeTxt method");

		logger.info("Ending of getInvalidPincodeTxt method");
		return invalidPincodeValidationText.getText();

	}

	public void setResidingYear(String referencResiding) {

		logger.info("Starting of setResidingYear method");

		this.txtRefResiding.click();
		this.txtRefResiding.clear();
		this.txtRefResiding.sendKeys(referencResiding);

		logger.info("Ending of setResidingYear method");

	}

	public void setRefOwnership() {

		logger.info("Starting of setRefOwnership method");

		this.ownerShipTypeDrpdwn.click();
		this.selectOwnerShipType.click();

		logger.info("Ending of setRefOwnership method");

	}

	public void setOwnerName(String referenceOwnername) {

		logger.info("Starting of setOwnerName method");

		this.txtOwnername.click();
		this.txtOwnername.clear();
		this.txtOwnername.sendKeys(referenceOwnername);

		logger.info("Ending of setOwnerName method");

	}

	public void setRefRelation(String referenceRelation) {

		logger.info("Starting of setRefRelation method");

		this.txtRefRelation.click();
		this.txtRefRelation.clear();
		this.txtRefRelation.sendKeys(referenceRelation);

		logger.info("Ending of setRefRelation method");

	}

	public void clickOnRefAddAddressButton() {

		logger.info("Starting of clickOnRefAddAddressButton method");

		this.scrollIntoView(btnAddReference2);

		this.btnAddReference2.click();

		logger.info("Ending of clickOnRefAddAddressButton method");

	}

	public void clickOnReferenceEditButton() {
		logger.info("Starting of clickOnReferenceEditButton method");

		this.btnEditReference.click();

		logger.info("Ending of clickOnReferenceEditButton method");

	}

	public void setReferenceDetails(String referenceName, String referenceMobile, String businessName) {
		logger.info("Starting of setReferenceDetails method");

		this.clickOnReferenceButton();
		this.clickOnAddReferenceButton();
		this.setReferenceName(referenceName);
		this.setReferenceMobile(referenceMobile);
		this.clickOnSelectReferenceType();
		this.setBusinessName(businessName);
		this.clickOnAddReferenceSubmitButton();

		logger.info("Ending of setReferenceDetails method");
	}

	public void setReferenceAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residingYear, String ownerName, String relation) {
		
		logger.info("Starting of setReferenceAddressDetails method");
		this.clickOnRefAddressIcon();
		this.setAddressLine1(addressLine1);
		this.setAddressLine2(addressLine2);
		this.setRefPincode(pincode);
		this.setResidingYear(residingYear);
		this.setRefOwnership();
		this.setOwnerName(ownerName);
		this.setRefRelation(relation);
		this.clickOnRefAddAddressButton();

		logger.info("Ending of setReferenceAddressDetails method");
	}

	public void setReferenceEditDetails(String referenceName, String referenceMobile, String businessName) {
		logger.info("Starting of setReferenceEditDetails method");

		this.clickOnReferenceEditButton();
		this.setReferenceName(referenceName);
		this.setReferenceMobile(referenceMobile);
		this.clickOnSelectReferenceType();
		this.setBusinessName(businessName);
		this.clickOnAddReferenceSubmitButton();

		logger.info("Ending of setReferenceEditDetails method");

	}
}
