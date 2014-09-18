package com.bs.temp;


import java.util.Timer;
import java.util.TimerTask;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public class TempReaderImpl implements TempReader {
	
	String[] record = null;
	RenewCSV renewCSV = new RenewCSV();
	public TempReaderImpl(){
		Timer timer = new Timer();
		timer.schedule(new NewThread(), 1000, 2000);
	}
	
	@Override
	@WebMethod
	public String[] getRecord() {
		return record;
	}
	
	class NewThread extends TimerTask{
		public void run() {
			renewCSV.resume();
			record = renewCSV.getRecord();
			System.out.println("test");
			renewCSV.interrupt();
			System.out.println("test2");

		}
	}

}
