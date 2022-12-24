package com.infin.leadbox;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class BusinessDetailsTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(BusinessDetailsTabPage.class.getName());

	@FindBy(xpath = "//a[text()='Business Details']")
	private WebElement btnBusinessDetails;

	@FindBy(xpath = "//span[text()='Business Details']")
	private WebElement lblTxtBusinessDetails;

	@FindBy(id = "open_business_details")
	private WebElement businessDetailsIcon;

	@FindBy(id = "business_name")
	private WebElement txtBusinessName;

	@FindBy(id = "business_type")
	private WebElement typeOfEntityDrpDwn;

	@FindBy(xpath = "//div[text()='Partnership']")
	private WebElement selectTypeofEntity;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement txtDateofIncorporation;

	@FindBy(xpath = "//label[text()='Date of Incorporation *']")
	private WebElement lblDOB;

	@FindBy(id = "industry_type")
	private WebElement businessTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Manufacturer']")
	private WebElement selectBusinessType;

	@FindBy(id = "product")
	private WebElement txtProduct;

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(xpath = "//span[text()='email-Enter A Valid Email Address.']")
	private WebElement invlalidEmailValidationTxt;

	@FindBy(id = "annual_turnover")
	private WebElement annualTurnOverDrpdwn;

	@FindBy(xpath = "//nz-option-item[@title='5-10 Lakhs']")
	private WebElement selectAnnualTurnover;

	@FindBy(id = "number_of_employees")
	private WebElement txtNoOfEmployees;

	@FindBy(id = "name_of_contact_person")
	private WebElement txtNameOfContactPerson;

	@FindBy(id = "landline_number")
	private WebElement txtLandlineNumber;

	@FindBy(id = "mobile_number")
	private WebElement txtMobileNumber;

	@FindBy(xpath = "//span[text()='Mobile not valid.']")
	private WebElement invalidMobilenoValidationTxt;

	@FindBy(id = "pan_number")
	private WebElement txtPanNumber;

	@FindBy(xpath = "//span[text()='Pan not valid.']")
	private WebElement invalidPanTxt;

	@FindBy(id = "business_doc_type")
	private WebElement businessDocTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Udyog']")
	private WebElement selectBusinessDocType;

	@FindBy(id = "business_proof_doc_number")
	private WebElement txtBusinessProofDocument;

	@FindBy(id = "submit_business_details")
	private WebElement btnAddBusinessDetails;

	@FindBy(id = "show_documents_business_details")
	private WebElement businessdetailsDocumenticon;

	@FindBy(id = "select_show_documents_business_details")
	private WebElement businessDetailsSelectLblDrpdwn;

	@FindBy(xpath = "//div[text()='Shop and Establishment Certificate']")
	private WebElement selectBusinessDetailsDocument;

	@FindBy(id = "choose_show_documents_business_details")
	private WebElement businessDetailsChooseFile;

	@FindBy(id = "upload_show_documents_business_details")
	private WebElement btnBusinessDetailsUpload;

	@FindBy(xpath = "//span[text()='Company Address']")
	private WebElement lblCompanyAddressTxt;

	@FindBy(id = "'open_'+editID")
	private WebElement companyAddressEditconButton;

	@FindBy(id = "business_company_address_address_line_1")
	private WebElement txtCompanyAddressline1;

	@FindBy(id = "business_company_address_address_line_2")
	private WebElement txtCompanyAddressline2;

	@FindBy(id = "business_company_address_pincode")
	private WebElement txtCompanyPincode;

	@FindBy(xpath = "//span[text()='pincode-Invalid Pincode Shared']")
	private WebElement invalidPincoeText;

	@FindBy(id = "business_company_address_vintage")
	private WebElement txtCompanyResidingYear;

	@FindBy(id = "business_company_address_ownership_type")
	private WebElement selectCompanyOwnershipTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Owned']")
	private WebElement selectOwnershipType;

	@FindBy(id = "business_company_address_owner_name")
	private WebElement txtCompanyOwnerName;

	@FindBy(id = "business_company_address_relation_with_owner")
	private WebElement txtCompanyRelationshipWithOwner;

	@FindBy(id = "submit_business_company_address")
	private WebElement btnCompanyAddAddress;

	@FindBy(id = "show_documents_business_company_address")
	private WebElement compnayAddressDocumentIcon;

	@FindBy(id = "select_show_documents_business_company_address")
	private WebElement companyAddressSelectLblDrpdwn;

	@FindBy(xpath = "//div[text()='Rent Agreement']")
	private WebElement selectCompanyAddressSelectLblType;

	@FindBy(id = "choose_show_documents_business_company_address")
	private WebElement companyAddressChooseFile;

	@FindBy(id = "upload_show_documents_business_company_address")
	private WebElement companyAddressUploadButton;

	@FindBy(xpath = "//span[text()='Company Bank Account']")
	private WebElement lblCompanyBankAccountTxt;

	@FindBy(id = "open_company_bank_account")
	private WebElement companyBankAccounticon;

	@FindBy(id = "company_bank_account_account_type")
	private WebElement CompanyBankAccountTypeDrpdwn;

	@FindBy(xpath = "//div[text()='Current']")
	private WebElement selectCompanyBankAccountType;

	@FindBy(id = "company_bank_account_ifsc_code")
	private WebElement txtCompanyBankAccountIFSCcode;

	@FindBy(xpath = "//span[text()='ifsc_code-Invalid Ifsc Code']")
	private WebElement inavlidIfscTxt;

	@FindBy(id = "company_bank_account_account_number")
	private WebElement txtCompanyBankAccountNumber;

	@FindBy(id = "company_bank_account_account_name")
	private WebElement txtCompanyBankAccountName;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkbxNaach;

	@FindBy(id = "submit_company_bank_account")
	private WebElement btnCompanyBankAddAccount;

	@FindBy(id = "show_documents_company_bank_account")
	private WebElement companyBankAccountDocumentIcon;

	@FindBy(id = "select_show_documents_company_bank_account")
	private WebElement companyBankAccountSelectLblDrpdwn;

	@FindBy(xpath = "//div[text()='Form 16']")
	private WebElement companyBankAccountselectLblType;

	@FindBy(id = "choose_show_documents_company_bank_account")
	private WebElement companyBankAccountChoosefile;

	@FindBy(id = "upload_show_documents_company_bank_account")
	private WebElement btnUploadCompanyBankAccount;

	public BusinessDetailsTabPage(WebDriver driver) {
		super(driver);

	}

	public void clickonBusinessDetailsButton() {
		logger.info("Starting of clickonBusinessDetails method");

		this.btnBusinessDetails.click();

		logger.info("Ending of clickonBusinessDetails method");

	}

	public String getLblBusinessDetailsTxt() {
		logger.info("Starting of getlblBusinessDetailsTxt method");

		this.waitForElementToBeVisible(lblTxtBusinessDetails);

		logger.info("Ending of getlblBusinessDetailsTxt method");
		return lblTxtBusinessDetails.getText();

	}

	public void clickonBusinessDetailsEditIcon() {
		logger.info("Starting of clickonBusinessDetailsEditIcon method");

		this.clickOnElement(businessDetailsIcon);

		logger.info("Ending of clickonBusinessDetailsEditIcon method");
	}

	public void setBusinessName(String businessName) {
		logger.info("Starting of setBusinessName method");

		this.txtBusinessName.click();
		this.txtBusinessName.clear();
		this.txtBusinessName.sendKeys(businessName);

		logger.info("Ending of setBusinessName method");
	}

	public void setTypeOfEntity() {
		logger.info("Starting of setTypeOfEntity method");

		this.typeOfEntityDrpDwn.click();
		this.selectTypeofEntity.click();

		logger.info("Ending of setTypeOfEntity method");
	}

	public void setDateOfIncorporation(String date) {
		logger.info("Starting of setDateOfIncorporation method");

		this.txtDateofIncorporation.click();
		this.txtDateofIncorporation.clear();
		this.txtDateofIncorporation.sendKeys(date);
		this.lblDOB.click();

		logger.info("Ending of setDateOfIncorporation method");
	}

	public void setBusinessType() {
		logger.info("Starting of setBusinessType method");

		this.scrollDown(100);
		this.businessTypeDrpdwn.click();
		this.selectBusinessType.click();

		logger.info("Ending of setBusinessType method");
	}

	public void setProduct(String product) {
		logger.info("Starting of setProduct method");

		this.txtProduct.click();
		this.txtProduct.clear();
		this.txtProduct.sendKeys(product);

		logger.info("Ending of setProduct method");
	}

	public void setEmail(String email) {
		logger.info("Starting of setEmail method");

		this.txtEmail.click();
		this.txtEmail.clear();
		this.txtEmail.sendKeys(email);

		logger.info("Ending of setEmail method");
	}

	public String getinvalidEmailValidationTxt() {
		logger.info("Starting of getinvalidEmailValidationTxt method");

		logger.info("Ending of getinvalidEmailValidationTxt method");
		return invlalidEmailValidationTxt.getText();
	}

	public void setAnnualTurnOver() {
		logger.info("Starting of setAnnualTurnOver method");

		this.annualTurnOverDrpdwn.click();
		this.selectAnnualTurnover.click();

		logger.info("Ending of setAnnualTurnOver method");
	}

	public void setNoOfEmployes(String employees) {
		logger.info("Starting of setNoOfEmployes method");

		this.txtNoOfEmployees.click();
		this.txtNoOfEmployees.clear();
		this.txtNoOfEmployees.sendKeys(employees);

		logger.info("Ending of setNoOfEmployes method");
	}

	public void setNameOfContactPerson(String contactPerson) {
		logger.info("Starting of setNameOfContactPerson method");

		this.txtNameOfContactPerson.click();
		this.txtNameOfContactPerson.clear();
		this.txtNameOfContactPerson.sendKeys(contactPerson);

		logger.info("Ending of setNameOfContactPerson method");
	}

	public void setLandLineNumber(String landLine) {
		logger.info("Starting of setLandLineNumber method");

		this.txtLandlineNumber.click();
		this.txtLandlineNumber.clear();
		this.txtLandlineNumber.sendKeys(landLine);

		logger.info("Ending of setLandLineNumber method");
	}

	public void setMobileNumber(String mobileNumber) {
		logger.info("Starting of setMobileNumber method");

		this.txtMobileNumber.click();
		this.txtMobileNumber.clear();
		this.txtMobileNumber.sendKeys(mobileNumber);

		logger.info("Ending of setMobileNumber method");
	}

	public String getInvalidMobileValidationTxt() {
		logger.info("Starting of getInvalidMobileValidationTxt method");

		logger.info("Ending of getInvalidMobileValidationTxt method");

		return invalidMobilenoValidationTxt.getText();
	}

	public void setPanNumber(String PanNumber) {
		logger.info("Starting of setPanNumber method");

		this.txtPanNumber.click();
		this.txtPanNumber.clear();
		this.txtPanNumber.sendKeys(PanNumber);

		logger.info("Ending of setPanNumber method");
	}

	public String getInvalidPanTxt() {
		logger.info("Strating of getInvalidPanTxt method");

		logger.info("Ending of getInvalidPanTxt method");
		return invalidPanTxt.getText();
	}

	public void setBusinessDocType() {
		logger.info("Starting of setBusinessDocType method");

		this.businessDocTypeDrpdwn.click();
		this.selectBusinessDocType.click();

		logger.info("Ending of setBusinessDocType method");
	}

	public void setBusinessProofDoc(String BusinessDocnumber) {
		logger.info("Starting of setBusinessProofDoc method");

		this.txtBusinessProofDocument.click();
		this.txtBusinessProofDocument.clear();
		this.txtBusinessProofDocument.sendKeys(BusinessDocnumber);

		logger.info("Ending of setBusinessProofDoc method");
	}

	public void clickOnAddBusinessDetailsButton() {
		logger.info("Starting of clickOnAddBusinessDetailsButton method");

		this.btnAddBusinessDetails.click();

		logger.info("Ending of clickOnAddBusinessDetailsButton method");
	}

	public void clickOnBusinessetailsDocumentIcon() {
		logger.info("Start of clickOnBusinessetailsDocumentIcon method");

		this.clickOnElement(businessdetailsDocumenticon);

		logger.info("Ending of clickOnBusinessetailsDocumentIcon method");
	}

	public void clickOnBusinessDetailsSelectLbl() {
		logger.info("Start of clickOnBusinessDetailsSelectLbl method");

		this.businessDetailsSelectLblDrpdwn.click();
		this.selectBusinessDetailsDocument.click();

		logger.info("Ending of clickOnBusinessDetailsSelectLbl method");
	}

	public void clickOnbBusinessDetailsChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnbBusinessDetailsChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			businessDetailsChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);
		} else if (osPath.contains("Mac OS X")) {

			businessDetailsChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			businessDetailsChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnbBusinessDetailsChooseFile method");
	}

	public void clickOnBusinessDetailsUploadButton() {
		logger.info("Starting of clickOnBusinessDetailsUploadButton method");

		this.btnBusinessDetailsUpload.click();

		logger.info("Ending of clickOnBusinessDetailsUploadButton method");

	}

	public void setBusinessDetails(String businessName, String dateOfIncorpoRation, String product, String email,
			String noOfEmployees, String nameOfContactPerson, String landLineNumber,String mobileNumber,String panNumber,
			String proofDocNumber) {
		logger.info("Strating of setBusinessDetails");

		this.clickonBusinessDetailsEditIcon();
		this.setBusinessName(businessName);
		this.setTypeOfEntity();
		this.setDateOfIncorporation(dateOfIncorpoRation);
		this.setBusinessType();
		this.setProduct(product);
		this.setEmail(email);
		this.setAnnualTurnOver();
		this.setNoOfEmployes(noOfEmployees);
		this.setNameOfContactPerson(nameOfContactPerson);
		this.setLandLineNumber(landLineNumber);
		this.setMobileNumber(mobileNumber);
		this.setPanNumber(panNumber);
		this.setBusinessDocType();
		this.setBusinessProofDoc(proofDocNumber);
		this.scrollDown(50);
		this.clickOnAddBusinessDetailsButton();

		logger.info("Ending of setBusinessDetails");

	}

	public String getLblCompanyAddressTxt() {
		logger.info("Starting of getLblCompanyAddressTxt method");

		logger.info("Ending of getLblCompanyAddressTxt method");
		return lblCompanyAddressTxt.getText();

	}

	public void clicOnCompanyAddressIcon() {
		logger.info("Starting of clicOnCompanyAddressIcon method");

		this.clickOnElement(companyAddressEditconButton);

		logger.info("Ending of clicOnCompanyAddressIcon method");
	}

	public void setCompanyAddressline1(String businessAddressline1) {
		logger.info("Start of setCompanyAddressline1 method");

		this.txtCompanyAddressline1.click();
		this.txtCompanyAddressline1.clear();
		this.txtCompanyAddressline1.sendKeys(businessAddressline1);

		logger.info("Ending of setCompanyAddressline1 method");
	}

	public void setCompanyAddressline2(String businessAddressline2) {
		logger.info("Start of setCompanyAddressline2 method");

		this.txtCompanyAddressline2.click();
		this.txtCompanyAddressline2.clear();
		this.txtCompanyAddressline2.sendKeys(businessAddressline2);

		logger.info("Ending of setCompanyAddressline2 method");
	}

	public void setCompanyPinCode(String companyPincode) {
		logger.info("Start of setCompanyPinCode method");

		this.txtCompanyPincode.click();
		this.txtCompanyPincode.clear();
		this.txtCompanyPincode.sendKeys(companyPincode);

		logger.info("Ending of setCompanyPinCode method");
	}

	public String getInvalidPincodeText() {
		logger.info("Starting of getInvalidPincodeText method");

		logger.info("Starting of getInvalidPincodeText method");
		return invalidPincoeText.getText();

	}

	public void setCompanyResidingYear(String companyResiding) {
		logger.info("Start of setBusinessResidungYear method");

		this.txtCompanyResidingYear.click();
		this.txtCompanyResidingYear.clear();
		this.txtCompanyResidingYear.sendKeys(companyResiding);

		logger.info("Ending of setBusinessResidungYear method");
	}

	public void setCompanyOwnerShipType() {
		logger.info("Start of setCompanyOwnerShipType method");

		this.selectCompanyOwnershipTypeDrpdwn.click();
		this.selectOwnershipType.click();

		logger.info("Ending of setCompanyOwnerShipType method");
	}

	public void setCompanyOwnerName(String companyOwnerName) {
		logger.info("Start of setCompanyOwnerName method");

		this.txtCompanyOwnerName.click();
		this.txtCompanyOwnerName.clear();
		this.txtCompanyOwnerName.sendKeys(companyOwnerName);

		logger.info("Ending of setCompanyOwnerName method");
	}

	public void setRelationShipWithOwner(String companyRelationship) {
		logger.info("Start of setTrelationShipWithOwner method");

		this.txtCompanyRelationshipWithOwner.click();
		this.txtCompanyRelationshipWithOwner.clear();
		this.txtCompanyRelationshipWithOwner.sendKeys(companyRelationship);

		logger.info("Ending of setTrelationShipWithOwner method");
	}

	public void clickOnBusinessCompanyAddAddressButton() {
		logger.info("Start of clickOnBusinessAddAddressButton method");

		this.btnCompanyAddAddress.click();

		logger.info("Ending of clickOnBusinessAddAddressButton method");
	}
	public void setCompanyDocuments() {
		logger.info("Starting of clickOnBankDocumentIcon method");

		this.clickOnElement(compnayAddressDocumentIcon);
		this.companyAddressSelectLblDrpdwn.click();
		this.selectCompanyAddressSelectLblType.click();

		logger.info("Ending of clickOnBankDocumentIcon method");
	}

	public void clickOnbrowseCompanyAddressChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnbrowseCompanyBankAccountChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			companyAddressChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			companyAddressChooseFile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			companyAddressChooseFile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnbrowseCompanyBankAccountChooseFile method");
	}

	public void clickOnCompanyAddressUploadButton() {
		logger.info("Starting of clickOnCompanyAddressUploadButton method");

		this.companyAddressUploadButton.click();

		logger.info("Ending of clickOnCompanyAddressUploadButton method");
	}

	public void setCompanyDetails(String addressline1, String addressline2, String companyPinCode, String residingSince, String ownerName,
			String relationWithOwner) {
		logger.info("Starting of setCompanyDetails method");

		this.clicOnCompanyAddressIcon();
		this.setCompanyAddressline1(addressline1);
		this.setCompanyAddressline2(addressline2);
		this.setCompanyPinCode(companyPinCode);
		this.setCompanyResidingYear(residingSince);
		this.setCompanyOwnerShipType();
		this.setCompanyOwnerName(ownerName);
		this.setRelationShipWithOwner(relationWithOwner);
		this.clickOnBusinessCompanyAddAddressButton();

		logger.info("Ending of setCompanyDetails method");
	}

	public String getLblCompanyBankAccountTxt() {
		logger.info("Starting of getLblCompanyBankAccountTxt method");

		logger.info("Ending of getLblCompanyBankAccountTxt method");
		return lblCompanyBankAccountTxt.getText();

	}

	public void clickOnCompanyBankAccountIcon() {
		logger.info("Starting of clickOnCompanyBankAccountIcon method");

		this.clickOnElement(companyBankAccounticon);

		logger.info("Ending of clickOnCompanyBankAccountIcon method");
	}

	public void setCompanyBankACcountType() {
		logger.info("Starting of setCompanyBankACcountType method");

		this.CompanyBankAccountTypeDrpdwn.click();
		this.selectCompanyBankAccountType.click();

		logger.info("Ending of setCompanyBankACcountType method");
	}

	public void setCompanyIFSCcode(String companyifsc) {
		logger.info("Starting of setCompanyIFSCcode method");

		this.txtCompanyBankAccountIFSCcode.click();
		this.txtCompanyBankAccountIFSCcode.clear();
		this.txtCompanyBankAccountIFSCcode.sendKeys(companyifsc);

		logger.info("Ending of setCompanyIFSCcode method");
	}

	public void setCompanyAccountNumber(String companyAccountNumber) {
		logger.info("Starting of setCompanyAccountNumber method");

		this.txtCompanyBankAccountNumber.click();
		this.txtCompanyBankAccountNumber.clear();
		this.txtCompanyBankAccountNumber.sendKeys(companyAccountNumber);

		logger.info("Ending of setCompanyAccountNumber method");
	}

	public void setCompanyAccountName(String accountName) {
		logger.info("Starting of setCompanyAccountName method");

		this.txtCompanyBankAccountName.click();
		this.txtCompanyBankAccountName.clear();
		this.txtCompanyBankAccountName.sendKeys(accountName);

		logger.info("Ending of setCompanyAccountName method");
	}

	public void clickOnCompanyBankAccountNachCheckBox() {
		logger.info("Starting of clickOnCompanyBankAccountNachCheckBox method");

		boolean checkbox = this.chkbxNaach.isSelected();

		try {
			if (checkbox == true) {
				logger.info("check box is allready selected");
			} else {
				this.clickOnElement(chkbxNaach);
			}
		} catch (Exception e) {

			logger.info("Ending of clickOnCompanyBankAccountNachCheckBox method");
		}
	}

	public void clickOnCompanyBankAddAccount() {
		logger.info("Starting of clickOnCompanyBankAddAccount method");

		this.btnCompanyBankAddAccount.click();

		logger.info("Ending of clickOnCompanyBankAddAccount method");
	}

	public String getInvalidIfscCodeTxt() {
		logger.info("Starting of getInvalidIfscCodeTxt method");

		logger.info("Ending of getInvalidIfscCodeTxt method");
		return inavlidIfscTxt.getText();
	}

	public void clickonCompanyBankAccountDocumenticon() {
		logger.info("Starting of clickonCompanyBankAccounticon method");

		this.clickOnElement(companyBankAccountDocumentIcon);

		logger.info("Ending of clickonCompanyBankAccounticon method");

	}

	public void clickoncompanyBankAccountSelectlblDrpdwn() {
		logger.info("Starting of clickoncompanyBankAccountSelectlblDrpdwn method");

		this.companyBankAccountSelectLblDrpdwn.click();
		this.companyBankAccountselectLblType.click();

		logger.info("Ending of clickoncompanyBankAccountSelectlblDrpdwn method");

	}

	public void clickOnbrowseCompanyBankAccountChooseFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnbrowseCompanyBankAccountChooseFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			companyBankAccountChoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			companyBankAccountChoosefile.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			companyBankAccountChoosefile.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnbrowseCompanyBankAccountChooseFile method");
	}

	public void clickOnCompanyBankAccountUploadButton() {
		logger.info("Starting of clickOnCompanyBankAccountUploadButton method");

		this.btnUploadCompanyBankAccount.click();

		logger.info("Ending of clickOnCompanyBankAccountUploadButton method");
	}
	public void setBankDetails(String ifscCode,String accountNumber,String accountName) {
		logger.info("Starting of setBankDetails method");
		
		this.clickOnCompanyBankAccountIcon();
		this.setCompanyBankACcountType();
		this.setCompanyIFSCcode(ifscCode);
		this.setCompanyAccountNumber(accountNumber);
		this.setCompanyAccountName(accountName);
		this.clickOnCompanyBankAccountNachCheckBox();
		this.clickOnCompanyBankAddAccount();
	
		logger.info("Ending of setBankDetails method");
	}
	
	
}
