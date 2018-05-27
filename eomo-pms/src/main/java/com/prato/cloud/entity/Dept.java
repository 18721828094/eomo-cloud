package com.prato.cloud.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: Dept
 * @Description: 部门管理模块实体类
 * @date 2018年3月13日
 */
@Entity
@Table(name = "eomo_aws_department")
public class Dept {
    /**
     * 部门编号主键ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer keyId;

    /**
     * 部门名称
     */
    @Column(name = "name", length = 32)
    private String name;

    /**
     * 父级部门
     */
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Dept.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "department_id")
    private Dept parent;

    /**
     * 下级部门列表
     */
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Dept.class, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "parent")
    @OrderBy("department_id ASC")
    private Set<Dept> children = new HashSet<Dept>();

    /**
     * 是否父级
     */
    @Column
    private Integer isParent;

    /**
     * 地区编码
     */
    @Column(name = "area_code", length = 32)
    private String areaCode;

    /**
     * 排序
     */
    @Column(name = "sort_num", length = 10)
    private Integer sortNum;

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

    /**
     * 一对多关联
     */
    @OneToMany(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "department")
    private Set<User> users;

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

    public Dept getParent() {
        return parent;
    }

    public void setParent(Dept parent) {
        this.parent = parent;
    }

    public Set<Dept> getChildren() {
        return children;
    }

    public void setChildren(Set<Dept> children) {
        this.children = children;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
