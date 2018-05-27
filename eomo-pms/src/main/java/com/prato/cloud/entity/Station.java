package com.prato.cloud.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
/**
 * @ClassName: Station
 * @Description: 站点管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2016年5月26日
 *
 */
@Entity
@Table(name = "eomo_aws_station")
public class Station {
    private Integer id;           // 站点主键id
    private String name;          // 站点名称
    private String number;        // 站点编号
    private String prefix;        // 站点编号前缀
    private Integer type;         // 站点类型[1国家基本站 2气象自动站 3人工观测站 4小气候站]
    private String longitude;     // 经度
    private String latitude;      // 纬度
    private String hight;         // 海拔
    private String areaCode;      // 地区编码
    private String province;      // 省
    private String city;          // 地市、州
    private String county;        // 县
    private String address;       // 详细地址
    private String linkMan;       // 联系人
    private String linkTel;       // 联系电话
    private String memo;          // 备注
    private Integer visible;      // 是否可视

    private String remark;        // 备注信息
    private Date createTime;      // 创建时间
    private Date updateTime;      // 更新时间
    private String ext1;          // 备用字段1
    private String ext2;          // 备用字段2
    private String ext3;          // 备用字段3
    private String ext4;          // 备用字段4
    private String ext5;          // 备用字段5

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
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
