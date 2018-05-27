package com.prato.cloud.entity;

import javax.persistence.*;

/**
 * @ClassName: ProductProperty
 * @Description: 产品属性管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月15日
 * 
 */
@Entity
@Table(name = "eomo_aws_product_property")
public class ProductProperty {
	/** 产品属性主键ID **/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer keyId;

	/** 产品名称 **/
	private String productName;

	/**
	 * 产品类型主键ID
	 */
	private Integer pdtTypeId;

	/** 主键 **/
	private String productCode;
	/** 主键 **/
	private String showinterface;
	/** 主键 **/
	private String postId;
	/** 主键 **/
	private Integer sortNo;
	/** 主键 **/
	private String exp1;
	private String exp2;
	private String exp3;
	private String exp4;
	private String exp5;
	private Integer isspecial;
	private String filetype;
	private Integer showway;
	private String producttype;
	private String cropid;
}
