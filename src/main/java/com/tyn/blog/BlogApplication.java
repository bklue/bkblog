package com.tyn.blog;

import com.tyn.blog.configuration.importconfiguration.EnableAnimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author lover
 */
@EnableAnimal  //开启自定义的enable
@EnableAsync
@EnableSwagger2
//引入tk.mybatis下的注解
//@MapperScan({"com.tyn.blog.dao.common"})
@EnableTransactionManagement
@EnableEurekaClient
@SpringBootApplication//可以被以下几个注解代替：SpringBootConfiguration 表示 Spring Boot 的配置注解，
// EnableAutoConfiguration 表示自动配置，ComponentScan 表示 Spring Boot 扫描 Bean 的规则，比如扫描哪些包。
public class BlogApplication {

    @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
        return new Object();
    }


    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
