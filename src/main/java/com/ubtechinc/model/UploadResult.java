package com.ubtechinc.model;

import java.io.Serializable;

/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年3月9日上午10:02:49
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public class UploadResult implements Serializable{

	private static final long serialVersionUID = 1L;

	private final boolean success;
	
	private final String url;
	
	private final String message;
	
	private final String fileName;
	
	private final String hash;
	
	public UploadResult( boolean success,String url,String message,String fileName, String hash) {
		this.success = success;
		this.url = url;
		this.message = message;
		this.fileName = fileName;
		this.hash = hash;
	}
	
	public static UploadResult successed(String url,String fileName, String hash){
		return new UploadResult(true,url,"上传成功",fileName, hash);
	}
	
	public static UploadResult failed(String message,String fileName){
		return new UploadResult(false,null,message,fileName, null);
	}

	
	
	public String getFileName() {
		return fileName;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getUrl() {
		return url;
	}

	public String getMessage() {
		return message;
	}

	public String getHash() {
		return hash;
	}
	
	
	
}
