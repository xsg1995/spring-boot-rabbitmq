package com.xsg.constant;

/**
 * 存放RabbitMQ中Exchange交换机常量
 */
public class RabbitMQExchangeConstant {

    /**
     * 以fanout方法接收A信息的Exchange名称
     */
    public static final String A_FANOUT_EXCHANGE = "AFanoutExchange";

    /**
     * 以direct方法发送A信息的Exchange名称
     */
    public static final String A_DIRECT_EXCHANGE = "ADirectExchange";

    /**
     * 以topic方法发送A信息的Exchange名称
     */
    public static final String A_TOPIC_EXCHANGE = "ATopicExchange";
}
