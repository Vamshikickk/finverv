package com.eci.finverv;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.infin.Base.BaseFinvervPage;

public class EciPersonalDetailsTabPage extends BaseFinvervPage {

	private static final Logger logger = Logger.getLogger(EciPersonalDetailsTabPage.class.getName());

	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement btnPersonalDetailsTab;

	@FindBy(xpath = "//span[contains(text(),'Edit')][1]")
	private WebElement btnEditPersonalDetails;

	@FindBy(xpath = "//h2[text()='Personal Details']")
	private WebElement txtpersonaldetails;

	@FindBy(css = "input[formcontrolname=\"first_name\"]")
	private WebElement firstname;

	@FindBy(css = "input[formcontrolname=\"last_name\"]")
	private WebElement lastname;

	@FindBy(xpath = "(//i[@nztype='down'])[1]")
	private WebElement genderDrpdwn;

	@FindBy(xpath = "//div [text()='Male']")
	private WebElement gender;

	@FindBy(xpath = "//input[@formcontrolname='mobile']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder='Select date']")
	private WebElement dOB;

	@FindBy(xpath = "//input[@formcontrolname='fathers_name']")
	private WebElement fathername;

	@FindBy(xpath = "(//i[@nztype='down'])[2]")
	private WebElement occupationTypeDrpdwn;

	@FindBy(xpath = "//nz-select-item[@title='Salaried']")
	private WebElement selectOccupationType;;

	@FindBy(xpath = "//input[@formcontrolname='pan_number']")
	private WebElement txtPanNumber;

	@FindBy(xpath = "//input[@formcontrolname='aadhar_number']")
	private WebElement txtAadharNumber;

	@FindBy(xpath = "//span[contains(text(),'Save Personal Details')]")
	private WebElement btnSavepersonalDetails;

	@FindBy(xpath = "//i[@class='anticon anticon-down ng-star-inserted']")
	private WebElement selectLblDrpdwn;

	@FindBy(xpath = "//div[text()='PAN Card']")
	private WebElement selectDocumentType;

	@FindBy(xpath = "//input[@class='hide_file ng-star-inserted']")
	private WebElement choosePersonalDetailsClickToUpload;

	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement btnPersonalDetailsUpload;

	@FindBy(xpath = "//div[@class='ant-collapse-content ng-tns-c86-0 ng-trigger ng-trigger-collapseMotion ant-collapse-content-active']"
			+ "//child::div[@class='ant-collapse-content-box ng-tns-c86-0']//child::div[@class='ng-star-inserted']")
	private WebElement eciPerosnalEditBtn;

	public EciPersonalDetailsTabPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnPersonalDetailstab() {
		logger.info("Strating of clickOnPersonalDetailstab method");

		this.btnPersonalDetailsTab.click();

		logger.info("Ending of clickOnPersonalDetailstab method");
	}

	public void clickOnEditButton() {
		logger.info("Strating of clickOnEditButton method");

		this.btnEditPersonalDetails.click();

		logger.info("Ending of clickOnEditButton method");
	}

	public String getTxtpersonaldetails() {
		logger.info("Strating of getTxtpersonaldetails method");

		logger.info("Ending of getTxtpersonaldetails method");
		return txtpersonaldetails.getText();
	}

	public void getTxtFirstname() {

		logger.info("Strating of getTxtLastname method");

		System.out.println(firstname.getAttribute("value"));

		logger.info("Ending of getTxtFirstname method");
	}

	public void getTxtLastname() {
		logger.info("Strating of getTxtLastname method");

		System.out.println(this.lastname.getAttribute("value"));

		logger.info("Ending of getTxtLastname method");
	}

	public void getSelectgender() {
		logger.info("Strating of getTxtLastname method");

		System.out.println(this.gender.getAttribute("value"));

		logger.info("Ending of getTxtLastname method");
	}

	public void getTxtEmail() {
		logger.info("Strating of getTxtEmail method");

		System.out.println(this.email.getAttribute("value"));

		logger.info("Ending of getTxtEmail method");
	}

	public void getMobileNumber() {
		logger.info("Strating of getMobileNumber method");

		System.out.println(this.mobileNumber.getAttribute("value"));

		logger.info("Strating of getMobileNumber method");
	}

	public void getEnterDOB() {
		logger.info("Strating of getEnterDOB method");

		System.out.println(this.dOB.getAttribute("value"));

		logger.info("Strating of getEnterDOB method");
	}

	public void getTxtFathername() {
		logger.info("Strating of getTxtFathername method");

		System.out.println(this.fathername.getAttribute("value"));

		logger.info("Ending of getTxtFathername method");
	}

	public void getSelectOccupationType() {
		logger.info("Strating of getSelectOccupationType method");

		System.out.println(this.selectOccupationType.getText());

		logger.info("Ending of getSelectOccupationType method");
	}

	public void getTxtPanNumber() {
		logger.info("Strating of getTxtPanNumber method");

		System.out.println(this.txtPanNumber.getAttribute("value"));

		logger.info("Ending of getTxtPanNumber method");
	}

	public void getTxtAadharNumber() {
		logger.info("Strating of getTxtAadharNumber method");

		System.out.println(this.txtAadharNumber.getAttribute("value"));

		logger.info("Ending of getTxtAadharNumber method");
	}

	public void getPersonalDetails() {
		logger.info("Strating of getPersonalDetails method");

		this.clickOnPersonalDetailstab();
		this.clickOnEditButton();
		this.getTxtpersonaldetails();
		this.getTxtFirstname();
		this.getTxtLastname();
		this.getSelectgender();
		this.getTxtEmail();
		this.getMobileNumber();
		this.getEnterDOB();
		this.getTxtFathername();
		this.getSelectOccupationType();
		this.getTxtPanNumber();
		this.getTxtAadharNumber();

		logger.info("Strating of getPersonalDetails method");
	}

