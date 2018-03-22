package studyHall2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
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
              System.out.println("There are " + rows+" rows in inputsheet "+inputSheet.getSheetName()); 
               
                int currentRowIndex=0; if(rows>0)
		{
			Iterator<Row> rowIterator=inputSheet.iterator();
			while(rowIterator.hasNext())
			{
				int currentCellIndex=0;
				Iterator<Cell> cellIterator=rowIterator.next().cellIterator();
				while(cellIterator.hasNext())
				{
					  
					String cellData=cellIterator.next().toString();
					
					if(currentCellIndex==0)
					    outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					else
						
						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					currentCellIndex++;
				}
				currentRowIndex++;
			}
			System.out.println((currentRowIndex-1)+" rows added to outputsheet "+outputSheet.getSheetName());
			System.out.println();
		
		    }    
        }
}
