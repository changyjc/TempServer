package com.bs.temp;


public class RenewCSV extends Thread{
	
	private String Path = "/home/mm/working/cases/temp/temp.csv";
	private	TempCSV tempCSV = new TempCSV(Path);
	private String[] record;
	
	public void run() {
		tempCSV = new TempCSV(Path);
		int size = tempCSV.getTempCsv().size();
		record = tempCSV.getTempCsv().get(--size); 
	}
	
	public String[] getRecord(){
		return record;
	}
}