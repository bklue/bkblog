package com.tyn.blog;

import com.tyn.blog.constant.Aliyun;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author lover
 */
@MapperScan({"com.tyn.blog.mapper.admin",""})
@SpringBootApplication//可以被以下几个注解代替：SpringBootConfiguration 表示 Spring Boot 的配置注解，
// EnableAutoConfiguration 表示自动配置，ComponentScan 表示 Spring Boot 扫描 Bean 的规则，比如扫描哪些包。
public class BlogApplication {
    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;

    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAppKey(appKey)
                .setAppSecret(appSecret)
                .setBucket(bucket)
                .setEndPoint(endPoint)
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
