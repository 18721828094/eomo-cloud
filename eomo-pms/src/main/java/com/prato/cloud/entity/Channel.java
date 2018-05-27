package com.prato.cloud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName: Channel
 * @Description: 渠道管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月4日
 * 
 */
@Entity
@Table(name = "eomo_aws_channel")
public class Channel {
	/**
	 * 渠道编号主键ID
	 */
	@Id
	@Column(name = "channel_id", nullable = false, length = 32, unique = true)
	@GeneratedValue(generator = "channel_id")
	@GenericGenerator(name = "channel_id", strategy = "identity")
	private Integer keyId;     
	
	/**
	 * 渠道名称
	 */
	@Column(name = "name", length = 32)
	private String name;      
	
	/**
	 * 渠道类型
	 */
	@Column(name = "type")
	private Integer type;      
	
	/**
	 * 渠道编码
	 */
	@Column(name = "code", length = 32)
	private String code;      
	
	/**
	 * 渠道描述
	 */
	@Column(name = "description", length = 80)
	private String description;
	
	/**
	 * 用户类型
	 */
	@Column
	private Integer userType; 
	
	/**
	 * 排序
	 */
	@Column(name = "sort_num")
    private Integer sortNum;    
	
	/**
	 * 渠道别名
	 */
	@Column(name = "alias", length = 32)
	private String alias;
	
	/**
	 * 发布类型 1：按受众发，2：按群组发，3按地区发
	 */
	@Column
	private Integer sendType;

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getSendType() {
		return sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}
}
