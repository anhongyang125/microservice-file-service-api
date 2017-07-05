package com.ubtechinc.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author xiaohu.luo
 * @since 2017-06-29
 */
@TableName("t_file_owner")
public class FileOwner extends Model<FileOwner> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId("owner_id")
	private Integer ownerId;
    /**
     * 1,普通用户;2,群组;3,产品
     */
	@TableField("user_type")
	private Integer userType;
    /**
     * 根据user_type，给对应的id
     */
	@TableField("u_id")
	private Integer uId;
    /**
     * 可上传空间大小限制
     */
	@TableField("limit_size")
	private Long limitSize;
    /**
     * 用户来源
     */
	@TableField("from_product")
	private Integer fromProduct;
    /**
     * 是否删除
     */
	@TableField("is_delete")
	private Integer isDelete;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 创建人
     */
	private Integer creator;


	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getUId() {
		return uId;
	}

	public void setUId(Integer uId) {
		this.uId = uId;
	}

	public Long getLimitSize() {
		return limitSize;
	}

	public void setLimitSize(Long limitSize) {
		this.limitSize = limitSize;
	}

	public Integer getFromProduct() {
		return fromProduct;
	}

	public void setFromProduct(Integer fromProduct) {
		this.fromProduct = fromProduct;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	@Override
	protected Serializable pkVal() {
		return this.ownerId;
	}

}
