package com.tyn.blog.utils;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 5:03 PM
 */
@Component
public class QueueReceive {

    @RabbitListener(queues = "jiu")
    public void receiveTest(String msg){
        System.out.println("收到消息"+msg);
    }
}
