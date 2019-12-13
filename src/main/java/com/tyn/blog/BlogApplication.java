package com.tyn.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lover
 */
@EnableAsync
@MapperScan({"com.tyn.blog.mapper.admin",""})
@SpringBootApplication//可以被以下几个注解代替：SpringBootConfiguration 表示 Spring Boot 的配置注解，
// EnableAutoConfiguration 表示自动配置，ComponentScan 表示 Spring Boot 扫描 Bean 的规则，比如扫描哪些包。
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
