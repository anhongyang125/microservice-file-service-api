package com.ubtechinc.model;



/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年3月9日上午10:02:49
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public class UploadResult {

	private final boolean success;
	
	private final String url;
	
	private final String message;
	
	private final String fileName;
	
	
	public UploadResult( boolean success,String url,String message,String fileName) {
		this.success = success;
		this.url = url;
		this.message = message;
		this.fileName = fileName;
	}
	
	public static UploadResult successed(String url,String fileName){
		return new UploadResult(true,url,"上传成功",fileName);
	}
	
	public static UploadResult failed(String message,String fileName){
		return new UploadResult(false,null,message,fileName);
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
	
	
	
}
