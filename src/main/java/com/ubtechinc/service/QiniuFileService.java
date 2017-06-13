package com.ubtechinc.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.ubtechinc.entity.FileInfo;
import com.ubtechinc.model.FileResult;
import com.ubtechinc.model.Null;
import com.ubtechinc.model.QiniuPage;
import com.ubtechinc.model.Result;
import com.ubtechinc.model.UploadResult;

/**
 * @title 
 *
 * @author Young
 *
 * @date 2017年5月31日上午11:00:41
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public interface QiniuFileService {

	//文件上传接口
	public  UploadResult upload(InputStream is, String key,String project);
	
	public  UploadResult upload(File file,String key,String project);
	
	//覆盖上传接口
	public  UploadResult reupload(InputStream is, String key,String project);

	public  UploadResult reupload(File file,String key,String project);
	
	
	//获取文件信息
	public Result<FileInfo> getFileInfo(String key,String project);
	
	//文件下载接口
	
	//重命名操作
	public Result<Null> rename(String filename,String newname,String project);
	
	
	//复制文件  --将文件从文件key 复制到文件key2
	
	public Result<Null> copy(String filename,String newname,String project);
	
	//单个文件-删除文件
	public Result<Null> delete(String filename,String project);
	
	//批量文件删除文件
	public Result<List<FileResult>> delete(String[] filenames,String project);
	
	//批量操作 -- 批量拷贝，批量重命名等操作
	
	
	//根据文件前缀搜索功能
	public Result<QiniuPage> getFileInfoByPage(String marker,String prefix,int pageSize,String project); 
	
	
}