	public String getLbltxtpersonaldetails() {
		logger.info("Starting of getLbltxtpersonaldetails method");

		logger.info("Ending of getLbltxtpersonaldetails method");
		return txtpersonaldetails.getText();

	}

	public void setFirstName(String firstName) {
		logger.info("Starting of setFirstName method");

		this.firstname.click();
		this.firstname.clear();
		this.firstname.sendKeys(firstName);

		logger.info("Ending of setFirstName method");

	}

	public void setLastName(String lastName) {
		logger.info("Starting of setLastName method");

		this.lastname.click();
		this.lastname.clear();
		this.lastname.sendKeys(lastName);

		logger.info("Ending of setLastName method");

	}

	public void selectGender() {
		logger.info("Starting of selectGender method");

		this.genderDrpdwn.click();
		this.clickOnElement(gender);
		logger.info("Ending of selectGender method");

	}

	public void setEmail(String email) {
		logger.info("Starting of setEmail method");

		this.email.click();
		this.email.clear();
		this.email.sendKeys(email);

		logger.info("Ending of setEmail method");

	}

	public void setDateOfBirth(String dateOfBirth) {
		logger.info("Starting of setDateOfBirth method");

		this.dOB.click();
		this.dOB.clear();
		this.dOB.sendKeys(dateOfBirth);

		logger.info("Ending of setDateOfBirth method");

	}

	public void setFatherName(String fatherName) {
		logger.info("Starting of setFatherName method");

		this.fathername.click();
		this.fathername.clear();
		this.fathername.sendKeys(fatherName);

		logger.info("Ending of setFatherName method");

	}

	public void selectOccuptionType() {
		logger.info("Starting of selectOccuptionType method");

		this.occupationTypeDrpdwn.click();

		logger.info("Ending of selectOccuptionType method");

	}

	public void selectSelfEmployed() {
		logger.info("Starting of selectSelfEmployed method");

		this.selectOccupationType.click();

		logger.info("Ending of selectSelfEmployed method");

	}

	public void setPanNumber(String panNumber) {
		logger.info("Starting of setPanNumber method");

		this.txtPanNumber.click();
		this.txtPanNumber.clear();
		this.txtPanNumber.sendKeys(panNumber);

		logger.info("Ending of setPanNumber method");

	}

	public void setAdharNumber(String adharNumber) {
		logger.info("Starting of setFatherName method");

		this.txtAadharNumber.click();
		this.txtAadharNumber.clear();
		this.txtAadharNumber.sendKeys(adharNumber);

		logger.info("Ending of setFatherName method");

	}

	public void clickOnSaveDetails() {
		logger.info("Starting of clickOnSaveDetails method");

		this.btnSavepersonalDetails.click();

		logger.info("Ending of clickOnSaveDetails method");

	}

	public void clickOnSelectDoumentDropDown() {
		logger.info("Starting of clickOnSelectDoumentDropDown method");

		this.clickOnElement(selectLblDrpdwn);
		this.clickOnElement(selectDocumentType);

		logger.info("Ending of clickOnSelectDoumentDropDown method");

	}

	public void selectFileType() {
		logger.info("Starting of selectFileType method");

		this.selectDocumentType.click();

		logger.info("Ending of selectFileType method");

	}

	public void clickOnChooseClickToUploadFile(String bankDocumentsUploadFile) {
		logger.info("Starting of clickOnChooseClickToUploadFile method");

		String osPath = System.getProperty("os.name");

		if (osPath.contains("Linux")) {

			choosePersonalDetailsClickToUpload.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else if (osPath.contains("Mac OS X")) {

			choosePersonalDetailsClickToUpload.sendKeys(TEST_FILE_PATH + "/" + bankDocumentsUploadFile);

		} else {

			choosePersonalDetailsClickToUpload.sendKeys(TEST_FILE_PATH + "\\" + bankDocumentsUploadFile);
		}

		logger.info("Ending of clickOnChooseClickToUploadFile method");
	}

	public void clickOnPersonalDetailsUploadButton() {
		logger.info("Starting of clickOnPersonalDetailsUploadButton method");

		this.btnPersonalDetailsUpload.click();

		logger.info("Ending of clickOnPersonalDetailsUploadButton method");

	}

	public void ClickOnPersonalDetailsEditButton() {
		logger.info("starting of ClickOnPersonalDetailsEditButton method");

		this.eciPerosnalEditBtn.click();

		logger.info("Ending Of ClickOnPersonalDetailsEditButton method");
	}

	public void setEciPersonalDetails(String firstName, String lastName, String email, String dateOfBirth,
			String fatherName, String panNumber, String aadharNumber) throws Exception {

		logger.info("Starting of setEciPersonalDetails method");

		this.clickOnPersonalDetailstab();
		this.clickOnEditButton();
		this.getTxtpersonaldetails();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.selectGender();
		this.setEmail(email);
		this.setDateOfBirth(dateOfBirth);
		this.scrollDown(200);
		this.setFatherName(fatherName);
		this.selectOccuptionType();
		this.selectSelfEmployed();
		this.setPanNumber(panNumber);
		this.setAdharNumber(aadharNumber);
		this.clickOnSaveDetails();
		this.clickOnPersonalDetailstab();
		
		/*
		 * this.clickOnSelectDoumentDropDown(); this.selectFileType(); //
		 * this.clickOnChooseClickToUploadFile(aadharNumber);
		 * this.clickOnPersonalDetailsUploadButton();
		 */
		logger.info("Ending of of setEciPersonalDetails method");
	}

}
