package com.prato.cloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * 配置websocket的支持 ,为了浏览器兼容性,我们使用sockJS
 */
@Configuration
public class WebSocketConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketConfiguration.class);
}
