package com.ubtechinc.model;

/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年6月1日下午3:18:24
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public class Result<T> {

	public boolean success;
	
	public String msg;
	
	public T data;
	
	public Result() {
		this.success=true;
	}
	
	public Result(boolean success,String msg,T data ) {
		this.success=success;
		this.msg=msg;
		this.data=data;
	}

	
	public void setErrorMsg(String msg){
		this.success=false;
		this.msg = msg;
	}
	
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
