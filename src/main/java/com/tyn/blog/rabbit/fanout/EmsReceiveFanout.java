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
        value = @Queue(value = "emsfa",autoDelete = "false"),//持久化，
        exchange = @Exchange(value = "MyFanout",type = ExchangeTypes.FANOUT)
))
@Component
public class EmsReceiveFanout {
    @RabbitHandler
    public void rec(String ms){
        System.out.println("广播接受邮件====="+ms);
        throw new RuntimeException();
    }
}
