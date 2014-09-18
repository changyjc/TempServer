package com.bs.temp98;

import java.util.Timer;
import java.util.TimerTask;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class TempReaderImpl implements TempReader {


	private String Path = "/home/mm/working/cases/temp/temp.csv";
	private	TempCSV tempCSV = new TempCSV(Path);
	private	TempCSV ptempCSV = null;
	private String[] record;
	
	@Override
	@WebMethod
	public String[] getRecord() {
		
		// 通过计时器定时更新记录
		Timer timer = new Timer();
		timer.schedule(new RenewCSV(), 1000, 2000);
		
		int size = tempCSV.getTempCsv().size();
		record = tempCSV.getTempCsv().get(--size); 

		return this.record;
	}
	
	
	class RenewCSV extends TimerTask{
		public void run() {
		
			tempCSV = new TempCSV(Path);

		}
	}
}
