package com.xsg.constant;

/**
 * 存放 RabbitMQ 中的 Queue 队列的名称
 */
public class RabbitMQQueueConstant {

    /**
     * 指定绑定到 AFanoutExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    public static final String A_FANOUT_QUEUE = "AFanoutQueue";

    /**
     * 指定绑定到 AFanoutExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    public static final String A_FANOUT_QUEUE2 = "AFanoutQueue2";

    /**
     * 指定绑定到 ADirectExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    public static final String A_DIRECT_QUEUE = "ADirectQueue";

    /**
     * 指定绑定到 ADirectExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    public static final String A_DIRECT_QUEUE2 = "ADirectQueue2";

    /**
     * 指定绑定到 ATopicExchange 交换机的队列名称，用于接收 A 类型的信息
     */
    public static final String A_TOPIC_QUEUE = "A_TopicQueue";

}
