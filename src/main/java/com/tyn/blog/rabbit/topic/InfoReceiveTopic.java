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
        value = @Queue(value = "infoto",autoDelete = "true"),
        exchange =@Exchange(value = "firExTopic",type = ExchangeTypes.TOPIC),
        key = "*.log.info"
)
)
public class InfoReceiveTopic {
    @RabbitHandler
    public void diget(String ms){
        System.out.println("topic info======="+ms);
    }
}
