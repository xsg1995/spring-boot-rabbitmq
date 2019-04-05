package com.xsg.config;

import com.xsg.constant.RabbitMQQueueConstant;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ的Queue队列配置
 */
@Configuration
public class RabbitMQQueueConfig {

    /**
     * 创建绑定到 AFanoutExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue AFanoutQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.A_FANOUT_QUEUE);
    }

    /**
     * 创建绑定到 AFanoutExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue AFanoutQueue2() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.A_FANOUT_QUEUE2);
    }

    /**
     * 创建绑定到 ADirectExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue ADirectQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.A_DIRECT_QUEUE);
    }

    /**
     * 创建绑定到 ADirectExchange 交换机的队列
     * @return
     */
    @Bean
    public Queue ADirectQueue2() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.A_DIRECT_QUEUE2);
    }

    /**
     * 创建绑定到 ATopicExchange 交换机的队列
     *
     * @return
     */
    @Bean
    public Queue ATopicQueue() {
        //传入队列名称
        return new Queue(RabbitMQQueueConstant.A_TOPIC_QUEUE);
    }

}