package com.capgemini.sweetcherry.model;

import lombok.Data;

@Data
public class Response<T> {
	private T data;
	private AppError error;

	public String getStatus() {
		return error != null ? "ERROR" : "SUCCESS";
	}
}
