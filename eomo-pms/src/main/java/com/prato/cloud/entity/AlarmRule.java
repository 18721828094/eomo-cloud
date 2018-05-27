package com.prato.cloud.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

/**
 * @ClassName: AlarmRule
 * @Description: 告警规则管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月6日
 * 
 */
@Entity
@Table(name = "eomo_aws_alarm_rule")
public class AlarmRule {
	/**
	 * 告警规则编号主键ID
	 */
	@Id	
	@GeneratedValue(generator = "keyid")
	@GenericGenerator(name = "keyid", strategy = "identity")
	@Column(name = "keyid", unique = true, nullable = false)
	private Integer keyId;
	
	/**
	 * 告警类型   hour:小时告警 min:分钟告警 second:秒级告警
	 */
	@Column(name = "alarm_type", length = 32)
	private String alarmType;

	/**
	 * 告警级别    Blue 蓝色  Yellow 黄色  Orange 橙色  Red  红色
	 */
	@Column(name = "alarm_level", length = 32)
	private String alarmLevel;
	
	/**
	 * 统计周期  1小时  3小时  6小时
	 */
	@Column(name = "count_cycle", length = 32)
	private String countCycle;
	
	/**
	 * 地区编号
	 */
	@Column(name = "area_code", length = 32)
	private String areaCode;
	
	
	/**
	 * 告警要素 温度、降雨、风力
	 */
	@Column(name = "ele_type", length = 32)
	private String eleType;
	
	/**
	 * 运算符  eq:=  le:<=  ge>=  gt:> lt:<
	 */
	@Column(name = "operator", length = 32)
	private  String operator;
	
	/**
	 * 告警阀值起始值
	 */
	@Column(name = "start_threshold", length = 32)
	private String startAlarmThreshold;
	
	/**
	 * 告警阀值结束值
	 */
	@Column(name = "end_threshold", length = 32)
	private String endAlarmThreshold;
	
	/**
	 * 告警阀值
	 */
	@Column(name = "alarm_threshold", length = 32)
	private String alarmThreshold;
	
	/**
	 * 选择站点类型
	 */
	@Column(name = "station_type", length = 32)
	private Integer selectStationType;
	
	/**
	 * 告警持续时间 分钟
	 */
	@Column(name = "contunited_time", length = 32)
	private Integer  contunitedTime;
	
	/**
	 * 提醒方式
	 */
	@Column(name = "remind_way", length = 32)
	private Integer remindWay;
	
	/**
	 * 提醒内容
	 */
	@Column(name = "remind_content")
	private String remindContent;
	
	/**
	 * 是否启用  1 启用  0 禁用
	 */
	@Column(name = "enabled", length = 10)
	private Integer enabled;

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

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmLevel() {
		return alarmLevel;
	}

	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public String getCountCycle() {
		return countCycle;
	}

	public void setCountCycle(String countCycle) {
		this.countCycle = countCycle;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getEleType() {
		return eleType;
	}

	public void setEleType(String eleType) {
		this.eleType = eleType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getStartAlarmThreshold() {
		return startAlarmThreshold;
	}

	public void setStartAlarmThreshold(String startAlarmThreshold) {
		this.startAlarmThreshold = startAlarmThreshold;
	}

	public String getEndAlarmThreshold() {
		return endAlarmThreshold;
	}

	public void setEndAlarmThreshold(String endAlarmThreshold) {
		this.endAlarmThreshold = endAlarmThreshold;
	}

	public String getAlarmThreshold() {
		return alarmThreshold;
	}

	public void setAlarmThreshold(String alarmThreshold) {
		this.alarmThreshold = alarmThreshold;
	}

	public Integer getSelectStationType() {
		return selectStationType;
	}

	public void setSelectStationType(Integer selectStationType) {
		this.selectStationType = selectStationType;
	}

	public Integer getContunitedTime() {
		return contunitedTime;
	}

	public void setContunitedTime(Integer contunitedTime) {
		this.contunitedTime = contunitedTime;
	}

	public Integer getRemindWay() {
		return remindWay;
	}

	public void setRemindWay(Integer remindWay) {
		this.remindWay = remindWay;
	}

	public String getRemindContent() {
		return remindContent;
	}

	public void setRemindContent(String remindContent) {
		this.remindContent = remindContent;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
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
