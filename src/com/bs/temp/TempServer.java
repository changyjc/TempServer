package com.bs.temp;
import javax.xml.ws.Endpoint;

public class TempServer {

	/**
	 * @param args
	 * main method can be wright as Template Method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "http://192.168.5.50:8888/temp";
		TempReader server = new TempReaderImpl();
		Endpoint.publish(address, server);
	}

}
