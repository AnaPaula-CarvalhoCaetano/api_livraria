package com.api.livraria.resources.exceptions;

public class StandardError {

	private Long status;
	private Long timestamp;
	private String message;

	public StandardError() {
		super();

	}

	public StandardError(Long status, Long timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
