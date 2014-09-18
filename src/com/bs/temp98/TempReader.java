package com.bs.temp98;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface TempReader {
	@WebMethod
	public String[] getRecord();
}
