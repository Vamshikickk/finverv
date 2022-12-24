package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class CoBorrowerTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(CoBorrowerTabPage.class.getName());

	@FindBy(xpath = "//a[text()='Co Borrowers']")
	private WebElement getLblCoBorrowerTxt;

	@FindBy(id = "co-borrowers")
	private WebElement btnCoBorrower;

	@FindBy(id = "add_coborrower")
	private WebElement btnAddCoBorrower;

	@FindBy(id = "coborrower_title")
	private WebElement addCoBorrowerTitleDrpdwn;

	@FindBy(xpath = "//div[text()='Mr']")
	private WebElement selectitleAddCoBorrower;

	@FindBy(id = "coborrower_first_name")
	private WebElement txtFirstName;

	@FindBy(id = "coborrower_middle_name")
	private WebElement txtMiddleName;

	@FindBy(id = "coborrower_last_name")
	private WebElement txtLastName;

	@FindBy(id = "coborrower_gender")
	private WebElement addCoBorrowerGenderDrpdwn;

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement selectAddCoBorrowerGender;

	@FindBy(id = "coborrower_email")
	private WebElement txtEmailAddCoBorrower;

	@FindBy(xpath = "//span[text()='Email not valid.']")
	private WebElement invalidEmailValidationTxt;

	@FindBy(id = "coborrower_mobile")
	private WebElement txtMobileNumberCoBorrower;

	@FindBy(xpath = "//span[text()='Mobile not valid.']")
	private WebElement invalidMobileValidationTxt;

	@FindBy(id = "coborrower_alternate_number")
	private WebElement txtAlterMobileNumber;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement txtDateofBirth;

	@FindBy(id = "coborrower_fathers_name")
	private WebElement txtCoBorrowerFatherName;

	@FindBy(id = "coborrower_mothers_name")
	private WebElement txtCoBorrowerMotherName;

	@FindBy(id = "coborrower_marital_status")
	private WebElement coBorrowerMaritalStatusDrpdwn;

	@FindBy(xpath = "//div[text()='Unmarried']")
	private WebElement selectCoBorrowerMaritalStatus;

	@FindBy(id = "coborrower_spouse_name")
	private WebElement txtCoBorrowerSpouseName;

	@FindBy(id = "coborrower_no_of_dependent")
	private WebElement txtCoBorrowerNoOfDependent;

	@FindBy(id = "coborrower_nationality")
	private WebElement txtCoBorrowerNationality;

	@FindBy(id = "coborrower_category")
	private WebElement coBorrowerCategoryDrpdwn;

	@FindBy(xpath = "//div[text()='OBC']")
	private WebElement selectCoBorrowerCategory;

	@FindBy(id = "coborrower_religion")
	private WebElement coBorrowerReligionDrpdwn;

	@FindBy(xpath = "//div[text()='Hindu']")
	private WebElement selectCoBorrowerReligion;

	@FindBy(id = "coborrower_education_level")
	private WebElement coBorrowerEducationDrpdwn;

	@FindBy(xpath = "//div[text()='Undergraduate']")
	private WebElement selectCoBorrowerEducation;

	@FindBy(id = "coborrower_occupation_type")
	private WebElement coBorrowerOccupationTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Salaried']")
	private WebElement selectCoBorrowerOccupationType;

	@FindBy(id = "coborrower_occupation")
	private WebElement coBorrowerOccupationDrpdwn;

	@FindBy(xpath = "//div[text()='Others']")
	private WebElement selectCoBorrowerOccupation;

	@FindBy(id = "coborrower_source_of_income")
	private WebElement coBorrowerSourceOfIncomeDrpdwn;

	@FindBy(xpath = "//div[text()='Other']")
	private WebElement selectCoBorrowerSourceOfIncome;

	@FindBy(id = "coborrower_gross_annual_income")
	private WebElement txtCoBorrowerGrassIncome;

	@FindBy(id = "coborrower_pan_number")
	private WebElement txtCoBorrowerPanNumber;

	@FindBy(xpath = "//span[text()='Pan not valid.']")
	private WebElement invalidPanFiledValidation;

	@FindBy(id = "coborrower_aadhar_number")
	private WebElement txtCoBorrowerAadharNumber;

	@FindBy(xpath = "//span[text()='Aadhar not valid.']")
	private WebElement invaildAadharfieldValidation;

	@FindBy(id = "submit_coborrower")
	private WebElement btnAddCoBorrowerDetails;

	@FindBy(id = "open_coborrower_address")
	private WebElement clickOnAddressIcon;

	@FindBy(id = "coborrower_address_line_1")
	private WebElement txtAddressline1;

	@FindBy(id = "coborrower_address_line_2")
	private WebElement txtAddressline2;

	@FindBy(id = "coborrower_pincode")
	private WebElement txtCoBorrowerPincode;

	@FindBy(xpath = "//span[text()='pincode-Invalid Pincode Shared']")
	private WebElement invalidPincodeValidationText;

	@FindBy(id = "coborrower_vintage")
	private WebElement txtResidingYear;

	@FindBy(id = "coborrower_ownership_type")
	private WebElement ownershipTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Owned']")
	private WebElement selectOwnerType;

	@FindBy(id = "coborrower_owner_name")
	private WebElement txtownerName;

	@FindBy(id = "coborrower_relation_with_owner")
	private WebElement txtRelationwithOwner;

	@FindBy(id = "submit_address_coborrower")
	private WebElement btnAddAddress;

	@FindBy(id = "show_documents_coborrower")
	private WebElement documentEditIcon;

	@FindBy(id = "select_show_documents_coborrower")
	private WebElement selectlblDrpDwn;

	@FindBy(xpath = "//div[text()='PAN Card']")
	private WebElement selectlblType;

	@FindBy(id = "choose_show_documents_coborrower")
	private WebElement browseChoosefile;

	@FindBy(id = "upload_show_documents_coborrower")
	private WebElement btnUpload;

	@FindBy(id = "add_coborrower")
	private WebElement btnEditCoBorrower;

	@FindBy(id = "submit_coborrower")
	private WebElement btnupdateCoBorrower;

	public CoBorrowerTabPage(WebDriver driver) {
		super(driver);

	}

	public String getCoBorrowerText() {
		logger.info("Starting of getCoBorrowerText method");

		logger.info("Ending of getCoBorrowerText method");
		return getLblCoBorrowerTxt.getText();
	}

	public void clickOnCoBorrowerTab() {
		logger.info("Starting of clickOnCoBorrowerTab method");

		this.btnCoBorrower.click();

		logger.info("Ending of clickOnCoBorrowerTab method");

	}

	public void clickOnAddCoBorrowerButton() {
		logger.info("Starting of clickOnAddCoBorrowerButton method");

		this.clickOnElement(btnAddCoBorrower);

		logger.info("Ending of clickOnAddCoBorrowerButton method");

	}

	public void clickOnAddCoBorrowertitleDrpdwn() {
		logger.info("Starting of clickOnAddCoBorrowertitleDrpdwn method");

		this.addCoBorrowerTitleDrpdwn.click();
		this.selectitleAddCoBorrower.click();

		logger.info("Ending of clickOnAddCoBorrowertitleDrpdwn method");

	}

	public void setCoBorrowerFirstName(String companyFirstName) {
		logger.info("Starting of setCoBorrowerFirstName method");

		this.txtFirstName.click();
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys(companyFirstName);

		logger.info("Ending of setCoBorrowerFirstName method");

	}

	public void setCoBorrowerMidleName(String companyMiddleName) {
		logger.info("Starting of setCoBorrowerMidleName method");

		this.txtMiddleName.click();
		this.txtMiddleName.clear();
		this.txtMiddleName.sendKeys(companyMiddleName);

		logger.info("Ending of setCoBorrowerMidleName method");
	}

	public void setCoBorrowerLastName(String companyLastname) {
		logger.info("Starting of setCoBorrowerLastName method");

		this.txtLastName.click();
		this.txtLastName.clear();
		this.txtLastName.sendKeys(companyLastname);

		logger.info("Ending of setCoBorrowerLastName method");
	}

	public void clickOnAddCoBorrowerGenderDrpdwn() {
		logger.info("Starting of setCoBorrowerLastName method");

		this.addCoBorrowerGenderDrpdwn.click();
		this.selectAddCoBorrowerGender.click();

		logger.info("Ending of setCoBorrowerLastName method");
	}

	public void setEmailCoBorrower(String companyEmail) {
		logger.info("Starting of setEmailCoBorrower method");

		this.txtEmailAddCoBorrower.click();
		this.txtEmailAddCoBorrower.clear();
		this.txtEmailAddCoBorrower.sendKeys(companyEmail);

		logger.info("Ending of setEmailCoBorrower method");
	}

	public String getInvalidEmailText() {
		logger.info("Starting of getInvalidEmailText method");

		logger.info("Ending of getInvalidEmailText method");
		return invalidEmailValidationTxt.getText();
	}

	public void setMobileNumberCoBorrower(String companyMobileNumber) {
		logger.info("Starting of txtMobileNumberCoBorrower method");

		this.txtMobileNumberCoBorrower.click();
		this.txtMobileNumberCoBorrower.clear();
		this.txtMobileNumberCoBorrower.sendKeys(companyMobileNumber);

		logger.info("Ending of txtMobileNumberCoBorrower method");
	}

	public String getInvalidMobileText() {
		logger.info("Starting of getInvalidMobileText method");

		logger.info("Ending of getInvalidMobileText method");
		return invalidMobileValidationTxt.getText();
	}

	public void setAltMobileNumberCoBorrower(String companyAltMobileNumber) {
		logger.info("Starting of setAltMobileNumberCoBorrower method");

		this.txtAlterMobileNumber.click();
		this.txtAlterMobileNumber.clear();
		this.txtAlterMobileNumber.sendKeys(companyAltMobileNumber);

		logger.info("Ending of setAltMobileNumberCoBorrower method");
	}

	public void setDateofBirth(String companyDateOfBirth) {
		logger.info("Starting of setDateofBirth method");

		this.txtDateofBirth.click();
		this.txtDateofBirth.clear();
		this.txtDateofBirth.sendKeys(companyDateOfBirth);

		logger.info("Ending of setDateofBirth method");
	}

	public void setCoBorrowerFatherName(String companyFatherName) {
		logger.info("Starting of setFatherNameCoBorrower method");

		this.txtCoBorrowerFatherName.click();
		this.txtCoBorrowerFatherName.clear();
		this.txtCoBorrowerFatherName.sendKeys(companyFatherName);

		logger.info("Ending of setFatherNameCoBorrower method");
	}

	public void setCoBorrowerMotherName(String companyMotherName) {
		logger.info("Starting of setMotherNameCoBorrower method");

		this.txtCoBorrowerMotherName.click();
		this.txtCoBorrowerMotherName.clear();
		this.txtCoBorrowerMotherName.sendKeys(companyMotherName);

		logger.info("Ending of setMotherNameCoBorrower method");
	}

	public void clickOnCoBorrowerMaritalStatus() {
		logger.info("Starting of clickOnCoBorrowerMaritalStatus method");

		this.coBorrowerMaritalStatusDrpdwn.click();
		this.selectCoBorrowerMaritalStatus.click();

		logger.info("Ending of clickOnCoBorrowerMaritalStatus method");
	}

	public void setCoBorrowerSpouseName(String companySpouseName) {
		logger.info("Starting of setCoBorrowerSpouseName method");

		this.txtCoBorrowerSpouseName.click();
		this.txtCoBorrowerSpouseName.clear();
		this.txtCoBorrowerSpouseName.sendKeys(companySpouseName);

		logger.info("Ending of setCoBorrowerSpouseName method");
	}

	public void setCoBorrowerNoOfDependent(String companyNoOfDependent) {
		logger.info("Starting of setCoBorrowerNoOfDependent method");

		this.txtCoBorrowerNoOfDependent.click();
		this.txtCoBorrowerNoOfDependent.clear();
		this.txtCoBorrowerNoOfDependent.sendKeys(companyNoOfDependent);

		logger.info("Ending of setCoBorrowerNoOfDependent method");

	}

	public void setCoBorrowerNationality(String companyNationality) {
		logger.info("Starting of setCoBorrowerNationality method");

		this.txtCoBorrowerNationality.click();
		this.txtCoBorrowerNationality.clear();
		this.txtCoBorrowerNationality.sendKeys(companyNationality);

		logger.info("Ending of setCoBorrowerNationality method");

	}

	public void clickOnCoBorrowerCategory() {
		logger.info("Starting of clickOnCoBorrowerCategory method");

		this.coBorrowerCategoryDrpdwn.click();
		this.selectCoBorrowerCategory.click();

		logger.info("Ending of clickOnCoBorrowerCategory method");

	}

	public void clickOnCoBorrowerReligion() {
		logger.info("Starting of clickCoBorrowerReligion method");

		this.coBorrowerReligionDrpdwn.click();
		this.selectCoBorrowerReligion.click();

		logger.info("Ending of clickCoBorrowerReligion method");

	}

	public void clickOnCoBorrowerEducation() {
		logger.info("Starting of clickOnCoBorrowerEducation method");

		this.coBorrowerEducationDrpdwn.click();
		this.selectCoBorrowerEducation.click();

		logger.info("Ending of clickOnCoBorrowerEducation method");

	}

	public void clickOnCoBorrowerOccupationType() {
		logger.info("Starting of clickOnCoBorrowerOccupationType method");

		this.coBorrowerOccupationTypeDrpdwn.click();
		this.selectCoBorrowerOccupationType.click();

		logger.info("Ending of clickOnCoBorrowerOccupationType method");

	}

	public void clickOnCoBorrowerOccupation() {
		logger.info("Starting of clickOnCoBorrowerOccupation method");

		this.coBorrowerOccupationDrpdwn.click();
		this.selectCoBorrowerOccupation.click();

		logger.info("Ending of clickOnCoBorrowerOccupation method");

	}

	public void clickOnCoBorrowerSourceOfIncome() {
		logger.info("Starting of clickOnCoBorrowerSourceOfIncome method");

		this.coBorrowerSourceOfIncomeDrpdwn.click();
		this.selectCoBorrowerSourceOfIncome.click();

		logger.info("Ending of clickOnCoBorrowerSourceOfIncome method");

	}

	public void setCoBorrowerGrassIncome(String coborrowerGrass) {
		logger.info("Starting of setCoBorrowerGrassIncome method");

		this.txtCoBorrowerGrassIncome.click();
		this.txtCoBorrowerGrassIncome.clear();
		this.txtCoBorrowerGrassIncome.sendKeys(coborrowerGrass);

		logger.info("Ending of setCoBorrowerGrassIncome method");

	}

	public void setCoBorrowerPanNumber(String coborrowerPan) {
		logger.info("Starting of setCoBorrowerPanNumber method");

		this.txtCoBorrowerPanNumber.click();
		this.txtCoBorrowerPanNumber.clear();
		this.txtCoBorrowerPanNumber.sendKeys(coborrowerPan);

		logger.info("Ending of setCoBorrowerPanNumber method");

	}

	public String getInvalidPanNumberText() {
		logger.info("Starting of getInvalidPanNumberText method");

		logger.info("Ending of getInvalidPanNumberText method");
		return invalidPanFiledValidation.getText();
	}

	public void setCoBorrowerAadharNumber(String coborrowerAadhar) {
		logger.info("Starting of setCoBorrowerAadharNumber method");

		this.txtCoBorrowerAadharNumber.click();
		this.txtCoBorrowerAadharNumber.clear();
		this.txtCoBorrowerAadharNumber.sendKeys(coborrowerAadhar);

		logger.info("Ending of setCoBorrowerAadharNumber method");

	}

	public String getInvalidAadharText() {
		logger.info("Starting of getInvalidAadharText method");

		logger.info("Ending of getInvalidAadharText method");
		return invaildAadharfieldValidation.getText();
	}

	public void clickOnAddCoBorrowerButton2() {
		logger.info("Starting of clickOnAddCoBorrowerButton2 method");

		this.btnAddCoBorrowerDetails.click();

		logger.info("Ending of clickOnAddCoBorrowerButton2 method");
	}

	public void clickonAddressIconButton() {
		logger.info("Starting of clickonAddressIconButton method");

		this.clickOnAddressIcon.click();

		logger.info("Ending of clickonAddressIconButton method");

	}

	public void setAddressline1(String addressLine1) {
		logger.info("Starting of txtAddressline1 method");

		this.txtAddressline1.click();
		this.txtAddressline1.clear();
		this.txtAddressline1.sendKeys(addressLine1);

		logger.info("Ending of txtAddressline1 method");

	}

	public void setAddressline2(String addressLine2) {
		logger.info("Starting of setAddressline2 method");

		this.txtAddressline2.click();
		this.txtAddressline2.clear();
		this.txtAddressline2.sendKeys(addressLine2);

		logger.info("Ending of setAddressline2 method");

	}

	public void setCoBorrowerPincode(String coborrowerPincode) {
		logger.info("Starting of setCoBorrowerPincode method");

		this.txtCoBorrowerPincode.click();
		this.txtCoBorrowerPincode.clear();
		this.txtCoBorrowerPincode.sendKeys(coborrowerPincode);

		logger.info("Ending of setCoBorrowerPincode method");

	}

	public String getInvalidPincodeText() {
		logger.info("Starting of getInvalidPincodeText method");

		logger.info("Ending of getInvalidPincodeText method");
		return invalidPincodeValidationText.getText();
	}

	public void setResidingYear(String residingYear) {
		logger.info("Starting of setResidingYear method");

		this.txtResidingYear.click();
		this.txtResidingYear.clear();
		this.txtResidingYear.sendKeys(residingYear);

		logger.info("Ending of setResidingYear method");

	}

	public void setOwnership() {
		logger.info("Starting of setOwnership method");

		this.ownershipTypeDrpdwn.click();
		this.selectOwnerType.click();

		logger.info("Ending of setOwnership method");

	}

	public void setOwnerName(String ownerName) {
		logger.info("Starting of setOwnerName method");

		this.txtownerName.click();
		this.txtownerName.clear();
		this.txtownerName.sendKeys(ownerName);

		logger.info("Ending of setOwnerName method");

	}

	public void setRelationship(String relationship) {
		logger.info("Starting of setRelationship method");

		this.txtRelationwithOwner.click();
		this.txtRelationwithOwner.clear();
		this.txtRelationwithOwner.sendKeys(relationship);

		logger.info("Ending of setRelationship method");

	}

	public void clickOnAddAddressButton() {
		logger.info("Starting of clickOnAddAddressButton method");

		this.btnAddAddress.click();

		logger.info("Ending of clickOnAddAddressButton method");

	}

	public void clickonDocumenticon() {
		logger.info("Starting of clickonDocumenticon method");

		this.documentEditIcon.click();

		logger.info("Ending of clickonDocumenticon method");
	}

	public void setSelectLblDetails() {
		logger.info("Starting of setSelectLblDetails method");

		this.selectlblDrpDwn.click();
		this.selectlblType.click();

		logger.info("Ending of setSelectLblDetails method");
	}

	public void clickOnbrowseChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnbrowseChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			browseChoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			browseChoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			browseChoosefile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnbrowseChooseFile method");
	}

	public void clickOnUploadButton() {
		logger.info("Starting of clickOnUploadButton method");

		this.btnUpload.click();

		logger.info("Ending of clickOnUploadButton method");

	}

	public void setDocumentDetails(String bankDocumentsUploadFile) {

		this.clickonDocumenticon();
		this.setSelectLblDetails();
		this.clickOnbrowseChooseFile(bankDocumentsUploadFile);
		this.clickOnUploadButton();
		this.clickOutside();

	}

	public void clickOnViewDetailsButton() {
		logger.info("Starting of clickOnViewDetailsButton method");

		this.clickOnElement(btnEditCoBorrower);

		logger.info("Ending of clickOnViewDetailsButton method");
	}

	public void clickOnUpdateCoBorrowerButton() {
		logger.info("Starting of clickOnUpdateCoBorrowerButton method");

		this.btnupdateCoBorrower.click();

		logger.info("Ending of clickOnUpdateCoBorrowerButton method");
	}

	public void setCoBorrowerDetails(String coborrowerFirstName, String coborrowerMiddleName, String coborrowerLastName,
			String coborrowerEmail, String coborrowerMobileNumber, String coborrowerAltMobileNumber,
			String coborrowerDateOfBirth, String coborrowerFatherName, String coborrowerMotherName,
			String coborrowerSpouseName, String coborrowerNoOfDependent, String coborrowerNationality,
			String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {
		logger.info("Starting of setEditCoBorrowerDetails method");

		this.clickOnCoBorrowerTab();
		this.clickOnAddCoBorrowerButton();
		this.clickOnAddCoBorrowertitleDrpdwn();
		this.setCoBorrowerFirstName(coborrowerFirstName);
		this.setCoBorrowerMidleName(coborrowerMiddleName);
		this.setCoBorrowerLastName(coborrowerLastName);
		this.clickOnAddCoBorrowerGenderDrpdwn();
		this.setEmailCoBorrower(coborrowerEmail);
		this.setMobileNumberCoBorrower(coborrowerMobileNumber);
		this.setAltMobileNumberCoBorrower(coborrowerAltMobileNumber);
		this.setDateofBirth(coborrowerDateOfBirth);
		this.setCoBorrowerFatherName(coborrowerFatherName);
		this.setCoBorrowerMotherName(coborrowerMotherName);
		this.clickOnCoBorrowerMaritalStatus();
		this.setCoBorrowerSpouseName(coborrowerSpouseName);
		this.setCoBorrowerNoOfDependent(coborrowerNoOfDependent);
		this.setCoBorrowerNationality(coborrowerNationality);
		this.clickOnCoBorrowerCategory();
		this.clickOnCoBorrowerReligion();
		this.clickOnCoBorrowerEducation();
		this.clickOnCoBorrowerOccupationType();
		this.clickOnCoBorrowerOccupation();
		this.clickOnCoBorrowerSourceOfIncome();
		this.setCoBorrowerGrassIncome(coborrowerGrass);
		this.setCoBorrowerPanNumber(coborrowerPan);
		this.setCoBorrowerAadharNumber(coborrowerAadhar);
		this.clickOnUpdateCoBorrowerButton();

		logger.info("Ending of setEditCoBorrowerDetails method");
	}

	public void setCoBorrowerAddressDetails(String addressLine1, String addressLine2, String pincode,
			String residingYear, String ownerName, String relationshipOwner) {
		logger.info("Starting of setCoBorrowerAddressDetails method");

		this.clickonAddressIconButton();
		this.setAddressline1(addressLine1);
		this.setAddressline2(addressLine2);
		this.setCoBorrowerPincode(pincode);
		this.setResidingYear(residingYear);
		this.setOwnership();
		this.setOwnerName(ownerName);
		this.setRelationship(relationshipOwner);
		this.clickOnAddAddressButton();

		logger.info("Ending of setCoBorrowerAddressDetails method");
	}

	public void setEditCoBorrowerEditDetails(String coborrowerFirstName, String coborrowerMiddleName,
			String coborrowerLastName, String coborrowerEmail, String coborrowerMobileNumber,
			String coborrowerAltMobileNumber, String coborrowerDateOfBirth, String coborrowerFatherName,
			String coborrowerMotherName, String coborrowerSpouseName, String coborrowerNoOfDependent,
			String coborrowerNationality, String coborrowerGrass, String coborrowerPan, String coborrowerAadhar) {

		logger.info("Starting of setEditCoBorrowerDetails method");

		this.clickOnViewDetailsButton();
		this.clickOnAddCoBorrowertitleDrpdwn();
		this.setCoBorrowerFirstName(coborrowerFirstName);
		this.setCoBorrowerMidleName(coborrowerMiddleName);
		this.setCoBorrowerLastName(coborrowerLastName);
		this.clickOnAddCoBorrowerGenderDrpdwn();
		this.setEmailCoBorrower(coborrowerEmail);
		this.setMobileNumberCoBorrower(coborrowerMobileNumber);
		this.setAltMobileNumberCoBorrower(coborrowerAltMobileNumber);
		this.setDateofBirth(coborrowerDateOfBirth);
		this.setCoBorrowerFatherName(coborrowerFatherName);
		this.setCoBorrowerMotherName(coborrowerMotherName);
		this.clickOnCoBorrowerMaritalStatus();
		this.setCoBorrowerSpouseName(coborrowerSpouseName);
		this.setCoBorrowerNoOfDependent(coborrowerNoOfDependent);
		this.setCoBorrowerNationality(coborrowerNationality);
		this.clickOnCoBorrowerCategory();
		this.clickOnCoBorrowerReligion();
		this.clickOnCoBorrowerEducation();
		this.clickOnCoBorrowerOccupationType();
		this.clickOnCoBorrowerOccupation();
		this.clickOnCoBorrowerSourceOfIncome();
		this.setCoBorrowerGrassIncome(coborrowerGrass);
		this.setCoBorrowerPanNumber(coborrowerPan);
		this.setCoBorrowerAadharNumber(coborrowerAadhar);
		this.clickOnUpdateCoBorrowerButton();

		logger.info("Ending of setEditCoBorrowerDetails method");
	}

}
