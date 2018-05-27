package com.prato.cloud.mq;

import org.springframework.context.annotation.Profile;

@Component
@Profile(MqConfig.Impl.RABBIT_MQ)
public class RabbitMq4PayNotify extends Mq4PayNotify {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private AmqpAdmin amqpAdmin;

    @PostConstruct
    public void init() {
        DirectExchange exchange = new DirectExchange(PAY_NOTIFY_EXCHANGE_NAME);
        exchange.setDelayed(true);
        Queue queue = new Queue(PAY_NOTIFY_QUEUE_NAME);
        Binding binding = BindingBuilder.bind(queue).to(exchange).withQueueName();
        amqpAdmin.declareExchange(exchange);
        amqpAdmin.declareQueue(queue);
        amqpAdmin.declareBinding(binding);
    }

    @Override
    public void send(String msg) {
        _log.info("发送MQ消息:msg={}", msg);
        rabbitTemplate.convertAndSend(PAY_NOTIFY_QUEUE_NAME, msg);
    }

    @Override
    public void send(String msg, long delay) {
        _log.info("发送MQ延时消息:msg={},delay={}", msg, delay);
        rabbitTemplate.convertAndSend(PAY_NOTIFY_EXCHANGE_NAME, PAY_NOTIFY_QUEUE_NAME, msg, new MessagePostProcessor() {
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setDelay((int) delay);
                return message;
            }
        });
    }

    @RabbitListener(queues = PAY_NOTIFY_QUEUE_NAME)
    public void onMessage(String msg) {
        receive(msg);
    }
}
