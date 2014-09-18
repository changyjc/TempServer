package com.bs.temp98;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;


public class TempCSV {

	/*default path is  "/home/bs/working/地区编码.csv"*/
	private String CsvFilePath = null;
	private CsvReader Reader = null;
	private ArrayList<String[]> CsvList =null;
	
	/*constructor*/
	public TempCSV(String Path) {
		
		CsvFilePath = Path;
		CsvList = new ArrayList<String[]>(); 
		
		try {
			Reader = new CsvReader(CsvFilePath, ',', Charset.forName("gbk"));
			Reader.readHeaders();
			while (Reader.readRecord()) {
				CsvList.add(Reader.getValues());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

     }            
    
    public ArrayList<String[]> getTempCsv() {
    	return CsvList;
    }
}
