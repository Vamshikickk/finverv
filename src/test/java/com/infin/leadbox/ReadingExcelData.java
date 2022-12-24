package com.infin.leadbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.finverv.Base.BaseFinvervTest;

/**
 * @author DELL vamshi.v b2btesters
 */
public class ReadingExcelData extends BaseFinvervTest {

	@DataProvider(name = "get_Login_Credentials")
	public String[][] getLoginData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Login_Credentials.xlsx", "Login_Cred");
	}

	@DataProvider(name = "get_create_Application_details")
	public String[][] geCreateApplicationData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Create_Application_details.xlsx",
				"Create_Application_Details");

	}

	@DataProvider(name = "get_Search_Application_details")
	public String[][] getSearchApplicationData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Search_Application.xlsx", "Search_Application");

	}

	@DataProvider(name = "get_valid_personal_details_data")
	public String[][] getValidPersonalDetailstData() throws IOException {
		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Valid_Personal_Details_Data");
	}

	@DataProvider(name = "get_personal_details_data")
	public String[][] gePersonalDetailstData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Personal_Details");

	}

	@DataProvider(name = "get_Valid_permanent_Address_Details")
	public String[][] getValidPermanentAddressData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Valid_Permanent_Address_Details");

	}

	@DataProvider(name = "get_permanent_Address_Details")
	public String[][] getPermanentAddressData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Permanent_Details");

	}

	@DataProvider(name = "get_Valid_Resident_Address_Details")
	public String[][] getValidResidentAddressData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Valid_Resident_Address");

	}

	@DataProvider(name = "get_Resident_Address_Details")
	public String[][] getResidentAddressData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Resident_Details");

	}

	@DataProvider(name = "get_Valid_Bank_Account_Details")
	public String[][] getValidBankAccountData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Valid_Bank_Account_Details");

	}

	@DataProvider(name = "get_Bank_Account_Details")
	public String[][] getBankAccountData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/personaldetails.xlsx", "Bank_Account_Details");

	}

	@DataProvider(name = "get_Valid_Business_Details")
	public String[][] get_Valid_BusinessDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Valid_Business_Details");

	}

	@DataProvider(name = "get_Business_Details")
	public String[][] getBusinessDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Business_Details");

	}

	@DataProvider(name = "get_Valid_company_Address")
	public String[][] getValidCompanyAddress() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Valid_Compnay_Address");

	}

	@DataProvider(name = "get_company_Address")
	public String[][] getCompanyAddress() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Company_Address");

	}

	@DataProvider(name = "get_Valid_Company_Bank_Account")
	public String[][] getValidCompanyBankAccountDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Company_Bank_Account");
	}

	@DataProvider(name = "get_Company_Bank_Account")
	public String[][] getCompanyBankAccountDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Businessdetails.xlsx", "Valid_Company_Bank_Account");
	}

	@DataProvider(name = "get_Valid_Co_Borrowers_Details")
	public String[][] getValidCoBorrowerDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Valid_Add_Co_Borrower_Details");

	}

	@DataProvider(name = "get_Co_Borrowers_Details")
	public String[][] getCoBorrowerDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Add_Co_Borrower_Details");

	}

	@DataProvider(name = "get_Valid_Co_Borrowers_Address")
	public String[][] getValidCoBorrowerAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Valid_Co_Borwr_Adress_Details");

	}

	@DataProvider(name = "get_Co_Borrowers_Address")
	public String[][] getCoBorrowerAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Co_Borrower_Address_Details");

	}

	@DataProvider(name = "get_Valid_Edit_Co_Borrowers_Details")
	public String[][] getValidEditCoBorrowerAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Valid_Edit_Co_Borrower_Details");

	}

	@DataProvider(name = "get_Edit_Co_Borrowers_Details")
	public String[][] getEditCoBorrowerAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Co_Borrowers.xlsx", "Edit_Co_Borrower_Details");

	}

	@DataProvider(name = "get_Valid_GST_Details")
	public String[][] getValidGstDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/GST_Details.xlsx", "Valid_GST_DETAILS");

	}

	@DataProvider(name = "get_GST_Details")
	public String[][] getGstDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/GST_Details.xlsx", "GST_DETAILS");

	}

	@DataProvider(name = "get_Valid_Pull_GST_Details")
	public String[][] getValidPullGstData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/GST_Details.xlsx", "Valid_Pull_Gst_Data");

	}

	@DataProvider(name = "get_Pull_GST_Details")
	public String[][] getPullGstData() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/GST_Details.xlsx", "Pull_Gst_Data");

	}

	@DataProvider(name = "get_Valid_Transaction_Details")
	public String[][] getValidTransactionDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Transactions.xlsx", "Valid_Add_Transactions_Details");

	}

	@DataProvider(name = "get_Transaction_Details")
	public String[][] getTransactionDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Transactions.xlsx", "Add_Transactions_Details");

	}

	@DataProvider(name = "get_Valid_Edit_Transaction_Details")
	public String[][] getValidEditTransactionDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Transactions.xlsx", "Valid_Edit_Transactions_Details");

	}

	@DataProvider(name = "get_Edit_Transaction_Details")
	public String[][] getEditTransactionDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Transactions.xlsx", "Edit_Transactions_Details");

	}

	@DataProvider(name = "get_Valid_Ref_Business_Details")
	public String[][] getValidReferenceBusinessDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Valid_Reference_Busines_Details");

	}

	@DataProvider(name = "get_Ref_Business_Details")
	public String[][] getReferenceBusinessDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Reference_Busines_Details");

	}

	@DataProvider(name = "get_Valid_Ref_Address_Details")
	public String[][] getValidReferenceAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Valid_Reference_Address_Details");

	}

	@DataProvider(name = "get_Ref_Address_Details")
	public String[][] getReferenceAddressDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Reference_Address_Details");

	}

	@DataProvider(name = "get_Valid_Ref_Edit_Business_Details")
	public String[][] getValidEditReferenceDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Valid_Edit_Refere_Busin_Details");

	}

	@DataProvider(name = "get_Valid_Ref_Edit_Business_Details")
	public String[][] getEditReferenceDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/References.xlsx", "Edit_Refere_Busin_Details");

	}

	@DataProvider(name = "get_Valid_Credit_line")
	public String[][] getValidCreditLineAmount() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Line.xlsx", "Valid_Credit_Line");

	}

	@DataProvider(name = "get_Credit_line")
	public String[][] getCreditLineAmount() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Line.xlsx", "Credit_Line");

	}

	@DataProvider(name = "get_Valid_Apply_loan_Details")
	public String[][] getValidApplyLoanDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Line.xlsx", "Valid_Apply_Loan_Details");

	}

	@DataProvider(name = "get_Apply_loan_Details")
	public String[][] getApplyLoanDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Line.xlsx", "Apply_Loan_Details");

	}

	@DataProvider(name = "get_Valid_Repayment_Details")
	public String[][] getValidRepaymentDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Repayment.xlsx", "Valid_Repayment_Details");

	}

	@DataProvider(name = "get_Repayment_Details")
	public String[][] getRepaymentDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/Repayment.xlsx", "Repayment_Details");

	}

	@DataProvider(name = "get_ECI_Personal_Details")
	public String[][] getEciPersonalDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciPersonaldetails.xlsx", "ECI_PersonalDetails");

	}

	@DataProvider(name = "get_ECI_Permanent_Details")
	public String[][] getEciPermanentDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciPermanentdetails.xlsx", "ECI_Permanent_Address");

	}

	@DataProvider(name = "get_ECI_Resident_Details")
	public String[][] getEciResidentDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciResidentdetails.xlsx", "Eci_Resident_Details");

	}

	@DataProvider(name = "get_ECI_Business_Details")
	public String[][] getEciBusinessDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciBusinessdetails.xlsx", "ECI_Business_Details");

	}

	@DataProvider(name = "get_ECI_Company_Details")
	public String[][] getEciCompanyDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciCompanydetails.xlsx", "Eci_Company_Details");

	}

	@DataProvider(name = "get_ECI_Financial_Details")
	public String[][] getEciFinancialDetails() throws IOException {

		return this.getDataFromExcel("./exceldatareaderfiles/EciFinancialdetails.xlsx", "ECI_FINANCIAL_DETAILS");

	}

	public String[][] getDataFromExcel(String filepath, String sheetName) throws IOException {

		File excelFilePath = new File(filepath);
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColoumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows - 1][noOfColoumns];
		for (int i = 0; i < noOfRows - 1; i++) {
			for (int j = 0; j < noOfColoumns; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
				workbook.close();
				inputstream.close();
			}
			int k = 0;
			// String [] dataArr[i]=null;
			for (String[] dataArr : data) {
				for (String s : dataArr) {
					String l = s;
					System.out.println(dataArr[k]);
					k++;
				}
				// return data;
			}
		}

		return data;

	}
}
