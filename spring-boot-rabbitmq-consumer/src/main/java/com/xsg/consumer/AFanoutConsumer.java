package com.xsg.consumer;

import com.xsg.constant.RabbitMQQueueConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 用于接收A消息的消费者consumer
 */
@Component
//表示监听名称为 AFanoutQueue 的消息队列
@RabbitListener(queues = {RabbitMQQueueConstant.A_FANOUT_QUEUE})
public class AFanoutConsumer {

    /**
     * 定义接收消息处理逻辑
     * @param content
     */
    @RabbitHandler
    public void handler(String content) {
        System.out.println("AFanoutConsumer 接收到消息: " + content);
    }
}
