package com.ubtechinc.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 文件映射
 * </p>
 *
 * @author xiaohu.luo
 * @since 2017-06-29
 */
@TableName("t_file_mapping")
public class FileMapping extends Model<FileMapping> {

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 文件key
     */
	private String key;
    /**
     * 文件地址
     */
	private String url;
    /**
     * 文件HASH
     */
	private String hash;
    /**
     * 文件大小
     */
	private Long size;
    /**
     * 父文件(所属目录)
     */
	private Integer parent;
    /**
     * 是否目录
     */
	private Integer folder;
    /**
     * 文件名
     */
	private String filename;
    /**
     * 扩展名
     */
	private String extention;
    /**
     * MIME类型
     */
	private String mimetype;
    /**
     * 时长
     */
	private Integer duration;
    /**
     * 下载量
     */
	private Integer downloads;
    /**
     * 上传时间
     */
	private Date uploaded;
    /**
     * 创建者
     */
	private Integer creator;
	private Date updated;
    /**
     * 更新人
     */
	private Integer updater;
	@TableField("owner_id")
	private Integer ownerId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public Integer getFolder() {
		return folder;
	}

	public void setFolder(Integer folder) {
		this.folder = folder;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getDownloads() {
		return downloads;
	}

	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}

	public Date getUploaded() {
		return uploaded;
	}

	public void setUploaded(Date uploaded) {
		this.uploaded = uploaded;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getUpdater() {
		return updater;
	}

	public void setUpdater(Integer updater) {
		this.updater = updater;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
