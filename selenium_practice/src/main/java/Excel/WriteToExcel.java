package Excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteToExcel {
    public static void main(String[] args) throws FileNotFoundException {


        FileOutputStream file = new FileOutputStream("D:\\clonework\\selenium_practice\\src\\main\\java\\Excel\\testwritedata.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("sheet1");
        XSSFRow ROW1=sheet.createRow(0);
        ROW1.createCell(1).setCellValue("shankar");

    }
}