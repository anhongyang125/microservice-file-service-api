package com.ubtechinc.service;

import com.ubtechinc.entity.FileOwner;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaohu.luo
 * @since 2017-06-29
 */
public interface FileOwnerService extends IService<FileOwner> {
	
	/*获取已上传的文件的总的大小*/
	Long getCountOfSize();
}
