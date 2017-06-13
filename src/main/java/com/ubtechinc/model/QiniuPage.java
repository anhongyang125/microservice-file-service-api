package com.ubtechinc.model;

import java.io.Serializable;
import java.util.List;

import com.ubtechinc.entity.FileInfo;

/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年6月1日下午3:55:06
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public class QiniuPage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String marker;
	
	private int pageSize;
	
	private List<FileInfo> fileList;
	
	

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public List<FileInfo> getFileList() {
		return fileList;
	}

	public void setFileList(List<FileInfo> fileList) {
		this.fileList = fileList;
	}
	
	
}
