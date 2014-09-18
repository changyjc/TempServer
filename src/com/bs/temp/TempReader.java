package com.bs.temp;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface TempReader {
	@WebMethod
	public String[] getRecord();
}
