package com.prato.cloud.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: Area
 * @Description: 地区信息管理模块实体类
 * @date 2018年3月13日
 */
@Entity
@Table(name = "eomo_aws_area")
public class Area {
    /**
     * 地区编号主键ID
     */
    @Id
    @GeneratedValue(generator = "keyid")
    @GenericGenerator(name = "area_id", strategy = "identity")
    @Column(name = "area_id", unique = true, nullable = false)
    private Integer areaId;

    /**
     * 地区名称
     */
    @Column(name = "name", length = 32, nullable = false)
    private String name;

    /**
     * 地区父级编号
     */
    @Column(name = "parent_id", unique = true, nullable = false)
    private Integer parentId;

    /**
     * 地区编码
     */
    @Column(name = "code", length = 32, nullable = false)
    private String code;

    /**
     * 地区类型
     */
    @Column(name = "type", length = 32)
    private String type;

    /**
     * 排序，1 省级的序号，2 市级的序号，3 县级的序号，4 村级的序号
     */
    @Column(name = "sort_num")
    private Integer sortNum;

    /**
     * 经度
     */
    @Column(name = "longitude", length = 32)
    private String longitude;

    /**
     * 纬度
     */
    @Column(name = "latitude", length = 32)
    private String latitude;

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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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
