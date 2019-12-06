package com.tyn.blog.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangl
 * @Description todo
 * @date 12/6/2019 10:53 AM
 */
@SpringBootConfiguration//The official recommendation
//@Configuration
public class TestConfiguration {

    @Bean(value = "my",initMethod = "init",destroyMethod = "destroy")//(name = "my"),作用类似，只能用一种
    // 这个注解是方法级别上的注解，主要添加在 @Configuration 或 @SpringBootConfiguration 注解的类，
    // 有时也可以添加在 @Component 注解的类
    public MyBean myBean (){
        return new MyBean();
    }
    public static class MyBean{
        MyBean(){
            System.out.println("create MyBean");
        }
        void init(){
            System.out.println("init MyBean");
        }
        void destroy(){
            System.out.println("destroy MyBean");
        }
    }
}
