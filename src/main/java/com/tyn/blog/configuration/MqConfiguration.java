package com.tyn.blog.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 4:19 PM
 */
@SpringBootConfiguration
public class MqConfiguration {

    @Bean
    public Queue myQueue(){
        return new Queue("jiu");
    }
}
