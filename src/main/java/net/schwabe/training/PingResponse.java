package net.schwabe.training;

import java.util.Date;

/**
 * This class gets serialized as JSON when returned from a service class
 * 
 * @author aschwabe
 */
public class PingResponse {

	public String TYPE = "PingResponse";
	public String ERROR = "0";
	public String MESSAGE = "";
	public String RESULT = "";
	public String TS = new Date().toString();

	public PingResponse(String msg)
	{
		this.RESULT = msg;
	}
}
