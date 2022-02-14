package com.rakuten.StudentApp.Service;

public class ServerError extends RuntimeException{

	public ServerError(String msg) {
		super(msg);
	}
	
}
