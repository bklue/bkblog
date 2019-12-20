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
        value = @Queue(value = "error",autoDelete = "true"),
        exchange =@Exchange(value = "firEx",type = ExchangeTypes.DIRECT),//默认交换器类型为direct
        key = "error.routing")
)
public class ErrorReceive {
    //ms参数名要和发送的参数名对应
    @RabbitHandler
    public void diget(String ms){
        System.out.println("direct error========="+ms);
    }
}
