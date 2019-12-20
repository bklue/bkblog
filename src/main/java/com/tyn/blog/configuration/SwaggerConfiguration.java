package com.tyn.blog.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangl
 * @Description todo
 * @date 12/17/2019 4:54 PM
 */
@SpringBootConfiguration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket swaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tyn.blog.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title("swagger测试")
                        .description("这是一次测试使用")
                        .version("1.0")
                        .contact(new Contact("tyn","com","tyn@tyn.com"))
                        .license("myLicence")
                        .licenseUrl("http://www.baidu.com")
                        .build()
                )
                .enable(true);
    }

}
