package com.ubtechinc.model;

import java.io.Serializable;

/**
 * @title 文件操作结果，比如删除操作等
 *
 * @author Young
 *
 * @date 2017年6月1日下午4:29:55
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public class FileResult implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer code;//200：执行成功，612 指定资源不存在或已被删除。
	
	private String filename;
	
	private String msg;

	public FileResult() {
	}
	public FileResult(Integer code,String filename,String msg) {
		this.code = code;
		this.filename = filename;
		this.msg  = msg;
	}
	
	
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
