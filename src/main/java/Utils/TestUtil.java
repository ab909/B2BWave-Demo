package Utils;

import java.util.ArrayList;

import com.excel.utility.xlsreader;

public class TestUtil {

	static xlsreader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			reader = new xlsreader(
					"C:\\Users\\abhib\\eclipse-workspace\\DemoB2B\\src\\main\\java\\com\\testdata\\WalMartTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {

			String email = reader.getCellData("TestData", "email", rowNum);
			String firstname = reader.getCellData("TestData", "firstname", rowNum);
			String lastname = reader.getCellData("TestData", "lastname", rowNum);
			String password = reader.getCellData("TestData", "password", rowNum);
			String confirmpassword = reader.getCellData("TestData", "confirmpassword", rowNum);

			Object ob[] = { email, firstname, lastname, password, confirmpassword };
			myData.add(ob);

		}
		return myData;

	}

}
