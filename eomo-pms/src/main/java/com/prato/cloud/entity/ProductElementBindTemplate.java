package com.prato.cloud.entity;

import java.util.Date;

/**
 * @ClassName: ProductElementBindTemplate
 * @Description: 产品模板管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月15日
 * 
 */
public class ProductElementBindTemplate {
	/** 主键 **/
	private Integer keyId;
	/** 产品属性ID **/
	private Integer settingId;
	/** 模板名称 **/
	private String templateName;
	/** 模板类型 **/
	private String templateType;
	/** 模板内容 **/
	private String templateContent;
	/** 排序 **/
	private Integer sort;
	/** 文件类型 **/
	private String fileType;

	/** 备注信息 **/
	private String remark;
	/** 创建时间 **/
	private Date createTime;
	/** 更新时间 **/
	private Date updateTime;
	/** 备用字段1 **/
	private String ext1;
	/** 备用字段2 **/
	private String ext2;
	/** 备用字段3 **/
	private String ext3;
	/** 备用字段4 **/
	private String ext4;
	/** 备用字段5 **/
	private String ext5;

	public Integer getKeyId() {
		return keyId;
	}

	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}

	public Integer getSettingId() {
		return settingId;
	}

	public void setSettingId(Integer settingId) {
		this.settingId = settingId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

	public String getExt4() {
		return ext4;
	}

	public void setExt4(String ext4) {
		this.ext4 = ext4;
	}

	public String getExt5() {
		return ext5;
	}

	public void setExt5(String ext5) {
		this.ext5 = ext5;
	}
}
