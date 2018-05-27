package com.prato.cloud.entity;

import java.util.Date;

/**
 * @ClassName: MchNotify
 * @Description: 商户通知管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年5月25日
 *
 */
public class MchNotify {
    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 商户ID
     */
    private String mchId;

    /**
     * 商户订单号
     */
    private String mchOrderNo;

    /**
     * 订单类型:1-支付,2-转账,3-退款
     */
    private String orderType;

    /**
     * 通知地址
     */
    private String notifyUrl;

    /**
     * 通知次数
     */
    private Byte notifyCount;

    /**
     * 通知响应结果
     */
    private String result;

    /**
     * 通知状态,1-通知中,2-通知成功,3-通知失败
     */
    private Byte status;

    /**
     * 最后一次通知时间
     */
    private Date lastNotifyTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchOrderNo() {
        return mchOrderNo;
    }

    public void setMchOrderNo(String mchOrderNo) {
        this.mchOrderNo = mchOrderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Byte getNotifyCount() {
        return notifyCount;
    }

    public void setNotifyCount(Byte notifyCount) {
        this.notifyCount = notifyCount;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Date lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
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
