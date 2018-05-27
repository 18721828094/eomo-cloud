package com.prato.cloud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: Notice
 * @Description: 消息管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月30日
 * 
 */
@Entity
@Table(name = "eomo_aws_notice")
public class Notice {
	/** 消息编号 **/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/** 用户编号 **/
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	@Column(nullable = true)
	private Long collectId;
	@Column(nullable = false)
	private String type;
	@Column(nullable = true)
	private String operId;
	@Column(nullable = false)
	private String readed;
	@Column(nullable = false)
	private Long createTime;

}
