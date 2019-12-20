package com.tyn.blog.configuration;

import com.tyn.blog.utils.QueueTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 5:19 PM
 */
@SpringBootConfiguration
public class InitConfigurration implements ApplicationRunner {
    @Autowired
    private QueueTest queueTest;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        //queueTest.send1();

    }
}
