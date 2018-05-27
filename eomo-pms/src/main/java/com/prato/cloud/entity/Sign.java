package com.prato.cloud.entity;

import java.sql.Timestamp;
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
 * @ClassName: Sign
 * @Description: 用户签到签退管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年4月4日
 *
 */
@Entity
@Table(name = "eomo_aws_sign")
public class Sign {
    /**
     * 用户签到签退编号主键
     */
    @Id
    @Column(name = "keyid", nullable = false, length = 32, unique = true)
    @GeneratedValue(generator = "keyid")
    @GenericGenerator(name = "keyid", strategy = "identity")
    private Integer keyId;

    /**
     * 外键,关联用户主键
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 登录状态,1 在线(用户已经签到) 2 离线(用户已经签退)
     */
    @Column
    private Integer status;

    /**
     * 用户签到时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 用户签退时间
     */
    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 备注信息
     */
    @Column
    private String remark;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * 修改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
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

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
