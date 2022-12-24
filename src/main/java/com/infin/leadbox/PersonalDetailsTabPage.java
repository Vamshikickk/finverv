package com.infin.leadbox;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class PersonalDetailsTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(PersonalDetailsTabPage.class.getName());

	String lblTxt = "//input[@type='text']";

	@FindBy(xpath = "//span[text()='Personal Details']")
	private WebElement lblTxtPersonalDetails;

	@FindBy(id = "open_person_details")
	private WebElement personalDetailsEditcon;

	@FindBy(id = "borrower_title")
	private WebElement titledrpdwn;

	@FindBy(xpath = "//div[text()='Mr']")
	private WebElement selectTitle;

	@FindBy(id = "borrower_first_name")
	private WebElement txtFirstName;

	@FindBy(id = "borrower_middle_name")
	private WebElement txtMiddleName;

	@FindBy(id = "borrower_last_name")
	private WebElement txtLastname;

	@FindBy(id = "borrower_gender")
	private WebElement genderDrpdwn;

	@FindBy(xpath = "//div[text()='Male']")
	private WebElement selectGender;

	@FindBy(id = "borrower_email")
	private WebElement txtEmail;

	@FindBy(xpath = "//span[text()='Email not valid.']")
	private WebElement inavlidEmailValidationTxt;

	@FindBy(id = "borrower_alternate_number")
	private WebElement txtAlternateMobileNumber;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement selectDOB;

	@FindBy(xpath = "//label[text()='Date of Birth *']")
	private WebElement lblDob;

	@FindBy(id = "borrower_father_name")
	private WebElement txtFatherName;

	@FindBy(id = "borrower_mother_name")
	private WebElement txtMotherName;

	@FindBy(id = "borrower_marital")
	private WebElement maritalStatusDrpdwn;

	@FindBy(xpath = "//div[text()='Unmarried']")
	private WebElement selectMaritalStatus;

	@FindBy(id = "borrower_spouse")
	private WebElement txtSpouseName;

	@FindBy(id = "borrower_no_of_dependent")
	private WebElement txtNoofDependent;

	@FindBy(id = "borrower_nationality")
	private WebElement txtNationality;

	@FindBy(id = "borrower_category")
	private WebElement categoryDrpdwn;

	@FindBy(xpath = "//div[text()='OBC']")
	private WebElement selectCategory;

	@FindBy(id = "borrower_religion")
	private WebElement religionDrpdwn;

	@FindBy(xpath = "//div[text()='Hindu']")
	private WebElement selectReligion;

	@FindBy(id = "borrower_education_level")
	private WebElement educationlevelDrpdwn;

	@FindBy(xpath = "//div[text()='Graduate']")
	private WebElement selectEducation;

	@FindBy(id = "borrower_occupation_type")
	private WebElement occupationTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Salaried']")
	private WebElement selectOccupationType;

	@FindBy(id = "borrower_occupation")
	private WebElement occupationDrpdwn;

	@FindBy(xpath = "//div[text()='Others']")
	private WebElement selectOccupation;

	@FindBy(id = "borrower_source_of_income")
	private WebElement sourceOfIncomeDrpdwn;

	@FindBy(xpath = "//div[text()='Salary']")
	private WebElement selectSourceType;

	@FindBy(id = "borrower_gross_annual_income")
	private WebElement txtGrassannualIncome;

	@FindBy(id = "borrower_pan_number")
	private WebElement txtPanNumber;

	@FindBy(xpath = "//span[text()='Pan not valid.']")
	private WebElement invalidPanValidationTxt;

	@FindBy(id = "borrower_aadhar_number")
	private WebElement txtAadharNo;

	@FindBy(xpath = "//span[text()='Aadhar not valid.']")
	private WebElement invalidAadharValidationTxt;

	@FindBy(id = "borrower_submit")
	private WebElement btnSavePersonalDetails;

	@FindBy(id = "show_documents_personal_details")
	private WebElement iconDocuments;

	@FindBy(id = "select_show_documents_personal_details")
	private WebElement lblSelecet;

	@FindBy(xpath = "//div[text()='Aadhar Card']")
	private WebElement selectLblDocument;

	@FindBy(id = "choose_show_documents_personal_details")
	private WebElement browseChooseFile;

	@FindBy(id = "upload_show_documents_personal_details")
	private WebElement btnUploadinPersonalDetails;

	@FindBy(xpath = "//span[text()='Permanent Address']")
	private WebElement lblTxtPermanentAddress;

	@FindBy(xpath = "(//img[@class='editicon'])[2]")
	private WebElement permanentdAdressEditicon;

	@FindBy(id = "borrower_permanent_address_address_line_1")
	private WebElement txtPermanentAddressAddressline1;

	@FindBy(id = "borrower_permanent_address_address_line_2")
	private WebElement txtPermanentAddressAddressline2;

	@FindBy(id = "borrower_permanent_address_pincode")
	private WebElement txtPermanentAddressPincode;

	@FindBy(xpath = "//span[text()='pincode-Invalid Pincode Shared']")
	private WebElement invalidPermanentPincodeValidationtext;

	@FindBy(id = "borrower_permanent_address_vintage")
	private WebElement txtPermanentAddressResidingSince;

	@FindBy(id = "borrower_permanent_address_ownership_type")
	private WebElement permanentAddressOwnershipTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Family']")
	private WebElement selectPermanentOwnershipType;

	@FindBy(id = "borrower_permanent_address_owner_name")
	private WebElement txtPermanentAddresOwnerName;

	@FindBy(id = "borrower_permanent_address_relation_with_owner")
	private WebElement txtPermanentAddresRelationship;

	@FindBy(id = "submit_borrower_permanent_address")
	private WebElement btnPermanentAddresUpdateAddress;

	@FindBy(id = "show_documents_borrower_permanent_address")
	private WebElement permanentDocumentEditIcon;

	@FindBy(id = "select_show_documents_borrower_permanent_address")
	private WebElement permanentAddressSelectLblDrpDwn;

	@FindBy(xpath = "//div[text()='Rent Agreement']")
	private WebElement selectLblDrpDwnType;

	@FindBy(id = "choose_show_documents_borrower_permanent_address")
	private WebElement permanentAddresschoosefile;

	@FindBy(id = "upload_show_documents_borrower_permanent_address")
	private WebElement btnAddPermanentDocumentUpload;

	@FindBy(xpath = "//span[text()='Resident Address']")
	private WebElement lblTxtResidentAddress;

	@FindBy(xpath = "(//img[@class='editicon'])[3]")
	private WebElement editResidenceAddressEditIcon;

	@FindBy(id = "borrower_resident_address_address_line_1")
	private WebElement txtResidenceAddressline1;

	@FindBy(id = "borrower_resident_address_address_line_2")
	private WebElement txtResidenceAddressline2;

	@FindBy(id = "borrower_resident_address_pincode")
	private WebElement txtResidencePincode;

	@FindBy(xpath = "//span[text()='pincode-Invalid Pincode Shared']")
	private WebElement invalidResidentPincodeValidationTxt;

	@FindBy(id = "borrower_resident_address_vintage")
	private WebElement txtResidenceResiding;

	@FindBy(id = "borrower_resident_address_ownership_type")
	private WebElement residingOwnerTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Family']")
	private WebElement selectctResidentOwnerType;

	@FindBy(id = "borrower_resident_address_owner_name")
	private WebElement txtResidenceOwnerName;

	@FindBy(id = "borrower_resident_address_relation_with_owner")
	private WebElement txtResidenceRelationWithOwner;

	@FindBy(id = "submit_borrower_resident_address")
	private WebElement btnClickOnResidingAddAdress;

	@FindBy(id = "show_documents_borrower_resident_address")
	private WebElement residentDocumentEditIcon;

	@FindBy(id = "select_show_documents_borrower_resident_address")
	private WebElement residentSelectLblDrpDwn;

	@FindBy(xpath = "//div[text()='Rent Agreement']")
	private WebElement selectResidentLblDrpDwnType;

	@FindBy(id = "choose_show_documents_borrower_resident_address")
	private WebElement residentAddressChooseFile;

	@FindBy(id = "upload_show_documents_borrower_resident_address")
	private WebElement residentAdddressUploadButton;

	@FindBy(xpath = "//span[text()='Bank Account']")
	private WebElement lblTxtBankAccount;

	@FindBy(id = "open_borrower_bank_account")
	private WebElement editBankAccountIcon;

	@FindBy(id = "borrower_bank_account_account_type")
	private WebElement accountDrpdwn;

	@FindBy(xpath = "//div[text()='Current']")
	private WebElement selectAccountType;

	@FindBy(id = "borrower_bank_account_ifsc_code")
	private WebElement txtIfscCode;

	@FindBy(xpath = "//span[text()='ifsc_code-Invalid Ifsc Code']")
	private WebElement invalidifsclbltext;

	@FindBy(id = "borrower_bank_account_account_number")
	private WebElement txtAccountNumber;

	@FindBy(id = "borrower_bank_account_account_name")
	private WebElement txtAccountName;

	@FindBy(xpath = "//input[@type ='checkbox']")
	private WebElement chkbxNaach;

	@FindBy(id = "submit_borrower_bank_account")
	private WebElement btnClickOnAddAccount;

	@FindBy(id = "show_documents_borrower_bank_account")
	private WebElement iconBankDocument;

	@FindBy(id = "select_show_documents_borrower_bank_account")
	private WebElement lblBankDrpdwn;

	@FindBy(xpath = "//div[text()='6 Months Bank Statement']")
	private WebElement selectBankDoumentType;

	@FindBy(id = "choose_show_documents_borrower_bank_account")
	private WebElement browseBankDoumnts;

	@FindBy(id = "upload_show_documents_borrower_bank_account")
	private WebElement btnBankUpload;

	public PersonalDetailsTabPage(WebDriver driver) {
		super(driver);

	}

	public String getLblPerosalDetailsTxt() {
		logger.info("Starting of getLblPerosalDetailsTxt method");

		logger.info("Ending of getLblPerosalDetailsTxt method");
		return lblTxtPersonalDetails.getText();

	}

	public void clickOnPersonalDetailsEditIcon() {
		logger.info("Start of clickOnPersonalDetailsEditIcon method");

		this.personalDetailsEditcon.click();

		logger.info("Ending of clickOnPersonalDetailsEditIcon method");
	}

	public void selectTitle() {
		logger.info("Srarting of selectTitle method");

		this.titledrpdwn.click();
		this.selectTitle.click();

		logger.info("Ending of selectTitle method");
	}

	public void setFirstName(String firstName) {
		logger.info("Start of setFirstName method");

		this.txtFirstName.click();
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys(firstName);

		logger.info("Ending of setFirstName method");

	}

	public void setMiddleName(String middleName) {
		logger.info("Start of setMiddleName method");

		this.txtMiddleName.click();
		this.txtMiddleName.clear();
		this.txtMiddleName.sendKeys(middleName);

		logger.info("Ending of setMiddleName method");

	}

	public void setLastName(String lastNname) {
		logger.info("Start of setLastName method");

		this.txtLastname.click();
		this.txtLastname.clear();
		this.txtLastname.sendKeys(lastNname);

		logger.info("Ending of setLastName method");
	}

	public void clickonSelectGender() {
		logger.info("Starting of clickonSelectGender method");

		this.genderDrpdwn.click();
		this.selectGender.click();

		logger.info("Ending of clickonSelectGender method");
	}

	public void setEmail(String email) {
		logger.info("Start of setValidEmaill method");

		this.txtEmail.click();
		this.txtEmail.clear();
		this.txtEmail.sendKeys(email);

		logger.info("Ending of setValidEmaill method");
	}

	public String getInvalidEmailValidationTxt() {
		logger.info("Starting of getInvalidEmailtxt method");

		logger.info("Ending of getInvalidEmailtxt method");
		return inavlidEmailValidationTxt.getText();

	}

	public void setAltmobileno(String AltMblNo) {
		logger.info("Start of setAltmobileno method");

		this.scrollDown(50);
		this.txtAlternateMobileNumber.click();
		this.txtAlternateMobileNumber.clear();
		this.txtAlternateMobileNumber.sendKeys(AltMblNo);

		logger.info("Ending of setAltmobileno method");
	}

	public void setDob(String dateofbirth) {
		logger.info("Starting of setDob method");

		this.selectDOB.sendKeys(dateofbirth);

		logger.info("Ending of setDob method");
	}

	public void setFatherName(String fatherName) {
		logger.info("Start of setFatherName method");

		this.scrollDown(100);
		this.txtFatherName.click();
		this.txtFatherName.clear();
		this.txtFatherName.sendKeys(fatherName);

		logger.info("Ending of setFatherName method");
	}

	public void setMotherName(String motherName) {
		logger.info("Start of setMotherName method");

		this.txtMotherName.click();
		this.txtMotherName.clear();
		this.txtMotherName.sendKeys(motherName);

		logger.info("Ending of setMotherName method");
	}

	public void selectMaritalStatus() {
		logger.info("Starting of selectMaritalStatus method");

		this.maritalStatusDrpdwn.click();
		this.selectMaritalStatus.click();

		logger.info("Ending of selectMaritalStatus method");

	}

	public void setSpouseName(String spouseName) {
		logger.info("Start of setSpouseName method");

		this.txtSpouseName.click();
		this.txtSpouseName.clear();
		this.txtSpouseName.sendKeys(spouseName);

		logger.info("Ending of setSpouseName method");
	}

	public void setNoofDependent(String noOfDependt) {
		logger.info("Start of setNoofDependent method");

		this.scrollDown(50);
		this.txtNoofDependent.click();
		this.txtNoofDependent.clear();
		this.txtNoofDependent.sendKeys(noOfDependt);

		logger.info("Ending of setNoofDependent method");
	}

	public void setNationality(String nationality) {
		logger.info("Starting of setNationality method");

		this.txtNationality.click();
		this.txtNationality.clear();
		this.txtNationality.sendKeys(nationality);

		logger.info("Ending of setNationality method");
	}

	public void selectCategory() {
		logger.info("Starting of selectCategory method");

		this.categoryDrpdwn.click();
		this.selectCategory.click();

		logger.info("Ending of selectCategory method");
	}

	public void selectReligion() {
		logger.info("Starting of selectReligion method");

		this.religionDrpdwn.click();
		this.selectReligion.click();

		logger.info("Ending of selectReligion method");
	}

	public void selectEducation() {
		logger.info("Starting of selectEducation method");

		this.scrollDown(100);
		this.educationlevelDrpdwn.click();
		this.selectEducation.click();

		logger.info("Ending of selectEducation method");
	}

	public void selectOccupationtype() {
		logger.info("Starting of selectOccupationtype method");

		this.occupationTypeDrpdwn.click();
		this.selectOccupationType.click();

		logger.info("Ending of selectOccupationtype method");
	}

	public void selectOccupation() {
		logger.info("Starting of selectOccupation method");

		this.occupationDrpdwn.click();
		this.selectOccupation.click();

		logger.info("Ending of selectOccupation method");
	}

	public void selectSourceofIncome() {
		logger.info("Start of selectSourceofIncome method");

		this.sourceOfIncomeDrpdwn.click();
		this.selectSourceType.click();

		logger.info("Ending of selectSourceofIncome method");
	}

	public void setGrassIncome(String income) {
		logger.info("Start of setGrassIncome method");

		this.scrollDown(100);
		this.txtGrassannualIncome.click();
		this.txtGrassannualIncome.clear();
		this.txtGrassannualIncome.sendKeys(income);

		logger.info("Ending of setGrassIncome method");
	}

	public void setPanNumber(String panNumber) {
		logger.info("Starting of setPanNumber method");

		this.txtPanNumber.click();
		this.txtPanNumber.clear();
		this.txtPanNumber.sendKeys(panNumber);

		logger.info("Ending of setPanNumber method");

	}

	public String getInvalidPanValidationTxt() {
		logger.info("Starting of getInvalidPanText method");

		logger.info("Ending of getInvalidPanText method");
		return invalidPanValidationTxt.getText();

	}

	public void setAadharNumber(String aadharNumber) {
		logger.info("Starting of setAadharNumber method");

		this.txtAadharNo.click();
		this.txtAadharNo.clear();
		this.txtAadharNo.sendKeys(aadharNumber);

		logger.info("Ending setAadharNumber method");
	}

	public String getInvalidAadharValidationTxt() {
		logger.info("Starting of getInvalidAadharTxt method");

		logger.info("Ending of getInvalidAadharTxt method");
		return invalidAadharValidationTxt.getText();

	}

	public void clickOnSavePersonlDetailbtn() {
		logger.info("Starting of clickOnSavePersonlDetailbtn method");

		this.btnSavePersonalDetails.click();

		logger.info("Starting of clickOnSavePersonlDetailbtn method");
	}

	public void uploadDocument() {
		logger.info("Starting of uploadDocument method");

		this.implicitWait();
		this.clickOnElement(iconDocuments);
		this.lblSelecet.click();
		this.selectLblDocument.click();

		logger.info("Ending of uploadDocument method");

	}

	public void clickOnbrowseChooseFile(String documentsUploadFile) {
		logger.info("Starting of clickOnbrowseChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			browseChooseFile.sendKeys(TEST_FILE_PATH + "/" + documentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			browseChooseFile.sendKeys(TEST_FILE_PATH + "/" + documentsUploadFile);

		} else {

			browseChooseFile.sendKeys(TEST_FILE_PATH + "\\" + documentsUploadFile);
		}

		logger.info("Ending of clickOnbrowseChooseFile method");
	}

	public void uploadButton() {
		logger.info("Starting of uploadButton method");

		this.btnUploadinPersonalDetails.click();
		this.clickOutside();

		logger.info("Ending of uploadButton method");
	}

	public String getLblPermanentAddressText() {
		logger.info("Starting of getLblPermanentAddressText method");

		logger.info("Ending of getLblPermanentAddressText method");
		return lblTxtPermanentAddress.getText();
	}

	public void clickOnPermanentAddressEditicon() {
		logger.info("Starting of clickOnPermanentAddrssEditicon method");

		this.clickOnWebElement(permanentdAdressEditicon);

		logger.info("Starting of clickOnPermanentAddrssEditicon method");
	}

	public void setAddressline1(String addressLine1) {
		logger.info("Starting of setAddressline1 method");

		this.txtPermanentAddressAddressline1.click();
		this.txtPermanentAddressAddressline1.clear();
		this.txtPermanentAddressAddressline1.sendKeys(addressLine1);

		logger.info("Starting of setAddressline1 method");

	}

	public void setAddressline2(String addressLine2) {
		logger.info("Starting of setAddressline2 method");

		this.txtPermanentAddressAddressline2.click();
		this.txtPermanentAddressAddressline2.clear();
		this.txtPermanentAddressAddressline2.sendKeys(addressLine2);

		logger.info("Starting of setAddressline2 method");

	}

	public void setpermanentPincode(String validPincode) {
		logger.info("Starting of setpermanentPincode method");

		this.txtPermanentAddressPincode.click();
		this.txtPermanentAddressPincode.clear();
		this.txtPermanentAddressPincode.sendKeys(validPincode);

		logger.info("Starting of setpermanentPincode method");
	}

	public String getInvalidPincodeValidationtxt() {
		logger.info("Starting of getInvalidPincodeValidationtxt method");

		logger.info("Ending of getInvalidPincodeValidationtxt method");
		return invalidPermanentPincodeValidationtext.getText();

	}

	public void setResidingSinceinPermanent(String year) {
		logger.info("Starting of setResidingSinceinPermanent method");

		this.txtPermanentAddressResidingSince.click();
		this.txtPermanentAddressResidingSince.clear();
		this.txtPermanentAddressResidingSince.sendKeys(year);

		logger.info("Starting of setResidingSinceinPermanent method");
	}

	public void selectOwnershipType() {
		logger.info("Starting of selectOwnership method");

		this.permanentAddressOwnershipTypeDrpdwn.click();
		this.selectPermanentOwnershipType.click();

		logger.info("Starting of selectOwnership method");
	}

	public void setOwnerName(String ownerName) {
		logger.info("Starting of setOwnerName method");

		this.txtPermanentAddresOwnerName.click();
		this.txtPermanentAddresOwnerName.clear();
		this.txtPermanentAddresOwnerName.sendKeys(ownerName);

		logger.info("Starting of setOwnerName method");
	}

	public void setRelationshipWithOwner(String relation) {
		logger.info("Starting of enterRelationshipWithOwner method");

		this.txtPermanentAddresRelationship.click();
		this.txtPermanentAddresRelationship.clear();
		this.txtPermanentAddresRelationship.sendKeys(relation);

		logger.info("Starting of enterRelationshipWithOwner method");
	}

	public void clickOnbtnPermanentAddrssAddAddress() {
		logger.info("Starting of clickOnbtnPermanentAddrssUpdateAddress method");

		this.btnPermanentAddresUpdateAddress.click();

		logger.info("Starting of clickOnbtnPermanentAddrssUpdateAddress method");
	}

	public void permanentDetailsUploadDocument() {
		logger.info("Starting of permanentDetailsUploadDocument method");

		this.clickOnElement(permanentDocumentEditIcon);
		this.permanentAddressSelectLblDrpDwn.click();
		this.selectLblDrpDwnType.click();

		logger.info("Ending of permanentDetailsUploadDocument method");
	}

	public void clickOnPermanentAddressChoosefile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnPermanentAddressChoosefile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			permanentAddresschoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			permanentAddresschoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			permanentAddresschoosefile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnPermanentAddressChoosefile method");
	}

	public void clickOnPermanentUploadButton() {
		logger.info("Starting of clickOnPermanentUploadButton method");

		this.btnAddPermanentDocumentUpload.click();

		logger.info("Ending of clickOnPermanentUploadButton method");
	}

	public String getLblResidentAddresstxt() {
		logger.info("Starting of getLblResidentAddresstxt method");

		logger.info("Ending of getLblResidentAddresstxt method");
		return lblTxtResidentAddress.getText();

	}

	public void clickOnResidentAddressEditicon() {
		logger.info("Starting of clickOnResidentAddressEditicon method");

		this.clickOnWebElement(editResidenceAddressEditIcon);

		logger.info("Starting of clickOnResidentAddressEditicon method");
	}

	public void setResidingAddressline1(String addressLine1) {
		logger.info("Starting of setResidingAddressline1 method");

		this.txtResidenceAddressline1.click();
		this.txtResidenceAddressline1.clear();
		this.txtResidenceAddressline1.sendKeys(addressLine1);

		logger.info("Ending of setResidingAddressline1 method");
	}

	public void setResidingAddressline2(String addressLine2) {
		logger.info("Starting of setResidingAddressline2 method");

		this.txtResidenceAddressline2.click();
		this.txtResidenceAddressline2.clear();
		this.txtResidenceAddressline2.sendKeys(addressLine2);

		logger.info("Ending of setResidingAddressline2 method");
	}

	public void setResidingPincode(String validPincode) {
		logger.info("Starting of setResidingPincode method");

		this.txtResidencePincode.click();
		this.txtResidencePincode.clear();
		this.txtResidencePincode.sendKeys(validPincode);

		logger.info("Ending of setResidingPincode method");
	}

	public String getInvalidResidentPincodeValidationTxt() {
		logger.info("Starting of getInvalidResidentPincodeValidationTxt method");

		logger.info("Ending of getInvalidResidentPincodeValidationTxt method");
		return invalidResidentPincodeValidationTxt.getText();

	}

	public void setResidingYear(String year) {
		logger.info("Starting of setResidingYear method");

		this.txtResidenceResiding.click();
		this.txtResidenceResiding.clear();
		this.txtResidenceResiding.sendKeys(year);

		logger.info("Ending of setResidingYear method");
	}

	public void selectResidingOwnerType() {
		logger.info("Starting of selectResidingOwnerType method");

		this.residingOwnerTypeDrpdwn.click();
		this.selectctResidentOwnerType.click();

		logger.info("Ending of selectResidingOwnerType method");
	}

	public void setResidingOwnerName(String ownerName) {
		logger.info("Starting of setResidingOwnerName method");

		this.txtResidenceOwnerName.click();
		this.txtResidenceOwnerName.clear();
		this.txtResidenceOwnerName.sendKeys(ownerName);

		logger.info("Ending of setResidingOwnerName method");
	}

	public void setResidingRelation(String relation) {
		logger.info("Starting of setResidingRelation method");

		this.txtResidenceRelationWithOwner.click();
		this.txtResidenceRelationWithOwner.clear();
		this.txtResidenceRelationWithOwner.sendKeys(relation);

		logger.info("Ending of setResidingRelation method");
	}

	public void clickOnResidingAddAddressButton() {
		logger.info("Starting of clickOnResidingAddAddressButton method");

		this.btnClickOnResidingAddAdress.click();

		logger.info("Ending of clickOnResidingAddAddressButton method");
	}

	public void residentAdddressUploadButton() {
		logger.info("Starting of clickOnResidentDocumentIcon method");

		this.clickOnElement(residentDocumentEditIcon);
		this.residentSelectLblDrpDwn.click();
		this.selectResidentLblDrpDwnType.click();

		logger.info("Ending of clickOnResidentDocumentIcon method");

	}

	public void clickOnResidentChooseFiles(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnResidentChooseFiles method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			residentAddressChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			residentAddressChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			residentAddressChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnResidentChooseFiles method");
	}

	public void clickOnResidentDetailsUploadButton() {
		logger.info("Starting of clickOnResidentDetailsUploadButton method");

		this.residentAdddressUploadButton.click();

		logger.info("Ending of clickOnResidentDetailsUploadButton method");

	}

	public String getLblBankAccounttxt() {
		logger.info("Starting of getLblBankAccounttxt method");

		logger.info("Ending of getLblBankAccounttxt method");
		return lblTxtBankAccount.getText();
	}

	public void clickOnBankAccountEditIcon() {
		logger.info("Starting of clickOnBankAccountEditIcon method");

		this.clickOnWebElement(editBankAccountIcon);

		logger.info("Ending of clickOnBankAccountEditIcon method");
	}

	public void selectAccountType() {
		logger.info("Starting of selectAccountType method");

		this.accountDrpdwn.click();
		this.selectAccountType.click();

		logger.info("Ending of selectAccountType method");
	}

	public void setInvalidIfscCode(String invalidifsc) {
		logger.info("Starting of setInvalidIfscCode method");

		this.txtIfscCode.click();
		this.txtIfscCode.clear();
		this.txtIfscCode.sendKeys(invalidifsc);

		logger.info("Ending of setInvalidIfscCode method");
	}

	public String getInvalidifsclbltxt() {
		logger.info("Starting of getInvalidifsclbltxt method");

		logger.info("Ending of getInvalidifsclbltxt method");
		return invalidifsclbltext.getText();

	}

	public void setIfscCode(String ifsc) {
		logger.info("Starting of setIfscCode method");

		this.txtIfscCode.click();
		this.txtIfscCode.clear();
		this.txtIfscCode.sendKeys(ifsc);

		logger.info("Ending of setIfscCode method");
	}

	public void setAccountNumber(String accountNumber) {
		logger.info("Starting of setAccountNumber method");

		this.txtAccountNumber.click();
		this.txtAccountNumber.clear();
		this.txtAccountNumber.sendKeys(accountNumber);

		logger.info("Ending of setAccountNumber method");
	}

	public void setAccountName(String accountName) {
		logger.info("Starting of setAccountName method");

		this.txtAccountName.click();
		this.txtAccountName.clear();
		this.txtAccountName.sendKeys(accountName);

		logger.info("Ending of setAccountName method");
	}

	public void clickOnNachCheckBox() {
		logger.info("Starting of clickOnNachCheckBox method");

		boolean checkbox = this.chkbxNaach.isSelected();
		try {
			if (checkbox == true) {
				logger.info("check box is allready selected");

			} else {
				this.chkbxNaach.click();
			}
		} catch (Exception e) {

			logger.info("Ending of clickOnNachCheckBox method");
		}
	}

	public void clickonAddAccountButton() {
		logger.info("Starting of clickonAddAccountButton method");

		this.btnClickOnAddAccount.click();

		logger.info("Ending of clickonAddAccountButton method");
	}

	public void clickonBankDocumentIcon() {
		logger.info("Starting of clickonBankDocumentIcon method");

		this.clickOnWebElement(iconBankDocument);
		this.lblBankDrpdwn.click();
		this.selectBankDoumentType.click();

		logger.info("Starting of clickonBankDocumentIcon method");

	}

	public void clickOnbrowseChooseFile2(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnbrowseChooseFile2 method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			browseBankDoumnts.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			browseBankDoumnts.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			browseBankDoumnts.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnbrowseChooseFile2 method");
	}

	public void clickOnUploadBankDocumentsButton() {
		logger.info("Strating of clickOnUploadBankDocumentsButton method");

		this.btnBankUpload.click();
		this.clickOutside();

		logger.info("Ending of clickOnUploadBankDocumentsButton method");

	}

	public void setPersonalDetails(String firstName, String middleName, String lastNname, String email, String AltMblNo,
			String dateofbirth, String fatherName, String motherName, String spouseName, String noOfDependt,
			String nationality, String income, String panNumber, String aadharNumber) {

		logger.info("Starting of setPersonalDetails method");

		driver.findElement(By.xpath("//a[text()='Lead Box']")).click();
		driver.findElement(By.xpath("//a[text()='PRAI-wxxu1q']")).click();
		driver.findElement(By.xpath("(//img[@class='editicon'])[1]")).click();

		List<WebElement> element = driver.findElements(By.xpath(lblTxt));
		List<String> newList = Arrays.asList(firstName, middleName, lastNname, email, AltMblNo, dateofbirth, fatherName,
				motherName, spouseName, noOfDependt, nationality, income, panNumber, aadharNumber);

		for (int i = 0; i <= newList.size(); i++) {
			element.get(i).sendKeys(newList.get(i));

		}

		/*
		 * this.clickOnPersonalDetailsEditIcon(); this.selectTitle();
		 * this.setFirstName(firstName); this.setMiddleName(middleName)
		 * this.setLastName(lastNname); this.clickonSelectGender();
		 * this.setEmail(email); this.setAltmobileno(AltMblNo);
		 * this.setDob(dateofbirth); this.setFatherName(fatherName);
		 * this.setMotherName(motherName); this.selectMaritalStatus();
		 * this.setSpouseName(spouseName); this.setNoofDependent(noOfDependt);
		 * this.setNationality(nationality); this.selectCategory();
		 * this.selectReligion(); this.selectEducation(); this.selectOccupationtype();
		 * this.selectOccupation(); this.selectSourceofIncome();
		 * this.setGrassIncome(income); this.setPanNumber(panNumber);
		 * this.setAadharNumber(aadharNumber); this.clickOnSavePersonlDetailbtn();
		 * 
		 * this.uploadDocument(); this.clickOnbrowseChooseFile(documentsUploadFile);
		 * this.uploadButton();
		 * 
		 */
		logger.info("Ending of setPersonalDetails method");

	}

	public void setPermanentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) {
		logger.info("Starting of setPermanentAddress method");

		this.clickOnPermanentAddressEditicon();
		this.setAddressline1(addressLine1);
		this.setAddressline2(addressLine2);
		this.setpermanentPincode(pinCode);
		this.setResidingSinceinPermanent(residingSince);
		this.selectOwnershipType();
		this.setOwnerName(ownerName);
		this.setRelationshipWithOwner(relationOwner);
		this.clickOnbtnPermanentAddrssAddAddress();
		// this.clickOutside();
		// this.permanentDetailsUploadDocument();
		// this.clickOnPermanentAddressChoosefile(uploadingDocument);
		// this.clickOnPermanentUploadButton();
		// this.clickOutside();

		logger.info("Starting of setPermanentAddress method");

	}

	public void setResidentAddress(String addressLine1, String addressLine2, String pinCode, String residingSince,
			String ownerName, String relationOwner) {
		logger.info("Starting of setResidentAddress method");

		this.clickOnResidentAddressEditicon();
		this.setResidingAddressline1(addressLine1);
		this.setResidingAddressline2(addressLine2);
		this.setResidingPincode(pinCode);
		this.setResidingYear(residingSince);
		this.selectResidingOwnerType();
		this.setResidingOwnerName(ownerName);
		this.setResidingRelation(relationOwner);
		this.clickOnResidingAddAddressButton();

		/*
		 * this.residentAdddressUploadButton();
		 * 
		 * this.clickOnResidentChooseFiles(uploadDocument);
		 * this.clickOnResidentDetailsUploadButton(); this.clickOutside();
		 */
		logger.info("Ending of setResidentAddress method");

	}

	public void setBankAccount(String ifsc, String accountNumber, String accountName) {
		logger.info("Starting of setBankAccount method");

		this.clickOnBankAccountEditIcon();
		this.selectAccountType();
		this.setIfscCode(ifsc);
		this.setAccountNumber(accountNumber);
		this.setAccountName(accountName);
		this.clickOnNachCheckBox();
		this.clickonAddAccountButton();

		logger.info("Ending of setBankAccount method");
	}
}
