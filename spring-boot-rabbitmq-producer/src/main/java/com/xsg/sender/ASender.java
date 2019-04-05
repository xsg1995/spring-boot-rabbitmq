package com.xsg.sender;

import com.xsg.constant.RabbitMQExchangeConstant;
import com.xsg.utils.DateUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用于发送A消息的sender
 */
@Component
public class ASender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息到 AFanoutExchange 交换机
     */
    public void sendToAFanoutExchange(String msg) {
        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();

        //第一个参数表示Exchange交换机的名称
        //第二个参数表示路由Key，Fanout方式路由消息不会处理路由key
        //第三个参数为要发送的消息
        this.rabbitTemplate.convertAndSend(
                RabbitMQExchangeConstant.A_FANOUT_EXCHANGE,
                "",
                content);
    }

    /**
     * 发送消息到 ADirectExchange 交换机
     */
    public void sendToADirectExchange(String msg, String routeKey) {
        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();

        //第一个参数表示Exchange交换机的名称
        //第二个参数表示路由Key，direct方式路由消息时，会将消息发送到绑定该路由key的队列上
        //第三个参数为要发送的消息
        this.rabbitTemplate.convertAndSend(
                RabbitMQExchangeConstant.A_DIRECT_EXCHANGE,
                routeKey,
                content);
    }

    /**
     * 发送消息到 ATopicExchange 交换机
     */
    public void sendToATopicExchange(String msg, String routeKey) {
        //要发送的信息拼上当前时间戳
        String content = msg + "\t" + DateUtils.getDateTime();
        //第一个参数表示Exchange交换机的名称
        //第二个参数表示路由Key，topic方式路由消息时，会将消息发送到匹配该路由key的队列上
        //第三个参数为要发送的消息
        this.rabbitTemplate.convertAndSend(
                RabbitMQExchangeConstant.A_TOPIC_EXCHANGE,
                routeKey,
                content);
    }

}