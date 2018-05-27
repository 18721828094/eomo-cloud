package com.prato.cloud.service;

import java.util.Map;

/**
 *
 */
public interface NotifyPayService {
    Map doAliPayNotify(String jsonParam);

    Map doWxPayNotify(String jsonParam);

    Map sendBizPayNotify(String jsonParam);

    String handleAliPayNotify(Map params);

    String handleWxPayNotify(String xmlResult);
}
