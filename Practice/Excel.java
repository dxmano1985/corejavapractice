/*

Referring external jar apache poi.
Compile this program using classpath from .m2 folder from command line.

Ex:

C:\Users\dxman\Documents\Learning\Java\practice>javac -cp "C:\Users\dxman\.m2\repository\org\apache\poi\poi\4.0.0\*;C:\Users\dxman\.m2\repository\org\apache\poi\poi-ooxml\4.0.0\*" Excel.java

*/

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Excel{

public static void main(String []args){

System.out.print("Apache POI jar is in use");

}
}