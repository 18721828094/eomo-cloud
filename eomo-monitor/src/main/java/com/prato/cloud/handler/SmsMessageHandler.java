package com.prato.cloud.handler;

import com.prato.cloud.util.template.MobileMsgTemplate;

public interface SmsMessageHandler {
    /**
     * 执行入口
     *
     * @param mobileMsgTemplate 信息
     */
    public void execute(MobileMsgTemplate mobileMsgTemplate);

    /**
     * 数据校验
     *
     * @param mobileMsgTemplate 信息
     */
    public void check(MobileMsgTemplate mobileMsgTemplate);

    /**
     * 业务处理
     *
     * @param mobileMsgTemplate 信息
     * @return boolean
     */
    public boolean process(MobileMsgTemplate mobileMsgTemplate);

    /**
     * 失败处理
     *
     * @param mobileMsgTemplate 信息
     */
    public void fail(MobileMsgTemplate mobileMsgTemplate);
}
