package com.prato.cloud.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @ClassName: Praise
 * @Description: TODO
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月30日
 * 
 */
@Entity
@Table(name = "eomo_aws_praise")
public class Praise {
	/** 采集编号 **/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "collect_id",nullable = false)
	private Long collectId;
	
	/** 用户编号 **/
	@Column(name = "user_id", nullable = false)
	private Long userId;
	
	/** 备注信息 **/
	@Column(name = "remark")
	private String remark;
	
	/** 创建时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
	private Date createTime;

	/** 修改时间 **/
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	@JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
	private Date updateTime;
}
