package net.schwabe.training;

import java.util.Date;

/**
 * This class gets serialized as JSON when returned from a service class
 * 
 * @author aschwabe
 */
public class AdditionResponse {

	public String TYPE = "AdditionResponse";
	public String ERROR = "0";
	public int RESULT = -1;
	public String TS = new Date().toString();

	public AdditionResponse(int res)
	{
		this.RESULT = res;
	}
}
