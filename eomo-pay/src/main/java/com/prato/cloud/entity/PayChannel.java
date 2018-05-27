package com.prato.cloud.entity;

import java.util.Date;

/**
 * @ClassName: PayChannel
 * @Description: 支付渠道管理模块实体类
 * @author Albert Ge
 * @version 1.2.0
 * @date 2018年5月25日
 *
 */
public class PayChannel {
    /**
     * 渠道主键ID
     */
    private Integer id;

    /**
     * 渠道ID
     */
    private String channelId;

    /**
     * 渠道名称,如:alipay,wechat
     */
    private String channelName;

    /**
     * 渠道商户ID
     */
    private String channelMchId;

    /**
     * 商户ID
     */
    private String mchId;

    /**
     * 渠道状态,0-停止使用,1-使用中
     */
    private Byte state;

    /**
     * 配置参数,json字符串
     */
    private String param;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
