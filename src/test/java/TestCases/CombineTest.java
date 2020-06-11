package TestCases;

import org.testng.annotations.Test;

import Base.Excel_Config;
import Base.Util;

public class CombineTest extends Util {
	Excel_Config excel = new Excel_Config(".\\Data.xlsx");

	@Test(priority = 1)
	public void employee() {
		baseUrl(excel.getData(2, 1));
		getType(excel.getData(5, 1));
	}

	@Test(priority = 2)
	public void employee1() {
		baseUrl(excel.getData(2, 1));
		getType(excel.getData(6, 1));
	}

	@Test(priority = 3)
	public void create() {
		baseUrl(excel.getData(2, 1));
		postType(excel.getData(8, 1), excel.getData(7, 1));
	}
}