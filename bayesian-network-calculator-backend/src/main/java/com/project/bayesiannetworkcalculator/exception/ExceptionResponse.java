package com.project.bayesiannetworkcalculator.exception;

import java.time.ZonedDateTime;

public class ExceptionResponse {

	private ZonedDateTime timestamp;
	private Integer status;
	private String message;
	private String path;
	
	public ExceptionResponse() {}

	public ExceptionResponse(ZonedDateTime timestamp, Integer status, String message, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.path = path;
	}

	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
