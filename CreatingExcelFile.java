package studyHall2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {
	public static void main(String[] args) throws IOException 
	{
		// Input file
		File inputFile = new File("sample-xlsx-file.xlsx");
		FileInputStream inputF = new FileInputStream(inputFile);
		XSSFWorkbook inputWorkbook = new XSSFWorkbook(inputF);
		int inputSheetCount=inputWorkbook.getNumberOfSheets();
		System.out.println("Number of input sheets: "+inputSheetCount);
		
		// Output file
		File outputFile=new File("CreatedExcelFile.xlsx");
		FileOutputStream outputF=new FileOutputStream(outputFile);
		
		// Create new workbook
		XSSFWorkbook outputWorkbook=new XSSFWorkbook();
		
		// Creating sheets
		for(int i=0;i<inputSheetCount;i++) 
                { 
                  XSSFSheet inputSheet=inputWorkbook.getSheetAt(i); 
                  String inputSheetName=inputWorkbook.getSheetName(i); 
                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 
                 copySheet(inputSheet,outputSheet); 
                }

               // Output sheets in new workbook
               outputWorkbook.write(outputF); 
              
               // Closing leaks 
               outputF.close(); 
               outputWorkbook.close();
               inputWorkbook.close();
	       }

           public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
           { 
              int rows=inputSheet.getLastRowNum(); 
              System.out.println("\nThere are " + rows+" rows in inputsheet "+inputSheet.getSheetName()); 
		
		    }    
        }
