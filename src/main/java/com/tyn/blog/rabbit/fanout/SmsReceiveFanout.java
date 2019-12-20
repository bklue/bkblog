package com.tyn.blog.rabbit.fanout;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/17/2019 3:31 PM
 */
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "smsfa",autoDelete = "true"),
        exchange = @Exchange(value = "MyFanout",type = ExchangeTypes.FANOUT)
))
@Component//需要注入随项目创建
public class SmsReceiveFanout {
    @RabbitHandler
    public void rec(String ms){
        System.out.println("广播接受消息====="+ms);
    }
}
