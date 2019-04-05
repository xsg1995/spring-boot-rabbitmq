package com.xsg.constant;

/**
 * 存放 RabbitMQ 中的 RoutKey 路由key的名称
 */
public class RabbitMQRoutKeyConstant {

    /**
     * 指定路由key 为 A.rk1， 表示接收路由key为 A.rk1 的消息
     */
    public static final String A_RK1 = "A.rk1";


    /**
     * 指定路由key 为 A.#， 表示接收路由key为 A. 开头的消息
     */
    public static final String A_ALL = "A.#";

}
