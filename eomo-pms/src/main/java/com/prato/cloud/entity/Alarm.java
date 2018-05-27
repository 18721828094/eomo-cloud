package com.prato.cloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: Alarm
 * @Description: 告警管理模块实体类
 * @date 2018年4月4日
 */
@Entity
@Table(name = "eomo_aws_alarm")
public class Alarm {
    /**
     * 告警编号主键ID
     */
    @Id
    @Column(name = "keyid", nullable = false, length = 32, unique = true)
    @GeneratedValue(generator = "keyid")
    @GenericGenerator(name = "keyid", strategy = "identity")
    private Integer keyId;

    /**
     * 站点编号
     */
    @Column(name = "station_code", length = 32)
    private String stationCode;

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
     * 告警要素
     */
    @Column(name = "ele_type", length = 32)
    private String eleType;

    /**
     * 告警级别
     */
    @Column(name = "alarm_level", length = 32)
    private String alarmLevel;

    /**
     * 持续时间
     */
    @Column(name = "contunited_time", length = 32)
    private String contunitedTime;

    /**
     * 提醒方式
     */
    @Column(name = "remind_way", length = 32)
    private String remindWay;

    /**
     * 提醒内容
     */
    @Column(name = "remind_content")
    private String remindContent;

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
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
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

    public String getEleType() {
        return eleType;
    }

    public void setEleType(String eleType) {
        this.eleType = eleType;
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public String getContunitedTime() {
        return contunitedTime;
    }

    public void setContunitedTime(String contunitedTime) {
        this.contunitedTime = contunitedTime;
    }

    public String getRemindWay() {
        return remindWay;
    }

    public void setRemindWay(String remindWay) {
        this.remindWay = remindWay;
    }

    public String getRemindContent() {
        return remindContent;
    }

    public void setRemindContent(String remindContent) {
        this.remindContent = remindContent;
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
}
