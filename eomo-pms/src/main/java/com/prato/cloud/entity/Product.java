/**
 * @Title: Product.java
 * @Package com.prato.flyme.entity
 * @Description: TODO
 * @author Albert Ge
 * @date 2016年5月28日 下午10:36:48
 * @version V1.2.0
 */
package com.prato.cloud.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
/**
 * @ClassName: Process
 * @Description: 产品管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月28日
 * 
 */
@Entity
@Table(name = "eomo_aws_product")
public class Product {
    private Long id;              // 产品编号
    private String title;         // 产品标题
    private String name;          // 产品名称
    private String type;          // 产品型号
    private Integer status;       // 产品状态
    private String memo;          // 产品备注

    private String remark;        // 备注信息

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
    private Date createTime;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    private String ext1;          // 备用字段1
    private String ext2;          // 备用字段2
    private String ext3;          // 备用字段3
    private String ext4;          // 备用字段4
    private String ext5;          // 备用字段5

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
