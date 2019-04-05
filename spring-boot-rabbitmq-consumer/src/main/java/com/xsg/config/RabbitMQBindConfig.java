package com.xsg.config;

import com.xsg.constant.RabbitMQRoutKeyConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ的Binding配置
 */
@Configuration
public class RabbitMQBindConfig {

    /**
     * 将 AFanoutQueue 队列绑定到 AFanoutExchange 交换机上
     * 用 AFanoutQueue 队列接收 AFanoutExchange 发送过来的消息
     * @param AFanoutQueue
     * @param AFanoutExchange
     * @return
     */
    @Bean
    public Binding bindAFanoutExchangeToAFanoutQueue(Queue AFanoutQueue, FanoutExchange AFanoutExchange) {
        return BindingBuilder.bind(AFanoutQueue).to(AFanoutExchange);
    }

    /**
     * 将 AFanoutQueue2 队列绑定到 AFanoutExchange 交换机上
     * 用 AFanoutQueue 队列接收 AFanoutExchange 发送过来的消息
     * @param AFanoutQueue2
     * @param AFanoutExchange
     * @return
     */
    @Bean
    public Binding bindAFanoutExchangeToAFanoutQueue2(Queue AFanoutQueue2, FanoutExchange AFanoutExchange) {
        return BindingBuilder.bind(AFanoutQueue2).to(AFanoutExchange);
    }

    /**
     * 将 ADirectQueue 队列绑定到 ADirectExchange交换机上
     * 用 ADirectQueue 队列接收 ADirectExchange 交换机发送过来的消息
     * 指定路由key 为 A.rk1
     * @param ADirectQueue
     * @param ADirectExchange
     * @return
     */
    @Bean
    public Binding bindADirectExchangeToADirectQueue(Queue ADirectQueue, DirectExchange ADirectExchange) {
        //以 direct 方式接收消息需要指定路由key，也就是with传入的参数
        return BindingBuilder.bind(ADirectQueue).to(ADirectExchange).with(RabbitMQRoutKeyConstant.A_RK1);
    }

    /**
     * 将 ADirectQueue2 队列绑定到 ADirectExchange交换机上
     * 用 ADirectQueue2 队列接收 ADirectExchange 交换机发送过来的消息
     * 指定路由key 为 A.rk1
     * @param ADirectQueue2
     * @param ADirectQueue2
     * @return
     */
    @Bean
    public Binding bindADirectExchangeToADirectQueue2(Queue ADirectQueue2, DirectExchange ADirectExchange) {
        //以 direct 方式接收消息需要指定路由key，也就是with传入的参数
        return BindingBuilder.bind(ADirectQueue2).to(ADirectExchange).with(RabbitMQRoutKeyConstant.A_RK1);
    }

    /**
     * 将 ATopicQueue 队列绑定到 ATopicExchange
     * 用 ATopicQueue 队列接收 ATopicExchange 交换机发送过来的消息
     * 指定路由key 为 A.#
     * @param ATopicQueue
     * @param ATopicExchange
     * @return
     */
    @Bean
    public Binding bindATopicExchangeToA_BTopicQueue(Queue ATopicQueue, TopicExchange ATopicExchange) {
        //以 direct 方式接收消息需要指定路由key，也就是with传入的参数
        return BindingBuilder.bind(ATopicQueue).to(ATopicExchange).with(RabbitMQRoutKeyConstant.A_ALL);
    }

}
