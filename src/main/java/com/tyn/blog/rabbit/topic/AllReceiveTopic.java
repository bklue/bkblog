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
        value = @Queue(value = "allto",autoDelete = "true"),
        exchange =@Exchange(value = "firExTopic",type = ExchangeTypes.TOPIC),//主题，规则匹配
        key = "*.log.*")//#表示匹配多个词
)
public class AllReceiveTopic {
    //ms参数名要和发送的参数名对应
    @RabbitHandler
    public void diget(String ms){
        System.out.println("all======="+ms);
    }
}
