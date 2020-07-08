package Day1;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
  @Test
  public void f() {
	  //create blank workbook
	  XSSFWorkbook wb=new XSSFWorkbook();
	  XSSFSheet sh=wb.createSheet();
	  sh.createRow(0).createCell(0).setCellValue("Name");
	  sh.createRow(0).createCell(1).setCellValue("Address");
	  sh.createRow(1).createCell(0).setCellValue("komal");
	  try
	  {
		  FileOutputStream fos=new FileOutputStream("C:\\Users\\komal.a.kumari\\Documents\\ExcelDemofile.xlsx");
		  wb.write(fos);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
  }
}
