package com.tyn.blog.rabbit.topic;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/17/2019 11:19 AM
 */
@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "errorto",autoDelete = "true"),
        exchange =@Exchange(value = "firExTopic",type = ExchangeTypes.TOPIC),//默认交换器类型为diect
        key = "*.log.error")
)
public class ErrorReceiveTopic {
    //ms参数名要和发送的参数名对应
    @RabbitHandler
    public void diget(String ms){
        System.out.println("topic error========="+ms);
    }
}
