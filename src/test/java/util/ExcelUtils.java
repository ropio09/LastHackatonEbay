package util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/rocio/Desktop/StudentList.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(19);
        Cell cell = row.getCell(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int cellCount = sheet.getPhysicalNumberOfRows();
        for (int i = 1; i < rowCount; i++) {
            String name= sheet.getRow(i).getCell(0).toString();
            String group= sheet.getRow(i).getCell(1).toString();
            double groupNum= Double.parseDouble(group);
            if (groupNum%5==0){
                System.out.println(name);
            }
        }


        FileInputStream file1 = new FileInputStream("/Users/rocio/Desktop/StudentList.xlsx");
        Workbook workbook1 = new XSSFWorkbook(file1);
        Sheet sheet1 = workbook1.getSheet("Cars");
        Row row1 = sheet1.getRow(0);
        Cell cell1 = row1.getCell(1);
        int rowCount1 = sheet1.getPhysicalNumberOfRows();
        for (int j = 1; j < rowCount1; j++) {
            String model= sheet1.getRow(j).getCell(0).toString();
            String color= sheet1.getRow(j).getCell(2).toString();
            String year=sheet1.getRow(j).getCell(1).toString();
            double numYear=Double.parseDouble(year);
            if (numYear>2018 && color.equalsIgnoreCase("black")) {
                System.out.println(model+ " | "+ year.substring(0,year.length()-2)+" | "+color);
            }
        }








        }


}


//        System.out.println(cell.toString());


