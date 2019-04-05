package com.xsg.config;

import com.xsg.constant.RabbitMQExchangeConstant;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ的Exchange交换机配置
 */
@Configuration
public class RabbitMQExchangeConfig {

    /**
     * 以Fanout方式发送消息
     * 定义一个Exchange交换机，从该交换机接收消息
     * @return
     */
    @Bean
    public FanoutExchange AFanoutExchange() {
        //传入exchange交换机的名称 AFanoutExchange
        return new FanoutExchange(RabbitMQExchangeConstant.A_FANOUT_EXCHANGE);
    }

    /**
     * 以direct方式发送消息
     * 定义一个Exchange交换机，从该交换机接收消息
     * @return
     */
    @Bean
    public DirectExchange ADirectExchange() {
        //传入exchange交换机的名称 ADirectExchange
        return new DirectExchange(RabbitMQExchangeConstant.A_DIRECT_EXCHANGE);
    }

    /**
     * 以topic方式发送消息
     * 定义一个Exchange交换机，发送的消息将通过该交换机转发
     * @return
     */
    @Bean
    public TopicExchange ATopicExchange() {
        //传入exchange交换机的名称 ATopicExchange
        return new TopicExchange(RabbitMQExchangeConstant.A_TOPIC_EXCHANGE);
    }
}