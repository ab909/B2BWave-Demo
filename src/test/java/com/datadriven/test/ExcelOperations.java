package com.datadriven.test;

import com.excel.utility.xlsreader;

public class ExcelOperations {

	public static void main(String[] args) {
	
		
		xlsreader reader = new xlsreader("C:\\Users\\abhib\\eclipse-workspace\\DemoB2B\\src\\main\\java"
				+ "\\com\\testdata\\WalMartTestData.xlsx");	
		
		reader.addSheet("HomePage");
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}

	}

}
