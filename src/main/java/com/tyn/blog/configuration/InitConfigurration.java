package com.tyn.blog.configuration;

import com.tyn.blog.configuration.importconfiguration.Cat;
import com.tyn.blog.configuration.importconfiguration.Dog;
import com.tyn.blog.utils.QueueTest;
import com.tyn.blog.utils.TestAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Async;

import javax.sql.DataSource;

/**
 * @author wangl
 * @Description todo
 * @date 12/16/2019 5:19 PM
 */

@Import(Dog.class)  //使用import注入IOC
@SpringBootConfiguration
public class InitConfigurration implements ApplicationRunner {
    @Autowired
    private QueueTest queueTest;
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    @Autowired
    DataSource dataSource;
    @Autowired
    TestAsync async;


    @Override
    public void run(ApplicationArguments args) throws Exception {
//        queueTest.send1();
//        async.addPoll();
//        async.addTest();
        dog.d();
        cat.c();
        System.out.println("DATASOURCE = " + dataSource+dataSource.getClass());

    }
}
