package java.readDataFromExcel;


public class Test {

	public static void main(String[] args) {
		
		String excelPath = "C:\\Users\\mS\\Documents\\Mona_QA material\\excelDataApi.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1, 0);
		excel.getCellData(2, 0);
		excel.getCellData(3, 0);
		excel.getCellData(4, 0);
		excel.getCellData(1, 1);
		excel.getCellData(2, 1);
		excel.getCellData(3, 1);
		excel.getCellData(4, 1);

	}

}
