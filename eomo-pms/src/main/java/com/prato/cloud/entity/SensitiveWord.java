package com.prato.cloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName: SensitiveWord
 * @Description: 敏感词管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月7日
 * 
 */
@Entity
@Table(name = "eomo_aws_sensitiveword")
public class SensitiveWord {
	/**
	 * 敏感词主键ID
	 */
	@Id
	@Column(name = "keyid", nullable = false, length = 32, unique = true)
	@GeneratedValue(generator = "keyid")
	@GenericGenerator(name = "keyid", strategy = "identity")
	private Integer keyId;
	
	/**
	 * 敏感词名称
	 */
	@Column(name = "name", length = 32)
	private String name;

	/**
	 * 是否启用 1：启用 0：不启用
	 */
	@Column
	private Integer enabled;
	
	/**
	 * 备注信息
	 */
	@Column
	private String remark;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	private Date createTime;
	
	/**
	 * 修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time")
	private Date updateTime;
	
	/**
	 * 备用字段1
	 */
	@Column
	private String ext1;
	
	/**
	 * 备用字段2
	 */
	@Column
	private String ext2;
	
	/**
	 * 备用字段3
	 */
	@Column
	private String ext3;
	
	/**
	 * 备用字段4
	 */
	@Column
	private String ext4;
	
	/**
	 * 备用字段5
	 */
	@Column
	private String ext5;

	public Integer getKeyId() {
		return keyId;
	}

	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
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
