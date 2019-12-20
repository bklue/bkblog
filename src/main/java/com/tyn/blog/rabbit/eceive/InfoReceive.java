package com.tyn.blog.rabbit.eceive;

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
        value = @Queue(value = "info",autoDelete = "true"),
        exchange =@Exchange(value = "firEx",type = ExchangeTypes.DIRECT),
        key = "info.routing"
)
)
public class InfoReceive {
    //发送和接受的参数类型要一致
    @RabbitHandler
    public void diget(String ms){
        System.out.println("direct info========"+ms);
    }
}
