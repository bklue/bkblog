package com.tyn.blog.configuration;

import com.tyn.blog.configuration.importconfiguration.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Import({Dog.class})
class TestConfigurationTest {
    @Test
    public void beanTest(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);
//        context.getBean("my");
//        ((AnnotationConfigApplicationContext) context).close();
//        context.getBean("myBean");
//        context.getBean("Dog");
//        context.getBean("Cat");

    }


}