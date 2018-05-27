package com.prato.cloud.entity;

import java.util.Date;

/**
 * @ClassName: IapReceipt
 * @Description: 支付凭据管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年5月25日
 *
 */
public class IapReceipt {
    /**
     * 支付订单号
     */
    private String payOrderId;

    /**
     * 商户ID
     */
    private String mchId;

    /**
     * IAP业务号
     */
    private String transactionId;

    /**
     * 处理状态:0-未处理,1-处理成功,-1-处理失败
     */
    private Byte status;

    /**
     * 处理次数
     */
    private Byte handleCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
