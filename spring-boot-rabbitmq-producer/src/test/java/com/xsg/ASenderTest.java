package com.xsg;

import com.xsg.sender.ASender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ASender的测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ASenderTest {

    @Autowired
    private ASender aSender;

    /**
     * 以 Fanout 方式发送消息测试用例
     */
    @Test
    public void sendToAFanoutExchangeTest() {
        String msg = "Hello, I am A msg. — sendToAFanoutExchange";
        this.aSender.sendToAFanoutExchange(msg);
    }

    /**
     * 以 Direct 方式发送消息测试用例
     */
    @Test
    public void sendToADirectExchangeTest() {
        for (int i = 0; i < 10; i++) {
            String msg = "Hello, I am A msg. — sendToADirectExchange ";
            //第一个参数为送的消息
            //第二个参数为发送消息的路由key
            this.aSender.sendToADirectExchange(msg, "A.rk1");
        }
    }

    /**
     * 以 Topic 方式发送消息测试用例
     */
    @Test
    public void sendToATopicExchangeTest() {
        String msg = "Hello, I am A.b msg. — sendToATopicExchange ";
        //第一个参数为送的消息
        //第二个参数为发送消息的路由key
        this.aSender.sendToATopicExchange(msg, "A.b");
    }
}