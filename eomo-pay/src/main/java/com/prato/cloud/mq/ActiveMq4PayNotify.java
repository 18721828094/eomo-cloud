package com.prato.cloud.mq;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(MqConfig.Impl.ACTIVE_MQ)
public class ActiveMq4PayNotify {
}
