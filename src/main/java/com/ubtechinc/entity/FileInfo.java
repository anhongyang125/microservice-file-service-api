package com.ubtechinc.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年6月1日上午11:13:04
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
@TableName("ybx_file_info")
public class FileInfo {
	
	   @TableId(type=IdType.INPUT)
		private String id;
	  
	  	private String filename;
	  	
	    private long fsize;
	    
	    private String filepath;
	    
	    private String putTime;
	    
	    private String mimeType;
	    
	    private Integer putUser;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFilename() {
			return filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public long getFsize() {
			return fsize;
		}

		public void setFsize(long fsize) {
			this.fsize = fsize;
		}

		public String getFilepath() {
			return filepath;
		}

		public void setFilepath(String filepath) {
			this.filepath = filepath;
		}

		public String getPutTime() {
			return putTime;
		}

		public void setPutTime(String putTime) {
			this.putTime = putTime;
		}

		public String getMimeType() {
			return mimeType;
		}

		public void setMimeType(String mimeType) {
			this.mimeType = mimeType;
		}

		public Integer getPutUser() {
			return putUser;
		}

		public void setPutUser(Integer putUser) {
			this.putUser = putUser;
		}

		
	    
	    
	    
	    
}
