package com.mypractice;






import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLOutput;

public class ReadExcelData  {

    public void printDataOfExcel(String filePath, String thirdRowDataofThisColum){
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(fis);

            XSSFSheet sheet =wb.getSheet("Sheet1");

            int filledFirstRowNum=getFilledFirstRow(sheet);
            int rowCount= sheet.getFirstRowNum();
            System.out.println(rowCount);
            int colCount=sheet.getRow(sheet.getFirstRowNum()).getLastCellNum();
            System.out.println(colCount);

            for(int i=filledFirstRowNum;i<=sheet.getLastRowNum();i++){
                System.out.println("printing row: "+i);
                for(int j=sheet.getRow(i).getFirstCellNum();j<colCount;j++){
                    System.out.print(sheet.getRow(i).getCell(j)+"\t");
                }

                System.out.println();
            }
            wb.close();
        } catch( Exception e){
           e.printStackTrace();
            }
        finally {
            System.out.println("finally executed");
        }
    }

    public int getFilledFirstRow(XSSFSheet sheet){
        for(Row row : sheet){
            for (Cell cell: row)
                if(cell.getCellType()!= CellType.BLANK){
                    return row.getRowNum();
            }
        }
        return -1;
    }


    public static void main(String[] args){



        String filePath= "C:\\Projects\\EclipseWorkspace\\StandAloneJavaPrograms\\src\\test\\resources\\TestExcel.xlsx";
        System.out.println(filePath);
        String thirdRowDataofThisColum="No of Student";

        ReadExcelData readExcelData=new ReadExcelData();

        readExcelData.printDataOfExcel(filePath);

    }

    public void printDataOfExcel(String filePath) {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Sheet2");

            int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
            int colCount = sheet.getRow(sheet.getFirstRowNum()).getLastCellNum()-sheet.getRow(sheet.getFirstRowNum()).getFirstCellNum();
            System.out.println("Row Count is "+rowCount+"\t Column count is "+colCount);

            for (int i = sheet.getFirstRowNum(); i <= sheet.getFirstRowNum()+rowCount; i++) {
                for (int j = sheet.getRow(i).getFirstCellNum(); j < sheet.getRow(i).getFirstCellNum()+colCount; j++) {
                    String cell=sheet.getRow(i).getCell(j).toString();
                    System.out.print(cell+"\t");
                }
                System.out.println("\n");
            }
            wb.close();

        } catch(Exception e){

            System.out.println(e);

        }


    }



}
