package com.bs.temp99;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface TempReader {
	@WebMethod
	public String[] getRecord();
}
