package Excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("D:\\clonework\\selenium_practice\\src\\main\\java\\Excel\\testdata.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
       XSSFSheet sheet=workbook.getSheet("sheet1");
       int totalrows=sheet.getLastRowNum();
      int totalcell= sheet.getRow(0).getLastCellNum();
      System.out.println(totalrows);
      System.out.println(totalcell);
      for(int r=0;r<=totalrows;r++){
          XSSFRow Currentrow=sheet.getRow(r);
          for(int c=0;c<totalcell;c++){
              XSSFCell currentcell=Currentrow.getCell(c);
              System.out.println(currentcell.toString()+"\t");
          }
          System.out.println();
      }
      workbook.close();
      file.close();


    }


}
