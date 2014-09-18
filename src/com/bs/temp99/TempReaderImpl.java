package com.bs.temp99;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class TempReaderImpl implements TempReader {

	private String Path = "/home/mm/working/cases/temp/temp.csv";
	private TempCSV tempCSV= new TempCSV(Path);
	
	@Override
	@WebMethod
	public String[] getRecord() {
		// TODO Auto-generated method stub
		int size = tempCSV.getTempCsv().size();
		String[] record = tempCSV.getTempCsv().get(--size); 
		return record;
	}

}
