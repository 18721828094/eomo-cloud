/**
 * @Title: ChannelBindMe.java
 * @Package com.prato.eomo.entity
 * @Description: TODO
 * @author Albert Ge  
 * @date 2018年4月6日 下午7:40:16
 * @version 1.2.0
 */
package com.prato.cloud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: ChannelBindMe
 * @Description: 渠道绑定发布手段
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月6日
 * 
 */
@Entity
@Table(name = "eomo_aws_channel_method")
public class ChannelBindMe {
	/**
	 * 渠道绑定发布手段主键ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 32, unique = true, nullable = false)
	private Integer keyId;
	/**
	 * 渠道类型编码
	 */
	@Column
	private Integer channelType;
	
	/**
	 * 手段类型编码
	 */
	@Column
	private Integer methodType;

	public Integer getKeyId() {
		return keyId;
	}

	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}

	public Integer getChannelType() {
		return channelType;
	}

	public void setChannelType(Integer channelType) {
		this.channelType = channelType;
	}

	public Integer getMethodType() {
		return methodType;
	}

	public void setMethodType(Integer methodType) {
		this.methodType = methodType;
	}	
}
