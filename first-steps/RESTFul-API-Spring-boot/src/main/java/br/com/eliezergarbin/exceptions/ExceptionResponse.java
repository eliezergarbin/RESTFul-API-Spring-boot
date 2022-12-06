package br.com.eliezergarbin.exceptions;

import java.io.Serializable;
import java.util.Date;


public class ExceptionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String message;
	private String edtails;
	
	public ExceptionResponse(Date timestamp, String message, String edtails) {
		this.timestamp = timestamp;
		this.message = message;
		this.edtails = edtails;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEdtails() {
		return edtails;
	}

	public void setEdtails(String edtails) {
		this.edtails = edtails;
	}
	
	
}
