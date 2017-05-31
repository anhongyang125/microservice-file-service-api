package com.ubtechinc.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
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
 * @date 2017年6月2日下午4:15:14
 *
 * Copyright (C)2012-2017 深圳优必选科技 All rights reserved.
 */
public interface NativeFileService {
	//文件上传接口
		public  UploadResult upload(InputStream is, String filename,Integer userId);
		
		public  UploadResult upload(File file,Integer userId);
		
		//覆盖上传接口
		public  UploadResult reupload(InputStream is, String filename,String fileId);

		public  UploadResult reupload(File file,String fileId);
		
		
		//获取文件信息
		public Result<FileInfo> getFileInfo(String fileId);
		
		//文件下载接口
		
		//重命名操作
		public Result<Null> rename(String fileId,String newname);
		
		
		//复制文件  --将文件从文件key 复制到文件key2
		
		public Result<Null> copy(String fileId,String newname,Integer userId);
		
		//单个文件-删除文件
		public Result<Null> delete(String fileId);
		
		//批量文件删除文件
		public Result<List<FileResult>> delete(String[] fileIds);
		
		//批量操作 -- 批量拷贝，批量重命名等操作
		
		
		//根据文件关键字搜索功能  type =1 前缀，2 后缀  3 模糊
		public Result<Page<FileInfo>> getFileInfoByPage(int type,String keyword,int pageSize,int pageNum); 
}
