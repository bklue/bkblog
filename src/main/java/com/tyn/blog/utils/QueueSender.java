package com.tyn.blog.utils;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 4:33 PM
 */
@Component
public class QueueSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sendTest(){
        String msg = "hello,"+new Date();
        rabbitTemplate.convertAndSend("jiu",msg);
    }
}
