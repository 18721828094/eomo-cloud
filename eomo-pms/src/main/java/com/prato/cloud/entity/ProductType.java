package com.prato.cloud.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @ClassName: ProductType
 * @Description: 产品分类管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月15日
 * 
 */
@Entity
@Table(name = "eomo_aws_product_type")
public class ProductType {
	/**
	 * 产品类别编号
	 */
	private Integer keyId;
	/**
	 * 上级产品分类id
	 */
	private Integer parentId;
	/**
	 * 产品类型名称
	 */
	private String productName;
	/**
	 * 产品类型级别
	 */
	private String level;
	/**
	 * 排序序号
	 */
	private Integer sortNo;
	/**
	 * 部门id
	 */
	private Integer departmentId;

	/**
	 * 地区编码
	 */
	private String areaCode;
	
	private String remark;        // 备注信息
    private Date createTime;      // 创建时间
    private Date updateTime;      // 更新时间
    private String ext1;          // 备用字段1
    private String ext2;          // 备用字段2
    private String ext3;          // 备用字段3
    private String ext4;          // 备用字段4
    private String ext5;          // 备用字段5

	public Integer getKeyId() {
		return keyId;
	}

	public void setKeyId(Integer keyId) {
		this.keyId = keyId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
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
