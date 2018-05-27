/**
 * @Title: SendMethod.java
 * @Package com.prato.eomo.entity
 * @Description: TODO
 * @author Albert Ge  
 * @date 2018年4月4日 下午6:52:02
 * @version 1.2.0
 */
package com.prato.cloud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName: SendMethod
 * @Description: 发送手段管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月4日
 * 
 */
@Entity
@Table(name = "eomo_aws_sendmethod")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SendMethod {
	/**
	 * 发送手段主键ID
	 */
	@Id
	@Column(name = "keyid", nullable = false, length = 32, unique = true)
	@GeneratedValue(generator = "keyid")
	@GenericGenerator(name = "keyid", strategy = "identity")
	private Integer keyId;
	
	/**
	 * 发送手段名称
	 */
	@Column(name = "name", length = 32)
	private String name; 
}
